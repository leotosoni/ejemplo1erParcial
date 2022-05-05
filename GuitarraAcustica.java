package com.company;

public class GuitarraAcustica extends Cuerdas{

    private String madera; /// caoba o nogal

    public GuitarraAcustica(String marca, String madera) {
        super(marca, 6);
        this.madera = madera;
    }

    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    @Override
    public String toString() {
        return "GUITARRA ACUSTICA"
        + super.toString()
        + "\nMadera: " + this.madera;
    }


}
