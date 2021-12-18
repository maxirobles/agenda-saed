/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.controller;

import com.saed.agenda.ejb.EventosFacadeLocal;
import com.saed.agenda.entities.Eventos;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author pc
 */
@Named(value = "eventoController")
@javax.faces.view.ViewScoped

public class EventoController implements java.io.Serializable {

    @EJB
    private EventosFacadeLocal eventoEJB;
    private Eventos evento = new Eventos();

    public Eventos getEvento() {
        return evento;
    }

    public void setEvento(Eventos evento) {
        this.evento = evento;
    }

    public String create() {
        try {
            eventoEJB.create(evento);
            evento = new Eventos();
        } catch (Exception e) {
        }

        return null;
    }
}
