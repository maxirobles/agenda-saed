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
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author pc
 */
@Named(value = "eventoController")
@RequestScoped
public class EventoController {

  @EJB
  private EventosFacadeLocal eventoEJB;
  private Eventos evento = new Eventos();

  public Eventos getEvento() {
    return evento;
  }

  public void setEvento(Eventos evento) {
    this.evento = evento;
  }

  public void addEvent() {
    System.out.println("Se invoca");
    try {
      eventoEJB.create(evento);
      //evento = new Evento();
      //aqui debo poner un println para que avise que el evento se agrego corretamente
    } catch (Exception e) {
      System.out.println("Ocurrio un error: " + e);
    }

  }

  public String remove() {

    try {
      eventoEJB.create(evento);
      evento = new Eventos();
      //aqui debo poner un println para que avise que el evento se elimino corretamente
    } catch (Exception e) {

      //aqui debo poner un println para que avise que el evento no se pudo elimnar
    }

    return null;
  }

}
