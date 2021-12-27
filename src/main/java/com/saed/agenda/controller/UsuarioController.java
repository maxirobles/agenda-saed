/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.controller;

import com.saed.agenda.ejb.UsuariosFacadeLocal;
import com.saed.agenda.entities.Usuarios;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author pc
 */
@Named(value = "usuarioController")
@javax.faces.view.ViewScoped

public class UsuarioController implements java.io.Serializable{

   private Usuarios usuario =new Usuarios();
    
   @EJB
    private UsuariosFacadeLocal usuarioEJB;
   

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
}
