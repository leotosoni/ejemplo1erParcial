package com.company;

import java.io.DataInput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bajos bajo1 = new Bajos("Yamaha", "GH-109");
        Bateria bat1 = new Bateria("Yamaha", 5, 4);
        GuitarraAcustica guiacu1 = new GuitarraAcustica("Yamaha", "Caoba");
        GuitarraElectrica guiele1 = new GuitarraElectrica("Yamaha", "HJ-879");

        bajo1.setPrice(2000);
        guiacu1.setPrice(3500);
        guiele1.setPrice(4000);

        List<Instrumento> listInstrumentos = new ArrayList<>();

        listInstrumentos.add(bajo1);
        listInstrumentos.add(bat1);
        listInstrumentos.add(guiele1);
        listInstrumentos.add(guiacu1);

        for (Instrumento i : listInstrumentos) {
            System.out.println(i);
        }

        for (Instrumento i : listInstrumentos) {
            double discount = 0.0;

            if (i instanceof GuitarraElectrica)
                discount = 1.05;
            else if (i instanceof GuitarraAcustica)
                discount = 1.10;
            else if (i instanceof Bateria)
                discount = 1.15;
            else discount = 1.20;

            System.out.println(i.getClass().getSimpleName());
            System.out.println("SIN AUMENTO: "+ i.getPrice());
            i.setPrice(i.getPrice()*discount);
            System.out.println("CON AUMENTO: " + Math.round(i.getPrice()));
        }


    }
}
