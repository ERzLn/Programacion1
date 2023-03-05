/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoja3.hoja3;

import java.util.Scanner;

/**
 *
 * @author xboxr
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*2. Escribe un programa que tome como entrada un número entero e indique
que cantidad hay que sumarle para que el resultado sea múltiplo de 7.
Un ejemplo:
• A 2 hay que sumarle 5 para que el resultado sea múltiplo de 7.
• A 13 hay que sumarle 1 para que el resultado sea múltiplo de 7.
Si proporcionas el número 2 o el número 13, la salida de la aplicación debe ser 5
0 1, respectivamente.
Pista: El operador módulo puede ser útil para solucionar la actividad.*/

int entero;
int suma;
int x;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el numero entero:" );
        entero= entrada.nextInt();
        
        x=
                entero%7;
        suma=7-x;
        System.out.println("Hay que sumar "+suma+" para que sea multiplo de 7");
        
        
    }
    
}
