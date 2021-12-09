/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author pc
 */

@Named (value="loginController")
@SessionScoped

public class LoginController implements Serializable{
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String validar(){
        if (username.equals("usuario saed") && password.equals("tigre")) {
            return "inicio?faces-redirect=true";
        } else {
            return (null);
        }

    }
}