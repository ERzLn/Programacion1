/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u3hoja5.u3hoja5ej1;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U3Hoja5Ej1 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduzca el numero de filas de la pirámide: ");
        int filasEntrada=entrada.nextInt();
        System.out.println();
        
        for(int fila=1;fila<=filasEntrada;fila++){
        
          for (int filasEspacio=1; filasEspacio<=filasEntrada-fila;filasEspacio++){
            System.out.print(" ");
          } 
          for(int asteriscos=1;asteriscos<=(fila*2)-1;asteriscos++){
            System.out.print("*");
          }
        System.out.println();
    }
}}