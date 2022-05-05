package com.company;

public class Bateria extends Instrumento{
    private int tambores;
    private int platillos;

    private final int precioUniTambor = 3000;
    private final int precioUniPlatillo = 2000;


    public Bateria(String marca, int tambores, int platillos) {
        super(marca);
        this.tambores = tambores >= 3 ? tambores : 3;
        this.platillos = platillos >= 1 && platillos <=5 ? platillos : 1;
        this.price = (precioUniTambor * this.tambores) + (precioUniPlatillo * this.platillos);
    }

    public int getTambores() {
        return tambores;
    }

    public void setTambores(int tambores) {
        this.tambores = tambores;
    }

    public int getPlatillos() {
        return platillos;
    }

    public void setPlatillos(int platillos) {
        this.platillos = platillos;
    }

    @Override
    public String toString() {
        return "BATERIA"
                + super.toString()
                + "\nTambores: " + this.tambores
                + "\nPlatillos: " + this.platillos;
    }
}


