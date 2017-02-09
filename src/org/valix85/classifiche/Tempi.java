package org.valix85.classifiche;

import org.valix85.anagrafica.Persona;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Valerio on 09/02/2017.
 */
public class Tempi {

    private Map<Persona, Integer> tab = new HashMap<>();

    public void add(Persona p, int sec){
        tab.put(p,sec);
    }


    public void ordina() {

    }
}
