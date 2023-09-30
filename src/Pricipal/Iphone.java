package Pricipal;

import Interfaces.Ligar;
import Interfaces.Navegar;
import Interfaces.Reproduzir;

public class Iphone implements Ligar, Navegar, Reproduzir {
    private String nomeIphone;
    private long numeroSerie;

    public Iphone(String nameIphone,long numeroSerie ){
        this.nomeIphone = nameIphone;
        this.numeroSerie = numeroSerie;
    }

    public String getNomeIphone() {
        return nomeIphone;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }


    @Override
    public void ligarParaContato(long numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando...");
    }

    @Override
    public void navegar(String endereco) {
        System.out.println("Abrindo página "+ endereco + " no seu navegor safari!");
    }

    @Override
    public void reproduzirMusicas() {
        System.out.println("Reproduzindo musicas aleatórias da sua biblioteca!");
    }
}
