/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.controller;

import com.saed.agenda.ejb.InstitucionFacade;
import com.saed.agenda.entities.Institucion;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author pc
 */
@Named(value = "institucionController")
@javax.faces.view.ViewScoped
public class InstitucionController implements java.io.Serializable {

    @EJB
    private InstitucionFacade institucionEJB;
    private Institucion institucion = new Institucion();

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public String create() {

        try {
             institucionEJB.create(institucion);
             institucion = new Institucion();
        } catch (Exception e) {
        }

        return null;

    }

    public String remove() {

        try {

        } catch (Exception e) {
        }
        return null;

    }

    public String edit() {

        try {

        } catch (Exception e) {
        }
        return null;

    }

}
