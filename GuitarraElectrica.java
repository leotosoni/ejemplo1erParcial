package com.company;

public class GuitarraElectrica extends Cuerdas implements SonidoAmplificado{

    private String modelo;

    public GuitarraElectrica(String marca, String modelo) {
        super(marca, 6);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "GUITARRA ELECTRICA"
        +super.toString()
                + "\nModelo: " + this.modelo;
    }

    @Override
    public void sonidoAmplicado() {
        System.out.println(this.getClass() + ": SONIDO AMPLIFICADO");
    }
}
