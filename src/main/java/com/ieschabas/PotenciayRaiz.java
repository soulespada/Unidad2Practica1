package com.ieschabas;

public class PotenciayRaiz {
    private double numero;

    /**
     * Constructor vacio
     */
    public PotenciayRaiz(){};

    /**
     * Constructor sobrecargado
     * @param numero
     */
    public PotenciayRaiz(double numero) {
        this.numero = numero;
    }

    /**
     * metodo que devuelve el numero
     * @return numero
     */
    public double getNumero() {
        return numero;
    }

    /**
     * metodo que establece el numero
     * @param numero
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }
    /**
     * metodo que calcula la Raiz Cuadrada del numero
     * @return numero
     */
    public double calcularRaizCuadrada(){return Math.sqrt(this.numero);}

    /**
     * metodo que calcula la potencia de un numero sobre otro
     * @param potencia
     * @return
     */
    public double calcularPotencia(int potencia){return Math.pow(this.numero,potencia);}
}
