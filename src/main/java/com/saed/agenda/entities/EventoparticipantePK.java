/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author pc
 */
@Embeddable
public class EventoparticipantePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "numEvento")
    private int numEvento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codPartic")
    private int codPartic;

    public EventoparticipantePK() {
    }

    public EventoparticipantePK(int numEvento, int codPartic) {
        this.numEvento = numEvento;
        this.codPartic = codPartic;
    }

    public int getNumEvento() {
        return numEvento;
    }

    public void setNumEvento(int numEvento) {
        this.numEvento = numEvento;
    }

    public int getCodPartic() {
        return codPartic;
    }

    public void setCodPartic(int codPartic) {
        this.codPartic = codPartic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numEvento;
        hash += (int) codPartic;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventoparticipantePK)) {
            return false;
        }
        EventoparticipantePK other = (EventoparticipantePK) object;
        if (this.numEvento != other.numEvento) {
            return false;
        }
        if (this.codPartic != other.codPartic) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.saed.agenda.entities.EventoparticipantePK[ numEvento=" + numEvento + ", codPartic=" + codPartic + " ]";
    }
    
}
