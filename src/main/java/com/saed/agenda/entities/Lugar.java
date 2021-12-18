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
@Table(name = "lugar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lugar.findAll", query = "SELECT l FROM Lugar l"),
    @NamedQuery(name = "Lugar.findByCodLugar", query = "SELECT l FROM Lugar l WHERE l.codLugar = :codLugar"),
    @NamedQuery(name = "Lugar.findByNombreLugar", query = "SELECT l FROM Lugar l WHERE l.nombreLugar = :nombreLugar"),
    @NamedQuery(name = "Lugar.findByCantPersonas", query = "SELECT l FROM Lugar l WHERE l.cantPersonas = :cantPersonas"),
    @NamedQuery(name = "Lugar.findByEstado", query = "SELECT l FROM Lugar l WHERE l.estado = :estado")})
public class Lugar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codLugar")
    private Integer codLugar;
    @Size(max = 50)
    @Column(name = "NombreLugar")
    private String nombreLugar;
    @Column(name = "cantPersonas")
    private Integer cantPersonas;
    @Column(name = "Estado")
    private Boolean estado;

    public Lugar() {
    }

    public Lugar(Integer codLugar) {
        this.codLugar = codLugar;
    }

    public Integer getCodLugar() {
        return codLugar;
    }

    public void setCodLugar(Integer codLugar) {
        this.codLugar = codLugar;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codLugar != null ? codLugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugar)) {
            return false;
        }
        Lugar other = (Lugar) object;
        if ((this.codLugar == null && other.codLugar != null) || (this.codLugar != null && !this.codLugar.equals(other.codLugar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.saed.agenda.entities.Lugar[ codLugar=" + codLugar + " ]";
    }
    
}
