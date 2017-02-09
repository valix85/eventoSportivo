package org.valix85.application;

import org.valix85.anagrafica.Persona;

/**
 * Created by Valerio on 09/02/2017.
 */
public final class Runner extends Persona {

    private int numero;

    private static int progressivo = 0;

    public Runner(String nome, String cognome){
        this(nome, cognome, progressivo+1);
    }

    private Runner(String nome, String cognome, int numero){
        super(nome, cognome);
        if (numero>progressivo){this.numero = numero;progressivo++;}else{this.numero=++progressivo;}
        //if (numero>progressivo++){this.numero = numero;}else{this.numero=++progressivo;}
    }

    @Override
    public String toString(){

        return super.toString() + ", pettorina numero: "+numero;
    }

    public String getNumero(){
        return ""+this.numero;
    }

}
