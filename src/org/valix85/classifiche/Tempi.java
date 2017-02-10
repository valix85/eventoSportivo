package org.valix85.classifiche;

import org.valix85.anagrafica.Persona;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valerio on 09/02/2017.
 */
public class Tempi {

    private List<ItemTempi> tab;

    public Tempi(){
        tab = new ArrayList<ItemTempi>(); // o LinkedList ? fare riflessione sui tempi di accesso e cancellazione
    }

    public void add(ItemTempi item){
        tab.add(item);
    }

    public void ordinaClassifica() {
        //this.tab.sort(null); //default ASC in classe ItemTempi
        this.tab.sort(new ItemTempiAscComparator() );
    }

    public void ordinaClassificaDecrescente(){
        this.tab.sort(new ItemTempiDescComparator() );
    }

    public List getClassifica() {
        return this.tab;
    }


    public ItemTempi primo(){
        if (tab.size()>0){
            return tab.get(0);
        }
        return null;
    }


}
