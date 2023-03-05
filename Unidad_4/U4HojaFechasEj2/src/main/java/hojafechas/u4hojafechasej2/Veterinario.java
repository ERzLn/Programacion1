/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojafechas.u4hojafechasej2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Veterinario {

    private Mascota[] mascotas;
    private int contador;

    public Veterinario() {
        contador = 0;
        mascotas = new Mascota[500];
    }

    public void añadir() {
        System.out.println("Introduce el nombre de la mascota: ");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        System.out.println("Introduce la fecha de nacimiento (dd-mm-yyyy): ");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha = LocalDate.parse(entrada.nextLine(), format);
        mascotas[contador] = new Mascota(nombre, fecha);
        contador++;
    }

    public String mostrar() {
        String datosTotales = " ";
        for (int i = 0; i < contador; i++) {
            datosTotales += mascotas[i].toString() + " ";
        }
        return datosTotales;
    }

    public String mostrarMayores() {
        String datosTotales = " ";
        for (int i = 0; i < contador; i++) {
            if (mascotas[i].getEdad() > 5) {
                datosTotales += mascotas[i].toString() + " ";
            }
        }
        return datosTotales;
    }

}
