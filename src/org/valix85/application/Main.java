package org.valix85.application;

import org.valix85.evento.CorsaPodistica;

/**
 * Created by Valerio on 09/02/2017.
 */
public class Main {

    public static void main (String args[]){

        Runner p1 = new Runner("Mario", "Rossi");
        Runner p2 = new Runner("Federica", "Riva");
        Runner p3 = new Runner("Sandro", "Ghezzi");
        Runner p4 = new Runner("Gianna", "Mirano");

        CorsaPodistica corsa = new CorsaPodistica(30);
        corsa.iscriviCorridore(p1);
        corsa.iscriviCorridore(p2);
        corsa.iscriviCorridore(p3);
        corsa.iscriviCorridore(p4);

        System.out.println(corsa);

        corsa.stampaPartecipanti();
        corsa.avviaCorsa();
        corsa.stampaClassifica();
    }
}
