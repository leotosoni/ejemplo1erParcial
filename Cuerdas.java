package com.company;

public abstract class Cuerdas extends Instrumento{
    protected int cuerdas;

    public Cuerdas(String marca, int cuerdas) {
        super(marca);
        this.cuerdas = cuerdas;
    }

    @Override
    public String toString() {
        return "\nCuerdas: " + this.cuerdas
                + super.toString();
    }


}

