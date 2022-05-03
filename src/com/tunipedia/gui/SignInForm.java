/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipedia.gui;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;

/**
 *
 * @author mac
 */
public class SignInForm extends Form {
    Form current;

    public SignInForm(Resources res) {
        current=this; //Back 
        setTitle("TuniPedia");
        final Label Logo = new Label(res.getImage("Login.png"));         
        TextField username = new TextField("", "Username", 20, TextField.ANY);
        TextField password = new TextField("", "Password", 20, TextField.PASSWORD);
        username.setSingleLineTextArea(false);
        password.setSingleLineTextArea(false);
        Button signIn = new Button("Sign In");
        Button signUp = new Button("Sign Up");
        //signUp.addActionListener(e -> new SignUpForm(res).show());
        //signUp.setUIID("Link");
        Label doneHaveAnAccount = new Label("Don't have an account?");
        
        
       
        addAll(Logo,username,password,signIn,signUp);
    }
    
    
}
