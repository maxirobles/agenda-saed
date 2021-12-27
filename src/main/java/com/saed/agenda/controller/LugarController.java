/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.controller;

import com.saed.agenda.entities.Lugar;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author pc
 */
@Named(value = "lugarController")
@javax.faces.view.ViewScoped
public class LugarController implements java.io.Serializable{

   private Lugar lugar = new Lugar();
   
    

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
}
