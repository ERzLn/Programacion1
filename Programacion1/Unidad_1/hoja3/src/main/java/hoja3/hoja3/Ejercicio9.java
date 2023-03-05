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
public class Ejercicio9 {

    /**
     9.Pide dos números por teclado al usuario: a y b. Deberá mostrarse true si
ambos números son iguales y false en caso contrario.
     * @param args
     */
    public static void main(String[] args) {
       
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el valor de a: ");
        int a=entrada.nextInt();
        
        System.out.println("Introduce el valor de b: ");
        int b=entrada.nextInt();
        
        boolean igual= (a==b);
        System.out.println("Si ambos numeros son iguales el resultado es true: "+igual);
    }
    
}
