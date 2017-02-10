package org.valix85.evento;

import org.valix85.application.Runner;
import org.valix85.classifiche.ItemTempi;
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
    private Tempi tabellone = new Tempi();

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
        this.tabellone = new Tempi();
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
                System.out.println(partecipante);
                int tempo = (int) ((Math.random() * 100) + (Math.random() * 100) + (Math.random() * 100));
                tabellone.add(new ItemTempi(partecipante, (double) tempo));
            });
           }
    }

    public void stampaClassifica() {
        tabellone.ordinaClassifica();


        System.out.println("\n\n\n-------------------------\n\n\n");
        System.out.println("*** Vincitore ***");
        Runner rtmp = (Runner) tabellone.primo().getPersona();
        System.out.println("*** ["+rtmp.getNumero()+"] \t"+rtmp.getNome()+" "+rtmp.getCognome()+" ***");


        System.out.println("----------------------------------------------------");

        tabellone.getClassifica().forEach(
                (item) -> {
                ItemTempi it = (ItemTempi) item;
                Runner r = (Runner) it.getPersona();

               // System.out.println(r.getNumero());
                //Runner rtmp = item.getPersona();
                System.out.println("    ["+r.getNumero()+"] \t"+r.getCognome()+" \t"+r.getNome()+" ha corso in: "+it.getPunteggio()+" secondi");
        });

    }
}
