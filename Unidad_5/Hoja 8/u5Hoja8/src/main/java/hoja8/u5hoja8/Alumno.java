/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.u5hoja8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Alumno {

    private String nombre;
    private int[] notas;

    public Alumno(int notasTotales) {
        boolean control = false;

        System.out.println("Introduce el nombre del alumno: ");
        nombre = new Scanner(System.in).nextLine();
        notas = new int[notasTotales];

        for (int i = 0; i < notas.length; i++) {
            try {
                System.out.println("Introduzca la nota " + (i + 1) + " :");
                notas[i] = new Scanner(System.in).nextInt();
                if (notas[i] > 10 || notas[i] < 0) {
                    throw new Exception("La nota tiene que estar comprendida entre 0 y 10.");
                }
            } catch (InputMismatchException a) {
                System.out.println("Debes introducir numeros enteros unicamente.");
                System.out.println("Introduzca la nota correctamente: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Introduzca la nota correctamente: ");
                i--;
            }
        }
    }

    public void mostrar() {
        System.out.println("El nombre del alumno es: " + nombre);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + " : " + notas[i]);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
