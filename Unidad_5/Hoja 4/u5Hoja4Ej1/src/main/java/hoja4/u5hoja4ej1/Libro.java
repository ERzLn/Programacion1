/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.u5hoja4ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Libro extends Publicacion {

    private int numPaginas;

    public Libro(String titulo, String autor, int dia, int mes, int anio) {
        super(titulo, autor, dia, mes, anio);
        System.out.println("Introduce el numero de paginas del libro:");
        numPaginas = new Scanner(System.in).nextInt();
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "Libro: \n" + titulo + "\n" + autor + "\n" + fecha + "\n" + numPaginas;
    }

}
