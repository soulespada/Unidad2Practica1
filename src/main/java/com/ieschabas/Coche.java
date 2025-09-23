package com.ieschabas;

/**
 * Clase que define un coche
 * @author Adrian
 * @version 1.0
 */
public class Coche {//4. Crea una clase Coche con atributo velocidad y métodos acelerar y frenar.

    private double velocidad;
    /**
     * Constructor por defecto de la clase Coche
     */
    public  Coche(){}
    /**
     * Constructor sobrecargado de la clase Coche
     */
    public  Coche(double velocidad){this.velocidad=velocidad;}

    /**
     * Metodo que establece la velocidad del Coche
     * @param velocidad
     */

    public void setVelocidad(double velocidad){this.velocidad=velocidad;}

    /**
     * Metodo que devuelve la velocidad del Coche
     * @return velocidad
     */
    public double getVelocidad(){return velocidad;}

    /**
     * metodo que acelera el coche
     * @param aceleracion
     */
    public void acelerar(double aceleracion){this.velocidad +=aceleracion;}

    /**
     * metodo que frena el coche
     * @param frenada
     */
    public void frenar(double frenada){this.velocidad -=frenada;}


}
