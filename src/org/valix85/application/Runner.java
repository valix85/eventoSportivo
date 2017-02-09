package org.valix85.application;

import org.valix85.anagrafica.Persona;

/**
 * Created by Valerio on 09/02/2017.
 */
public final class Runner extends Persona {

    private int numero;

    public Runner(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    public String toString(){

        return super.toString() + ", pettorina numero: "+numero;
    }

    public String getNumero(){
        return ""+this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
