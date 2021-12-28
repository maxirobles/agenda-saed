/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fcastillo
 */
@Entity
@Table(name = "eventos")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Eventos.findAll", query = "SELECT e FROM Eventos e"),
  @NamedQuery(name = "Eventos.findByNumEvento", query = "SELECT e FROM Eventos e WHERE e.numEvento = :numEvento"),
  @NamedQuery(name = "Eventos.findByDescripcion", query = "SELECT e FROM Eventos e WHERE e.descripcion = :descripcion"),
  @NamedQuery(name = "Eventos.findByLugar", query = "SELECT e FROM Eventos e WHERE e.lugar = :lugar"),
  @NamedQuery(name = "Eventos.findByFecharegistro", query = "SELECT e FROM Eventos e WHERE e.fecharegistro = :fecharegistro"),
  @NamedQuery(name = "Eventos.findByFechaevento", query = "SELECT e FROM Eventos e WHERE e.fechaevento = :fechaevento"),
  @NamedQuery(name = "Eventos.findByCreadorEvento", query = "SELECT e FROM Eventos e WHERE e.creadorEvento = :creadorEvento"),
  @NamedQuery(name = "Eventos.findByCantPersSAED", query = "SELECT e FROM Eventos e WHERE e.cantPersSAED = :cantPersSAED"),
  @NamedQuery(name = "Eventos.findByCantPersExt", query = "SELECT e FROM Eventos e WHERE e.cantPersExt = :cantPersExt"),
  @NamedQuery(name = "Eventos.findByInstitucion", query = "SELECT e FROM Eventos e WHERE e.institucion = :institucion"),
  @NamedQuery(name = "Eventos.findByRefrigerio", query = "SELECT e FROM Eventos e WHERE e.refrigerio = :refrigerio"),
  @NamedQuery(name = "Eventos.findBySacerdote", query = "SELECT e FROM Eventos e WHERE e.sacerdote = :sacerdote"),
  @NamedQuery(name = "Eventos.findByNomEntrevistador", query = "SELECT e FROM Eventos e WHERE e.nomEntrevistador = :nomEntrevistador"),
  @NamedQuery(name = "Eventos.findByNomEntrevistado", query = "SELECT e FROM Eventos e WHERE e.nomEntrevistado = :nomEntrevistado"),
  @NamedQuery(name = "Eventos.findByObservacion", query = "SELECT e FROM Eventos e WHERE e.observacion = :observacion"),
  @NamedQuery(name = "Eventos.findByTipoevento", query = "SELECT e FROM Eventos e WHERE e.tipoevento = :tipoevento")})
public class Eventos implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "numEvento")
  private Integer numEvento;
  @Size(max = 50)
  @Column(name = "descripcion")
  private String descripcion;
  @Column(name = "lugar")
  private Integer lugar;
  @Column(name = "fecharegistro")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fecharegistro;
  @Column(name = "fechaevento")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaevento;
  @Column(name = "creadorEvento")
  private Integer creadorEvento;
  @Column(name = "cantPersSAED")
  private Integer cantPersSAED;
  @Column(name = "cantPersExt")
  private Integer cantPersExt;
  @Column(name = "Institucion")
  private Integer institucion;
  @Column(name = "Refrigerio")
  private Boolean refrigerio;
  @Size(max = 50)
  @Column(name = "sacerdote")
  private String sacerdote;
  @Column(name = "nomEntrevistador")
  private Integer nomEntrevistador;
  @Column(name = "nomEntrevistado")
  private Integer nomEntrevistado;
  @Size(max = 50)
  @Column(name = "observacion")
  private String observacion;
  @Size(max = 25)
  @Column(name = "tipoevento")
  private String tipoevento;

  public Eventos() {
  }

  public Eventos(Integer numEvento) {
    this.numEvento = numEvento;
  }

  public Integer getNumEvento() {
    return numEvento;
  }

  public void setNumEvento(Integer numEvento) {
    this.numEvento = numEvento;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Integer getLugar() {
    return lugar;
  }

  public void setLugar(Integer lugar) {
    this.lugar = lugar;
  }

  public Date getFecharegistro() {
    return fecharegistro;
  }

  public void setFecharegistro(Date fecharegistro) {
    this.fecharegistro = fecharegistro;
  }

  public Date getFechaevento() {
    return fechaevento;
  }

  public void setFechaevento(Date fechaevento) {
    this.fechaevento = fechaevento;
  }

  public Integer getCreadorEvento() {
    return creadorEvento;
  }

  public void setCreadorEvento(Integer creadorEvento) {
    this.creadorEvento = creadorEvento;
  }

  public Integer getCantPersSAED() {
    return cantPersSAED;
  }

  public void setCantPersSAED(Integer cantPersSAED) {
    this.cantPersSAED = cantPersSAED;
  }

  public Integer getCantPersExt() {
    return cantPersExt;
  }

  public void setCantPersExt(Integer cantPersExt) {
    this.cantPersExt = cantPersExt;
  }

  public Integer getInstitucion() {
    return institucion;
  }

  public void setInstitucion(Integer institucion) {
    this.institucion = institucion;
  }

  public Boolean getRefrigerio() {
    return refrigerio;
  }

  public void setRefrigerio(Boolean refrigerio) {
    this.refrigerio = refrigerio;
  }

  public String getSacerdote() {
    return sacerdote;
  }

  public void setSacerdote(String sacerdote) {
    this.sacerdote = sacerdote;
  }

  public Integer getNomEntrevistador() {
    return nomEntrevistador;
  }

  public void setNomEntrevistador(Integer nomEntrevistador) {
    this.nomEntrevistador = nomEntrevistador;
  }

  public Integer getNomEntrevistado() {
    return nomEntrevistado;
  }

  public void setNomEntrevistado(Integer nomEntrevistado) {
    this.nomEntrevistado = nomEntrevistado;
  }

  public String getObservacion() {
    return observacion;
  }

  public void setObservacion(String observacion) {
    this.observacion = observacion;
  }

  public String getTipoevento() {
    return tipoevento;
  }

  public void setTipoevento(String tipoevento) {
    this.tipoevento = tipoevento;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (numEvento != null ? numEvento.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Eventos)) {
      return false;
    }
    Eventos other = (Eventos) object;
    if ((this.numEvento == null && other.numEvento != null) || (this.numEvento != null && !this.numEvento.equals(other.numEvento))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.saed.agenda.entities.Eventos[ numEvento=" + numEvento + " ]";
  }
  
}
