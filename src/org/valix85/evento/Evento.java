package org.valix85.evento;

import org.valix85.anagrafica.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Valerio on 09/02/2017.
 */
public class Evento<T extends Persona> {

    protected String nome;
    protected String indirizzo;
    protected Date inizio;
    protected Date fine;
    protected TipoEvento categoria;
    protected List<T> partecipanti = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Date getInizio() {
        return inizio;
    }

    public void setInizio(Date inizio) {
        this.inizio = inizio;
    }

    public Date getFine() {
        return fine;
    }

    public void setFine(Date fine) {
        this.fine = fine;
    }

    public TipoEvento getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoEvento categoria) {
        this.categoria = categoria;
    }

    public List<T> getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(List<T> partecipanti) {
        this.partecipanti = partecipanti;
    }

    public String toString(){
        return "Evento: "+this.nome;
    }
}
