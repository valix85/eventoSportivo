package org.valix85.classifiche;

import org.valix85.anagrafica.Persona;

import java.util.Comparator;

/**
 * Created by Valerio on 10/02/2017.
 */
public class ItemTempi<T extends Persona> implements Comparable<ItemTempi>  {
//Comparable implementa l'ordinamento standard per il sort
    //Comparator implementa vari modi per ordinare e vanno passati al metodo sort della lista.

    private T persona;
    private double punteggio; // caso1 di compareTo()

   // private Double punteggio; //Double classe wrapper che ha già il metodo compareTo

    public ItemTempi(T p,double time){
        this.persona = p;
        this.punteggio = time;
    }

    public T getPersona() { return persona; }

    public void setPersona(T persona) {
        this.persona = persona;
    }

    public double getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(double punteggio) {
        this.punteggio = punteggio;
    }


    //comparable
    public int compareTo(ItemTempi item){
        //if (item.getPunteggio()>this.punteggio){return 1;}
        //if (item.getPunteggio()==this.punteggio){return 0;}
        //return -1;
        //return (int) this.punteggio().compareTo(item.getPunteggio());

        // caso1 è double basta retituire se <,>,= a 0,
        // pertenato faccio la differenza di numeri
        //return 0;
        //Ascendente
        return (int) (this.punteggio - item.getPunteggio());
        //Discendente
        //return (int) (item.getPunteggio() - this.punteggio);
    }


    //compartor
    //altra classe, è chi cerca di ordinare che gli passa la regola del comparator, se non la passa userà questa di comparable


    public String toString(){
        //return "sss";
        return this.persona.toString();
    }

}
