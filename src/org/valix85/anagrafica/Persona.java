package org.valix85.anagrafica;

/**
 * Created by Valerio on 09/02/2017.
 */
public abstract class Persona {

    private String nome;
    private String cognome;
    private String codicefiscale;
    private String email;
    private String telefono;
    private Object mansione;



    public Persona (){}

    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }






    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodicefiscale() {
        return codicefiscale;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public Object getMansione() {
        return mansione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String coggnome) {
        this.cognome = cognome;
    }

    public void setCodicefiscale(String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMansione(Object mansione) {
        this.mansione = mansione;
    }

    public String toString(){
        return this.nome+" "+this.cognome;
    }

}


