package org.valix85.application;

import org.valix85.anagrafica.Persona;
import org.valix85.classifiche.Tempi;
import org.valix85.evento.CorsaPodistica;
import org.valix85.evento.Evento;

/**
 * Created by Valerio on 09/02/2017.
 */
public class Main {

    public static void main (String args[]){

        Persona p1 = new Runner("Mario", "Rossi");
        Persona p2 = new Runner("Federica", "Riva");
        Persona p3 = new Runner("Sandro", "Ghezzi");
        Persona p4 = new Runner("Gianna", "Mirano");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        //Evento corsa = new CorsaPodistica();
        CorsaPodistica corsa = new CorsaPodistica();
        corsa.setPartecipantiMax(30);


        corsa.setTabellone(new Tempi());

        System.out.println(corsa);



        corsa.iscriviCorridore(p1);
        corsa.iscriviCorridore(p2);
        corsa.iscriviCorridore(p3);
        corsa.iscriviCorridore(p4);

        corsa.stampaPartecipanti();

        corsa.avviaCorsa();

        System.exit(0);




        int[] arrayInt = new int[10];  //il default di int è 0
        arrayInt[5] = 12345;
        System.out.println(arrayInt.length);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
        Persona[] arrayPersone = new Persona[10];
        System.out.println("\nLunghezza array: " + arrayPersone.length + "\n");
        for (int i = 0; i < arrayPersone.length; i++) {
            System.out.println(arrayPersone[i]);
        }
        for (int i = 0; i < 10; i++) {
            arrayPersone[i] = new Runner( "nome" + i, "cognome" + i);
        }
        for (int i = 0; i < arrayPersone.length; i++) {
            System.out.println(arrayPersone[i]);
        }

    }



}
