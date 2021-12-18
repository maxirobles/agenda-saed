/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.ejb;

import com.saed.agenda.entities.Lugar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author pc
 */
@Local
public interface LugarFacadeLocal {

    void create(Lugar lugar);

    void edit(Lugar lugar);

    void remove(Lugar lugar);

    Lugar find(Object id);

    List<Lugar> findAll();

    List<Lugar> findRange(int[] range);

    int count();
    
}
