/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saed.agenda.ejb;

import com.saed.agenda.entities.Institucion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author pc
 */
@Local
public interface InstitucionFacadeLocal {

    void create(Institucion institucion);

    void edit(Institucion institucion);

    void remove(Institucion institucion);

    Institucion find(Object id);

    List<Institucion> findAll();

    List<Institucion> findRange(int[] range);

    int count();
    
}
