package com.ieschabas;

/**
 * La clase Persona define un objeto de tipo Persona con atributos como,
 * nombre, apellidos, edad, dni y telefono
 * @author Adrian
 * @version 1.0
 */
public class Persona {
        //Atributos de la clase
    private int edad;
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;

    //constructores
    /*
    Constructor por defecto crea una instancia de persona sin datos
     */

    public Persona(){

    }/**
     *Constructor sobrecargado de la clase PErsona,crea una instancia
 */

    public Persona(int edad,String dni, String nombre, String apellidos, String telefono){
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    // setters

    /**
     * Inserta el nombre en el objeto Persona
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Inserta el nombre en el objeto Persona
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * Inserta el nombre en el objeto Persona
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Inserta el apellidos en el objeto Persona
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * Inserta el telefono en el objeto Persona
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve la edad del objeto Persona
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Devuelve el dni del objeto Persona
     * @return dni
     */
    public String getDni() {
        return dni;
    }
    /**
     * Devuelve el nombre del objeto Persona
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Devuelve los apellidos del objeto Persona
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * Devuelve el telefono del objeto Persona
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    //metodo que imprime el objeto

    /**
     * Devuelve el objeto Persona en formato String
     * @return cadena con los valores de Persona
     */
    public String toString(){
        return "Nombre: " + this.nombre + "\nApellidos: " + this.apellidos +"\nEdad: "+ this.edad+"\nDni: "+this.dni +"\nTelefono: "+this.telefono;

    }
}
