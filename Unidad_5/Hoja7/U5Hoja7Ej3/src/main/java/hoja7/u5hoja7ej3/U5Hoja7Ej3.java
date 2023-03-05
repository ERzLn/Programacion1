/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja7.u5hoja7ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja7Ej3 {

    public static void main(String[] args) {
        System.out.println("Introduce el rango que deseas:");
        int a=new Scanner(System.in).nextInt();
        int b=new Scanner(System.in).nextInt();
        System.out.println(comprobar(a, b));
    }
    public static int comprobar (int a, int b) {
        Scanner entrada = new Scanner(System.in);
        int numTeclado=0;
        boolean valido = false;

        do {
            try {
                System.out.println("Introduce un numero:");
                numTeclado = new Scanner(System.in).nextInt();
                if (numTeclado < a || numTeclado > b) {
                    throw new Exception("El numero no se encuentra en un rango entre "+a+" y "+b);
                } else {
                    System.out.println("El numero se encuentra en el rango correcto");
                }
                valido = true;

            } catch (InputMismatchException ex) {
                System.out.println("error no es un numero valido");
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        } while (!valido);
        return numTeclado;
    } 
}
