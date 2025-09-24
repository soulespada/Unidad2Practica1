package com.ieschabas;
import java.math.*;
import java.util.Scanner;

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
        //Uso de la clase Rectangulo
        Rectangulo rectangulo1 = new Rectangulo(3.4,5.6);
        Rectangulo rectangulo2= new Rectangulo();
        //Setear la base y altura del rectangulo 1
        rectangulo2.setBase(5.2);
        rectangulo2.setAltura(6.2);
        System.out.println("Area del rectangulo 2: "+rectangulo2.calcularArea());
        System.out.println("El area de base: "+rectangulo1.getBase()+" y altura: "+rectangulo1.getAltura()+" es: "+rectangulo1.calcularArea() );

        //Cuenta Bancaria
        CuentaBancaria cuentaAdrian = new CuentaBancaria();
        cuentaAdrian.setSaldo(1000.0);
        System.out.println(cuentaAdrian.getSaldo());
        cuentaAdrian.ingresarDinero(1000.0);
        System.out.println(cuentaAdrian.getSaldo());
        cuentaAdrian.retirarDinero(500.0);
        System.out.println(cuentaAdrian.getSaldo());


        //Coche
        Coche mercedes = new Coche(50.0);
        mercedes.acelerar(20.0);
        System.out.println(mercedes.getVelocidad() +" km/h");
        mercedes.frenar(40.0);
        System.out.println(mercedes.getVelocidad()+" km/h");

        //Math
        //Instanciamos el scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero y le calcularemos la raiz cuadrada y la potencia");
        //escaneamos el numero
        double numero = scan.nextDouble();

        //instanciamos el objeto
        PotenciayRaiz numero1 = new PotenciayRaiz(numero);
        double resultadoRaizCuadrada = numero1.calcularRaizCuadrada();
        System.out.println("La raiz cuadrada del numero: "+numero1.getNumero()+" es: "+ resultadoRaizCuadrada);
        //Calculo de la potencia
        double resultadoPotencia = numero1.calcularPotencia(2);
        System.out.println("El numero "+numero1.getNumero()+" al cuadrado es: "+ resultadoPotencia);

        //Libro
        //Instanciamos el objeto libro1 de la clase Libro y rellenamos los parametros
        Libro libro1 = new Libro("Cancion de hielo y fuego","George R Martin",800);
        //usamos el metodo mostrarInformacion() en un sout para ver todos los datos de libro
        System.out.println("Aqui tienes toda la informacion del libro1: \n"+ libro1.mostrarInformacion());

        //Alumno
        //Instanciamos el objeto alumno1 de la clase Alumno y rellenamos los parametros
        Alumno alumno1 = new Alumno("Adrian",3.5);
        //Probamos el metodo aprobado, si devuelve true es porque el metodo ha comprobado que la nota es igual o mayor a 5, si devuelve false es porque es menor
        System.out.println(alumno1.aprobado());

        //Circulo
        //Instanciamos el objeto circulo1 de la clase Circulo y el Scanner
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Introduce el radio del circulo: ");
        //Escaneamos la variable
        double radioUsuario = scan2.nextDouble();
        Circulo circulo1 = new Circulo(radioUsuario);
        //Sacamos por pantalla el calculo del Area del circulo con determinado radio usando el metodo calcularArea
        //este metodo por parametro pide un objeto de tipo PotenciayRaiz
        System.out.println(circulo1.calcularArea());
        System.out.println("radio circulo "+circulo1.getRadio());
        //Calculadora

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        double numeroCalculadora1 = scan3.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        double numeroCalculadora2 = scan3.nextDouble();
        //instanciamos el objeto calculadora1 y lo cargamos de los numeros introducidos por el usuario
        Calculadora calculadora1 = new Calculadora(numeroCalculadora1,numeroCalculadora2);
        System.out.println("Elige la operacion: \nPara sumar pulsa 1\nPara restar pulsa 2\nPara multiplicar pulsa 3\nPara dividir pulsa 4");

        int opcion = scan.nextInt();
        //hacemos un switch con las distintas opciones
        //en cada caso usamos el metodo correspondiente dentro de un system out para sacar el resultado por pantalla
        switch(opcion){
            case 1:
                System.out.println("El resultado de la suma es: "+calculadora1.sumar());
            break;
            case 2:
                System.out.println("El resultado de la resta es: "+calculadora1.restar());
            break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: "+calculadora1.multiplicar());
            break;
            case 4:
                System.out.println("El resultado de la division es: "+calculadora1.dividir());
            break;

        }



    }
}