/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.u5hoja3ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Profesor extends Persona {

    private String[] asignaturas;

    public Profesor(int numAsignaturas) {
        super();
        asignaturas = new String[numAsignaturas];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Introduce asignatura " + (i + 1));
            asignaturas[i] = entrada.nextLine();
        }
    }

    public String mostrar() {
        String mostrar = "";
        for (int i = 0; i < asignaturas.length; i++) {
            mostrar += asignaturas[i] + " ";
        }
        return "Las asignaturas de " + super.getNombre() + " son: " + mostrar;
    }
}
