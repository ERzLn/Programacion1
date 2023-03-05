/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2hoja9.u2hoja9ej2;

/**
 *
 * @author Eloy
 */
public class Alimento {

    private String nombre;
    private double grasa, hidratos;
    private boolean origenAnimal;

    public Alimento(String nombre, double grasa, double hidratos, boolean origenAnimal) {
        this.nombre = nombre;
        this.grasa = grasa;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getGrasa() {
        return grasa;
    }

    public double getHidratos() {
        return hidratos;
    }

    public String isOrigenAnimal() {
        String salida=(origenAnimal)? "si":"no";
        return salida;
        


    }

    public void todo() {
        System.out.println("Nombre: " + nombre + " \n Grasas: " + grasa + "\n Hidratos: " + hidratos + "\n Origen Animal: " + origenAnimal);
    }

    public boolean esDietetico() {
        boolean esDietetico = grasa < 12 && !origenAnimal;
        return esDietetico;
    }

    public double calorias(int gramosAlimento) {
        double calorias = gramosAlimento * (grasa * 5.3 + hidratos * 2.1);
        return calorias;
    }
}
