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
@Table(name = "participantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Participantes.findAll", query = "SELECT p FROM Participantes p"),
    @NamedQuery(name = "Participantes.findByCodPartic", query = "SELECT p FROM Participantes p WHERE p.codPartic = :codPartic"),
    @NamedQuery(name = "Participantes.findByNombreParticipante", query = "SELECT p FROM Participantes p WHERE p.nombreParticipante = :nombreParticipante"),
    @NamedQuery(name = "Participantes.findByApellidoParticipante", query = "SELECT p FROM Participantes p WHERE p.apellidoParticipante = :apellidoParticipante"),
    @NamedQuery(name = "Participantes.findByTelefonoParticipante", query = "SELECT p FROM Participantes p WHERE p.telefonoParticipante = :telefonoParticipante"),
    @NamedQuery(name = "Participantes.findByMailParticipante", query = "SELECT p FROM Participantes p WHERE p.mailParticipante = :mailParticipante")})
public class Participantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codPartic")
    private Integer codPartic;
    @Size(max = 50)
    @Column(name = "nombreParticipante")
    private String nombreParticipante;
    @Size(max = 50)
    @Column(name = "ApellidoParticipante")
    private String apellidoParticipante;
    @Column(name = "TelefonoParticipante")
    private Integer telefonoParticipante;
    @Size(max = 50)
    @Column(name = "mailParticipante")
    private String mailParticipante;

    public Participantes() {
    }

    public Participantes(Integer codPartic) {
        this.codPartic = codPartic;
    }

    public Integer getCodPartic() {
        return codPartic;
    }

    public void setCodPartic(Integer codPartic) {
        this.codPartic = codPartic;
    }

    public String getNombreParticipante() {
        return nombreParticipante;
    }

    public void setNombreParticipante(String nombreParticipante) {
        this.nombreParticipante = nombreParticipante;
    }

    public String getApellidoParticipante() {
        return apellidoParticipante;
    }

    public void setApellidoParticipante(String apellidoParticipante) {
        this.apellidoParticipante = apellidoParticipante;
    }

    public Integer getTelefonoParticipante() {
        return telefonoParticipante;
    }

    public void setTelefonoParticipante(Integer telefonoParticipante) {
        this.telefonoParticipante = telefonoParticipante;
    }

    public String getMailParticipante() {
        return mailParticipante;
    }

    public void setMailParticipante(String mailParticipante) {
        this.mailParticipante = mailParticipante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPartic != null ? codPartic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Participantes)) {
            return false;
        }
        Participantes other = (Participantes) object;
        if ((this.codPartic == null && other.codPartic != null) || (this.codPartic != null && !this.codPartic.equals(other.codPartic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.saed.agenda.entities.Participantes[ codPartic=" + codPartic + " ]";
    }
    
}
