/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.ejb;

import com.saed.agenda.entities.Eventoparticipante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author pc
 */
@Local
public interface EventoparticipanteFacadeLocal {

    void create(Eventoparticipante eventoparticipante);

    void edit(Eventoparticipante eventoparticipante);

    void remove(Eventoparticipante eventoparticipante);

    Eventoparticipante find(Object id);

    List<Eventoparticipante> findAll();

    List<Eventoparticipante> findRange(int[] range);

    int count();
    
}
