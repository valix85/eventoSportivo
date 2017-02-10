package org.valix85.classifiche;

/**
 * Created by Valerio on 10/02/2017.
 */
public class ItemTempi<T> {

    private T persona;
    private double punteggio;

    public T getPersona() {
        return persona;
    }

    public void setPersona(T persona) {
        this.persona = persona;
    }

    public double getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(double punteggio) {
        this.punteggio = punteggio;
    }
}
