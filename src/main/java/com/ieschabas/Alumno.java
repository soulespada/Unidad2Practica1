package com.ieschabas;

/**
 * Clase que define un Alumno
 * @author Adrian
 * @version 1.0
 */
public class Alumno {//7. Diseña una clase Alumno con atributos nombre y nota. Implementa un método aprobado() que devuelva true si la nota es >= 5.
    private String nombre;
    private double nota;

    /**
     * Constructor vacio de Alumno
     */
    public Alumno(){};

    /**
     * Constructor sobrecargado de alumno
     * @param nombre
     * @param nota
     */
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    /**
     * metodo que devuelve el Nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo que establece el Nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo que devuelve la nota
     * @return nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * metodo que establece la nota
     * @param nota
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    /**
     * metodo que devuelve true o false segun si esta aprobado o no
     * @return
     */
    public boolean aprobado(){
     return(this.nota>=5.0);
    }
}
