package org.valix85.evento;

import org.valix85.application.Runner;
import org.valix85.classifiche.Tempi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Valerio on 09/02/2017.
 */
public class CorsaPodistica extends Evento<Runner> {

    private List<String> checkpoint = new ArrayList<>();
    private int partecipantiMax;
    private Tempi<Runner> tabellone;

    /**
     * Una corsa esiste solo se ha un limite ai partecipanti
     *
     * Il tabellone è gestito dalla corsa
     *
     * @param partecipantiMax
     */
    public CorsaPodistica(int partecipantiMax){
        super();
        this.setCategoria(TipoEvento.CORSA_PODISTICA);
        this.partecipantiMax = partecipantiMax;
        this.tabellone = new Tempi<>();
    }

    public boolean isATappe(){
        return (checkpoint.size() > 1);
    }

    public List<String> getTappe(){
        if (this.isATappe()){
            return this.checkpoint;
        }
        return null;
    }

    public void add(String checkpoint) {
        this.checkpoint.add(checkpoint);
    }

    public String toString(){
        return "Evento: " + this.getCategoria() + "\n" + this.partecipanti.stream().map(Runner::toString).collect(Collectors.joining("\n"));
    }

    public int getPartecipantiMax() {
        return partecipantiMax;
    }

    /**
     * Alla corsa si possono iscrivere solo corridori
     *
     * E' responsabilità della corsa assegnare il numero al corridore
     * @param r
     * @return
     */
    public boolean iscriviCorridore(Runner r){
        if (partecipanti.size()>=this.partecipantiMax){
            System.err.println("Corsa piena!");
            return false;
        }else {
            r.setNumero(partecipanti.size() + 1);
            partecipanti.add(r);
        }
        return true;
    }

    public void stampaPartecipanti(){
        System.out.println("\n***\tPARTECIPANTI \t***\n");
        for (int k=0 ; k<partecipanti.size(); k++ ){
            //System.out.println(partecipanti.get(k).toString());
            Runner runner = partecipanti.get(k);
            System.out.println(runner.getNumero()+") \t"+runner.getCognome()+" \t"+runner.getNome());

        }
        System.out.println("\n***\tEND \t\t\t***\n");
    }

    public void avviaCorsa(){
        //controllo se ho corridori
        if (!this.partecipanti.isEmpty()){
            //per ogni corridore simulo un tempo di corsa (espresso in secondi)
            this.partecipanti.forEach(partecipante -> {
                int tempo = (int) (Math.random()*100);
                tabellone.add(partecipante, tempo);
            });
        } else{
            System.err.println("Non ho iscritti");
        }
    }

    public void stampaClassifica() {
        tabellone.getClassifica().forEach((tempo, persona) -> {
            System.out.println(persona.getNumero()+") \t"+persona.getCognome()+" \t"+persona.getNome()+" ha corso in: "+tempo);
        });
    }
}
