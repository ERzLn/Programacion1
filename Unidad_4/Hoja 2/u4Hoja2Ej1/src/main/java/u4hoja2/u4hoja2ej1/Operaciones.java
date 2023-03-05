/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4hoja2.u4hoja2ej1;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Operaciones {

    private int[] ar;

    public Operaciones() {
        ar = new int[5];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            Scanner entrada = new Scanner(System.in);
            ar[i] = entrada.nextInt();
        }
    }

    public void doble() {

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (ar[i] * 2);
        }

    }

    public void mostrar() {
        for (int i = 0; i < ar.length; i++) {
            System.out.println("El doble del " + (i + 1) + "º es " + ar[i]);
        }
    }

    public void sumaSoloPares() {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                ar[i] += ar[i];
                if (i == (ar.length - 1)) {
                    System.out.println("\nLa suma de los numeros pares es: " + (ar[i] / 2));
                }
            }
        }
    }
}
