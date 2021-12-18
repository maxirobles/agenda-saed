/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.ejb;

import com.saed.agenda.entities.Participantes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author pc
 */
@Local
public interface ParticipantesFacadeLocal {

    void create(Participantes participantes);

    void edit(Participantes participantes);

    void remove(Participantes participantes);

    Participantes find(Object id);

    List<Participantes> findAll();

    List<Participantes> findRange(int[] range);

    int count();
    
}
