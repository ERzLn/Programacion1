/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja7.u5hoja7ej4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja7Ej4 {
    
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
        int contador = 0;

        do {
            try {
                contador++;
                System.out.println("Introduce un numero:");
                numTeclado = new Scanner(System.in).nextInt();
                if (numTeclado < a || numTeclado > b) {
                    throw new Exception("El numero no se encuentra en un rango entre "+a+" y "+b+"\nNumero de intentos: " + contador);
                } else {
                    System.out.println("El numero se encuentra en el rango correcto\nNumero de intentos: " + contador);
                    System.out.println("El numero es: "+numTeclado);
                }
                valido = true;

            } catch (InputMismatchException ex) {
                System.out.println("error no es un numero valido\nNumero de intentos: " + contador);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        } while (!valido);
        return numTeclado;
    } 
}