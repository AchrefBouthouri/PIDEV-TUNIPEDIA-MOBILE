/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipedia.sevices;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.l10n.SimpleDateFormat;
import com.codename1.ui.events.ActionListener;
import com.tunipedia.entities.Person;
import com.tunipedia.utils.Statics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mac
 */
public class ServicePerson {
        public ArrayList<Person> persons;
    
    public static ServicePerson instance=null;
    public boolean resultOK;
    private ConnectionRequest req;

    private ServicePerson() {
         req = new ConnectionRequest();
    }

    public static ServicePerson getInstance() {
        if (instance == null) {
            instance = new ServicePerson();
        }
        return instance;
    }
    
       public ArrayList<Person> parsePersons(String jsonText){
        try {
            persons=new ArrayList<>();
            JSONParser j = new JSONParser();
            Map<String,Object> personListJson = j.parseJSON(new CharArrayReader(jsonText.toCharArray()));
            
            List<Map<String,Object>> list = (List<Map<String,Object>>)personListJson.get("root");
            for(Map<String,Object> obj : list){
                Person p = new Person();
                p.setId((int)Float.parseFloat(obj.get("id").toString()));
                //p.setAvatar(((int)Float.parseFloat(obj.get("Avatar.id").toString())));
                p.setAvatar(0);
                p.setFullName(obj.get("FullName").toString());
                p.setEmail(obj.get("Email").toString());
                p.setPassword(obj.get("Password").toString());
                if (obj.get("Gender")==null)
                    p.setGender("null");
                else
                    p.setGender(obj.get("Gender").toString());
                //p.setGender(obj.get("Gender").toString());
                
                 if (obj.get("Nationalite")==null)
                    p.setNationalite("null");
                else
                    p.setNationalite(obj.get("Nationalite").toString());
                //p.setNationalite(obj.get("Nationalite").toString());
                
                p.setRole(obj.get("Role").toString());
                
                if (obj.get("HasPlaces")==null)
                    p.setHasPlaces(false);
                else
                    p.setHasPlaces(true);
                
                 if (obj.get("IsPartner")==null)
                    p.setIsPartner(false);
                else
                    p.setIsPartner(true);
                  if (obj.get("Balance")==null)
                    p.setBalance(0.0f);
                else
                    p.setBalance(Float.parseFloat(obj.get("Balance").toString()));
                
              /*  String DateConverter = obj.get("CreatedAt").toString().substring(obj.get("CreatedAt").toString().indexOf("timestamp") + 10, obj.get("HasPlaces").toString().lastIndexOf('}'));
                Date currentTime = new Date(Double.valueOf(DateConverter).longValue()*1000);
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
                String dateString = formatter.format(currentTime);
                p.setCreatedAt(dateString);
                
                p.setCreatedAt(DateConverter);*/
                persons.add(p);
            } 
        } catch (IOException ex) {
            System.out.println(ex.getMessage()); 
        }
        return persons;
    }
    
        public ArrayList<Person> getAllPersons(){
        req = new ConnectionRequest();
        String url = Statics.BASE_URL+"/person/crud/displayPerson";
        System.out.println("===>"+url);
        req.setUrl(url);
        req.setPost(false);
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                persons = parsePersons(new String(req.getResponseData()));
                req.removeResponseListener(this);
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return persons;
    }
}
