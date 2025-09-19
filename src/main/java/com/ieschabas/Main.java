package com.ieschabas;

public class Main {
    public static void main(String[] args) {
        //Instanciamos un objeto Persona
        Persona persona1 = new Persona();
        //Hemos añadido datos al objeto persona1
        persona1.setNombre("Adrian");
        persona1.setApellidos("Hidalgo Poveda");
        persona1.setDni("115135312D");
        persona1.setEdad(22);
        persona1.setTelefono("+34634159685");
        //Imprimimos los datos por consola
        System.out.println(persona1.toString());

        //Instaciamos un objeto Persona con constructor sobrecargado
        Persona persona2 = new Persona(23,"14251532V","Manolito","Gafotas","+34123511341");
        System.out.println(persona2.toString());

        //Cambiar la edad a 50 de persona1
        persona1.setEdad(50);
        //Comprobamos que la edad se ha establecido
        System.out.println("Nueva edad: "+persona1.getEdad());
        //Imprimimos todos los atributos
        System.out.println(persona1.toString());

    }
}