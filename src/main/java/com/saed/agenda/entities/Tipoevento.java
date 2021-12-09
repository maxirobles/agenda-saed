/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "tipoevento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoevento.findAll", query = "SELECT t FROM Tipoevento t"),
    @NamedQuery(name = "Tipoevento.findByNroEvento", query = "SELECT t FROM Tipoevento t WHERE t.nroEvento = :nroEvento"),
    @NamedQuery(name = "Tipoevento.findByNombreEvento", query = "SELECT t FROM Tipoevento t WHERE t.nombreEvento = :nombreEvento")})
public class Tipoevento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "nroEvento", nullable = false)
    private Integer nroEvento;
    @Size(max = 50)
    @Column(name = "nombreEvento", length = 50)
    private String nombreEvento;

    public Tipoevento() {
    }

    public Tipoevento(Integer nroEvento) {
        this.nroEvento = nroEvento;
    }

    public Integer getNroEvento() {
        return nroEvento;
    }

    public void setNroEvento(Integer nroEvento) {
        this.nroEvento = nroEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroEvento != null ? nroEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoevento)) {
            return false;
        }
        Tipoevento other = (Tipoevento) object;
        if ((this.nroEvento == null && other.nroEvento != null) || (this.nroEvento != null && !this.nroEvento.equals(other.nroEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.saed.agenda.entities.Tipoevento[ nroEvento=" + nroEvento + " ]";
    }
    
}
