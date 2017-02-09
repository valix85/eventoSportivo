package org.valix85.evento;

/**
 * Created by Valerio on 09/02/2017.
 */
public enum Tipo {
    PARTY,
    FESTA_PRIVATA,
    CORSA,
    CORSA_LIBERA,
    //CORSA_PODISTICA("it"),
    CONCERTO,
    FESTA_DI_PAESE,
    CORSA_PODISTICA
;

private Tipo(){};
/*
private Tipo(String s){this.lang = s;} //da questa implementazione dovò generare una variabile interna privata per tenerne traccia
private String lang;
*/

}
