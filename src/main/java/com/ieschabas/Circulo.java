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
    public Circulo(double radio){this.radio=radio;}

    /**
     * Metodo que establece el radio del Circulo
     * @param radio
     */
    public void setRadio(double radio){this.radio=radio;}

    /**
     * Metodo que devuelve el radio del Circulo
     * @return
     */
    public double getRadio(){return this.radio;}


   // public double calcularArea(PotenciayRaiz potenciayRaiz){return potenciayRaiz.calcularPotencia(2)*Math.PI;}

    /**
     * metodo que crea un objeto de tipo PotenciayRaiz para utilizar su metodo calcularPotencia y finalmente devuelve el area del circulo de radio x
     * @return
     */
    public double calcularArea(){PotenciayRaiz potenciayRaiz = new PotenciayRaiz(radio);
    return potenciayRaiz.calcularPotencia(2)*Math.PI;}

}
