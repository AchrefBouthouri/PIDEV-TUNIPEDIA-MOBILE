/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipedia.gui;

import com.codename1.components.SpanLabel;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.tunipedia.sevices.ServicePerson;

/**
 *
 * @author Achref Bouthouri
 */
public class ListPersonsForm extends Form {
        public ListPersonsForm() {
        setTitle("List Persons");

        SpanLabel sp = new SpanLabel();
        sp.setText(ServicePerson.getInstance().getAllPersons().toString());
        add(sp);
        //getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e -> previous.showBack());
    }
    
}
