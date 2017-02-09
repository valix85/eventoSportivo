package org.valix85.classifiche;

import org.valix85.anagrafica.Persona;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Valerio on 09/02/2017.
 */
public class Tempi<T extends Persona> {

    private Map<Integer, T> tab = new TreeMap<>();

    public void add(T p, int sec){
        tab.put(sec, p);
    }

    /**
     * Impedisco che la classifica venga modificata da fuori
     * @return
     */
    public Map<Integer, T> getClassifica() {
        return Collections.unmodifiableMap(tab);
    }
}
