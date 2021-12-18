/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.ejb;

import com.saed.agenda.entities.Tipoevento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pc
 */
@Stateless
public class TipoeventoFacade extends AbstractFacade<Tipoevento> implements TipoeventoFacadeLocal {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoeventoFacade() {
        super(Tipoevento.class);
    }
    
}
