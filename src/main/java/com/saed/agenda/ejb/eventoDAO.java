/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.ejb;

import com.saed.agenda.entities.Eventos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author pc
 */
@Stateless
public class eventoDAO {
    
   // @PersistanceContext(unitName = "agenda-saedAppPU");
    EntityManager em;
    
    public void agregarEvento(Eventos x){
        em.persist(x);
    }
    
    public Eventos modificarEvento(Eventos x){
        return em.merge(x);
    }
    
    public void borrarEvento(Eventos x){
        em.remove(em.merge(x));
    }
    
    public List<Eventos> listarEventos(){
        Query q = em.createNamedQuery("Eventos.findAll");
        return (List<Eventos>)q.getResultList();
    }
    
    public Eventos buscarPorId(int id){
        Query q = em.createNamedQuery("Eventos.findByNumEvento");
        q.setParameter("numEvento", id);
        return (Eventos)q.getSingleResult();
    }
}