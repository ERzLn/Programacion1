/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4hoja2.u4hoja2ej2;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Vectores {

    private int[] ar = new int[5];

    public Vectores() {
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Introduce el numero " + (i + 1) + "º: ");
            Scanner entrada = new Scanner(System.in);
            ar[i] = entrada.nextInt();
        }
    }

    public void menor() {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < menor) {
                menor = ar[i];
            }
        }
        System.out.println("\n El numero menor es " + menor);
    }

    public void mayor() {
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > mayor) {
                mayor = ar[i];
            }
        }
        System.out.println(" El numero mayor es " + mayor);
    }

    public void media() {
        int suma = 0;
        for (int i = 0; i < ar.length; i++) {            
            suma += ar[i];            
             if ((i + 1) == ar.length) {
               System.out.println("\nLa media de todos los numeros es: " + (suma / ar.length));
            }
        }
    }
}

