package com.ieschabas;

/**
 * Clase que define una calculadora
 * @author Adrian
 * @version 1.0
 */
public class Calculadora {//10. Implementa una clase Calculadora con métodos suma, resta, multiplicación y división.
    private double numero1;

    private double numero2;

    /**
     * Constructor vacio
     */
    public Calculadora(){};

    /**
     * Constructor sobrecargado
     * @param numero1
     * @param numero2
     */
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /**
     * Metodo que devuelve el numero1
     * @return numero1
     */
    public double getNumero1() {
        return this.numero1;
    }

    /**
     * Metodo que establece el numero1
     * @param numero1
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    /**
     * metodo que devuelve el numero2
     * @return numero2
     */

    public double getNumero2() {
        return numero2;
    }

    /**
     * metodo que establece el numero 2
     * @param numero2
     */
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }


    /**
     * metodo que devuelve la suma de los numeros
     * @return suma
     */
    public double sumar(){return numero1+numero2;}

    /**
     * metodo que devuelve la resta de los numeros
     * @return resta
     */
    public double restar(){return numero1-numero2;}

    /**
     * metodo que devuelve la suma de los numeros
     * @return multiplicacion
     */
    public double multiplicar(){return numero1*numero2;}

    /**
     * metodo que devuelve la suma de los numeros
     * @return division
     */
    public double dividir(){return numero1/numero2;}

}
