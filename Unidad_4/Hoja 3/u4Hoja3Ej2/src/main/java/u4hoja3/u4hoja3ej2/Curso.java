/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4hoja3.u4hoja3ej2;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Curso {

    private String nombreCurso;
    private String[] ar;

    public Curso(String nombreCurso, int numAlumnos) {
        this.nombreCurso = nombreCurso;
        ar = new String[numAlumnos];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Introduce el nombre del alumno " + (i + 1));
            Scanner entrada = new Scanner(System.in);
            ar[i] = entrada.next();
        }
    }

    public void iniciales() {
        for (int i = 0; i < ar.length; i++) {;
            System.out.print(ar[i].substring(0, 1) + ".");

        }
        System.out.println("");
    }

    public void desplaza() {
        String ultimo = ar[ar.length - 1];

        for (int i = (ar.length - 1); i >= 0; i--) {

            if (i > 0) {
                ar[i] = ar[i - 1];
            }
            ar[0] = ultimo;

        }
        for (int i = 0; i <= ar.length - 1; i++) {
            System.out.print(ar[i] + " ");
            if (i == ar.length - 1) {
                System.out.println("");
            }
        }
    }

    public void verNombre(int posicion) {
        if (posicion >= ar.length) {
            System.out.println("El nombre del alumno en la posición " + posicion + " es: " + ar[(posicion - 1)]);
        } else {
            System.out.println("Numero no valido");
        }
    }

    public boolean esDaw() {
        return nombreCurso.toUpperCase().contains("DAW");
    }

}
