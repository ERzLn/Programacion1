/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.u5hoja4ej1;

/**
 *
 * @author DAW122
 */
public class Disco extends Publicacion {

    private int duracionMinutos;

    public Disco(int duracionMinutos, String titulo, String autor, int dia, int mes, int anio) {
        super(titulo, autor, dia, mes, anio);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Disco: \n" + "Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Fecha: " + fecha + "\n" + "Duracion: " + duracionMinutos;
    }
}
