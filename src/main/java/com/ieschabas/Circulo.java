package com.ieschabas;

/**
 * Clase que define un circulo
 * @author Adrian
 * @version 1.0
 */
public class Circulo {//9. Crea una clase Circulo con atributo radio y un método calcularArea().
    private double radio;

    /**
     * Constructor vacio
     */
    public Circulo(){};

    /**
     * Constructor sobrecargado
     * @param radio
     */
    public Circulo(double radio){radio = this.radio;}

    /**
     * Metodo que establece el radio del Circulo
     * @param radio
     */
    public void setRadio(double radio){radio=this.radio;}

    /**
     * Metodo que devuelve el radio del Circulo
     * @return
     */
    public double getRadio(){return this.radio;}

    /**
     * Metodo (que recibe un objeto de tipo PotenciayRaiz para utilizar su metodo de calcular potencias)que devuelve el area del circulo
     * @param potenciayRaiz
     * @return
     */
    public double calcularArea(PotenciayRaiz potenciayRaiz){return potenciayRaiz.calcularPotencia(2)*Math.PI;}

}
