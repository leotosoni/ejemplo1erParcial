package com.company;

public class Bajos extends Cuerdas implements SonidoAmplificado{

    private String modelo;

    public Bajos(String marca, String modelo) {
        super(marca, 4);
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
        return "BAJO"
                + super.toString()
                + "\nModelo: " + this.modelo;
    }

    @Override
    public void sonidoAmplicado() {
        System.out.println(this.getClass() + ": SONIDO AMPLIFICADO");
    }
}
