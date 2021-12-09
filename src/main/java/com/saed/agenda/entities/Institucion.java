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
@Table(name = "institucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Institucion.findAll", query = "SELECT i FROM Institucion i"),
    @NamedQuery(name = "Institucion.findByCodInst", query = "SELECT i FROM Institucion i WHERE i.codInst = :codInst"),
    @NamedQuery(name = "Institucion.findByNombreInst", query = "SELECT i FROM Institucion i WHERE i.nombreInst = :nombreInst"),
    @NamedQuery(name = "Institucion.findByDireccionInst", query = "SELECT i FROM Institucion i WHERE i.direccionInst = :direccionInst"),
    @NamedQuery(name = "Institucion.findByTelefonoInst", query = "SELECT i FROM Institucion i WHERE i.telefonoInst = :telefonoInst"),
    @NamedQuery(name = "Institucion.findByCodPostal", query = "SELECT i FROM Institucion i WHERE i.codPostal = :codPostal")})
public class Institucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codInst", nullable = false)
    private Integer codInst;
    @Size(max = 50)
    @Column(name = "nombreInst", length = 50)
    private String nombreInst;
    @Size(max = 50)
    @Column(name = "direccionInst", length = 50)
    private String direccionInst;
    @Column(name = "telefonoInst")
    private Integer telefonoInst;
    @Column(name = "cod_postal")
    private Integer codPostal;

    public Institucion() {
    }

    public Institucion(Integer codInst) {
        this.codInst = codInst;
    }

    public Integer getCodInst() {
        return codInst;
    }

    public void setCodInst(Integer codInst) {
        this.codInst = codInst;
    }

    public String getNombreInst() {
        return nombreInst;
    }

    public void setNombreInst(String nombreInst) {
        this.nombreInst = nombreInst;
    }

    public String getDireccionInst() {
        return direccionInst;
    }

    public void setDireccionInst(String direccionInst) {
        this.direccionInst = direccionInst;
    }

    public Integer getTelefonoInst() {
        return telefonoInst;
    }

    public void setTelefonoInst(Integer telefonoInst) {
        this.telefonoInst = telefonoInst;
    }

    public Integer getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codInst != null ? codInst.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Institucion)) {
            return false;
        }
        Institucion other = (Institucion) object;
        if ((this.codInst == null && other.codInst != null) || (this.codInst != null && !this.codInst.equals(other.codInst))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.saed.agenda.entities.Institucion[ codInst=" + codInst + " ]";
    }
    
}
