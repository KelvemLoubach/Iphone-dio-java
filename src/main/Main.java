package main;

import Pricipal.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Kelvem", 548646854l);

        iphone.getNomeIphone();
        iphone.getNumeroSerie();
        iphone.ligarParaContato(28999491568l);
        iphone.desligar();
        iphone.reproduzirMusicas();
        iphone.navegar("www.dio.com.br");
    }
}
