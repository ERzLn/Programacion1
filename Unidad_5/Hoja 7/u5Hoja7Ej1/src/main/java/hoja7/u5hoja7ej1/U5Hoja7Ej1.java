/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja7.u5hoja7ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja7Ej1 {


    public static int enteros() {
        Scanner entrada = new Scanner(System.in);
        int entero = 0;
        boolean a = false;
        while (!a) {
            System.out.print("Ingrese un número entero: ");
            try {
                entero = entrada.nextInt();
                a = true;
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un número entero válido.");
                entrada.nextLine();
            }
        }
        return entero;
    }

    public static double doubles() {
        Scanner entrada = new Scanner(System.in);
        double doubl = 0.0;
        boolean a = false;
        while (!a) {
            System.out.print("Ingrese un número de tipo Double: ");
            try {
                doubl = entrada.nextDouble();
                a = true;
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un número de tipo Double válido.");
                entrada.nextLine();
            }
        }
        return doubl;
    }
    public static void main(String[] args) {
        enteros();
        doubles();
    }
}
