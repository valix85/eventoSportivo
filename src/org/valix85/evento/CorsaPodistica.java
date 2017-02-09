package org.valix85.evento;

import org.valix85.anagrafica.Persona;
import org.valix85.application.Runner;
import org.valix85.classifiche.Tempi;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Valerio on 09/02/2017.
 */
public class CorsaPodistica extends Evento{

    private int numtappe = 1;
    private String checkpoint[];
    private int partecipantiMax = 0;
    private Tempi tabellone;
    private static List partecipanti = new ArrayList();


    public CorsaPodistica(){
        super();
        this.setCategoria( Tipo.CORSA_PODISTICA.toString() );
    }









    public boolean isATappe(){
        return !(numtappe==1);
    }

    public String[] getTappe(){
        if (this.isATappe()){
            return this.checkpoint;
        }
        return null;
    }

    public String toString(){
        return "Evento: " + this.getCategoria();
    }


    public int getNumeroIscritti() {
        return partecipanti.size();
    }


    public int getPartecipantiMax() {
        return partecipantiMax;
    }

    public void setPartecipantiMax(int partecipantiMax) {
        this.partecipantiMax = partecipantiMax;
    }

    public boolean iscriviCorridore(Persona r){
        if (partecipanti.size()>=this.partecipantiMax){
            System.err.println("Corsa piena!");
            return false;
        }else {
            partecipanti.add(r);
        }
        return true;
    }

    public void stampaPartecipanti(){
        System.out.println("\n***\tPARTECIPANTI \t***\n");
        for (int k=0 ; k<partecipanti.size(); k++ ){
            //System.out.println(partecipanti.get(k).toString());
            Runner runner =(Runner)partecipanti.get(k);
            System.out.println(runner.getNumero()+") \t"+runner.getCognome()+" \t"+runner.getNome());

        }
        System.out.println("\n***\tEND \t\t\t***\n");
    }

    public void avviaCorsa(){
        //controllo se ho corridori
        if (this.getNumeroIscritti()>=1){
            //per ogni corridore simulo un tempo di corsa (espresso in secondi)
            for (int k=0 ; k<partecipanti.size(); k++ ){
                //System.out.println(partecipanti.get(k).toString());
                Runner runner =(Runner)partecipanti.get(k);
                int tempo = (int) (Math.random()*100);
                System.out.println(runner.getNumero()+") \t"+runner.getCognome()+" \t"+runner.getNome()+" ha corso in: "+tempo);
                tabellone.add(runner, tempo );
            }
            tabellone.ordina();


        }else{System.err.println("Non ho iscritti");}
    }

    public void setTabellone(Tempi tabellone) {
        this.tabellone = tabellone;
    }
}
