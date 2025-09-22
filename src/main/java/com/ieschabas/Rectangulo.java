package com.ieschabas;

/**
 * Clase que define un rectángulo
 * @author Adrian
 * @version 1.0
 */
public class Rectangulo {
    //2. Implementa una clase Rectangulo con atributos base y altura, y un método para calcular el área.
    private double base;
    private double altura;

    /**
     * Constructor por defecto de la clase Rectangulo
     */
    public Rectangulo(){}
    /**
     * Constructor sobrecargado de la clase Rectangulo
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //getters

    /**
     * metodo que devuelve la base del Rectangulo
     * @return base
     */
    public double getBase() {
        return base;
    }
    /**
     * metodo que devuelve la altura del Rectangulo
     * @return altura
     */
    public double getAltura() {
        return altura;
    }

    //setters

    /**
     * metodo que establece la base del Rectangulo
     * @param base
     */
    public void setBase(double base) {
        this.base = base;
    }
    /**
     * metodo que establece la altura del Rectangulo
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * metodo  que calcula el area del rectangulo
     * @return area
     */
    public double calcularArea(){return altura*base;}


}

