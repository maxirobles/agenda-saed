/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "eventoparticipante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eventoparticipante.findAll", query = "SELECT e FROM Eventoparticipante e"),
    @NamedQuery(name = "Eventoparticipante.findByNumEvento", query = "SELECT e FROM Eventoparticipante e WHERE e.eventoparticipantePK.numEvento = :numEvento"),
    @NamedQuery(name = "Eventoparticipante.findByCodPartic", query = "SELECT e FROM Eventoparticipante e WHERE e.eventoparticipantePK.codPartic = :codPartic")})
public class Eventoparticipante implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EventoparticipantePK eventoparticipantePK;

    public Eventoparticipante() {
    }

    public Eventoparticipante(EventoparticipantePK eventoparticipantePK) {
        this.eventoparticipantePK = eventoparticipantePK;
    }

    public Eventoparticipante(int numEvento, int codPartic) {
        this.eventoparticipantePK = new EventoparticipantePK(numEvento, codPartic);
    }

    public EventoparticipantePK getEventoparticipantePK() {
        return eventoparticipantePK;
    }

    public void setEventoparticipantePK(EventoparticipantePK eventoparticipantePK) {
        this.eventoparticipantePK = eventoparticipantePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventoparticipantePK != null ? eventoparticipantePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventoparticipante)) {
            return false;
        }
        Eventoparticipante other = (Eventoparticipante) object;
        if ((this.eventoparticipantePK == null && other.eventoparticipantePK != null) || (this.eventoparticipantePK != null && !this.eventoparticipantePK.equals(other.eventoparticipantePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.saed.agenda.entities.Eventoparticipante[ eventoparticipantePK=" + eventoparticipantePK + " ]";
    }
    
}
