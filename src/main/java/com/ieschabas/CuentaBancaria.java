package com.ieschabas;
//3. Diseña una clase CuentaBancaria con atributos saldo y titular.
// Implementa métodos para ingresar y retirar dinero.
public class CuentaBancaria {
    private double saldo;
    private String titular;

    /**
     * Constructor por defecto de la clase CuentaBancaria
     */
    public CuentaBancaria(){};

    /**
     * Constructor sobrecargado de la clase Cuentabancaria
     * @param saldo
     * @param titular
     */
    public CuentaBancaria(double saldo,String titular){
        this.saldo=saldo;
        this.titular=titular;
    }

    /**
     * metodo que devuelve el saldo de la cuenta
     * @return
     */
    public double getSaldo(){return saldo;}
    /**
     * metodo que devuelve el titular de la cuenta
     * @return
     */
    public String getTitular(){return titular;}

    /**
     * metodo que establece el saldo de la cuenta
     * @param saldo
     */
    public void setSaldo(double saldo){this.saldo=saldo;}
    /**
     * metodo que establece el titular de la cuenta
     * @param titular
     */
    public void setTitular(String titular){this.titular=titular;}

    /**
     * metodo que ingresa dinero en la variable saldo
     * @param ingreso
     */
    public void ingresarDinero(double ingreso){this.saldo += ingreso;}

    /**
     * metodo que resta dinero de la variable saldo
     * @param retiro
     */
    public void retirarDinero(double retiro){this.saldo -= retiro;}

}
