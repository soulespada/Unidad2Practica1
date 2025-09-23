package com.ieschabas;

/**
 * Clase que define un Libro
 * @author Adrian
 * @version 1.0
 */
public class Libro {//6. Implementa una clase Libro con título, autor y páginas. Incluye un constructor y un método mostrarInformacion().
    private String titulo;
    private String autor;
    private int paginas;

    /**
     * Constructor vacio de Libro
     */
    public Libro(){};

    /**
     * Constructor sobrecargado de Libro
     * @param titulo
     * @param autor
     * @param paginas
     */
    public Libro(String titulo, String autor, int paginas){
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
    }

    /**
     * metodo que establece el titulo del libro
     * @param titulo
     */
    public void setTitulo(String titulo){this.titulo=titulo;}

    /**
     * Metodo que establece el autor del libro
     * @param autor
     */

    public void setAutor(String autor){this.autor=autor;}

    /**
     * Metodo que establece el numero de paginas del libro
     * @param paginas
     */
    public void setPaginas(int paginas){this.paginas=paginas;}

    /**
     * Metodo que devuelve el titulo del libro
     * @return titulo
     */
    public String getTitulo(){return titulo;}

    /**
     * Metodo que devuelve el Autor del libro
     * @return autor
     */
    public String getAutor(){return autor;}

    /**
     * Metodo que devuelve el numero de paginas del libro
     * @return paginas
     */
    public int getPaginas(){return paginas;}

    /**
     * Metodo que devuelve toda la informacion del libro
     * @return Titulo + Autor + paginas
     */
    public String mostrarInformacion(){
        return "Titulo: "+ this.titulo +"\nAutor: "+this.autor +"\nNumero de paginas: "+this.paginas;
    }
}
