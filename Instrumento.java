package com.company;

public abstract class Instrumento {
    protected double price;
    protected String marca;

    public Instrumento(String marca) {
        this.marca = marca;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nPrecio: " + price +
                "\nMarca: " + marca;
    }
}
