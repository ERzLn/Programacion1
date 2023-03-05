/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author xboxr
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int nota1;
        int nota2;
        
        Scanner teclado= new Scanner (System.in) ;
        System.out.println("Introduce la primera nota");
        nota1=teclado.nextInt();
        System.out.println("Introduce la segunda nota");
        nota2=teclado.nextInt();
        
        
        float resultado=(nota1+nota2)/2; 
        //lo convierte a decimal pero trunca
        System.out.println("la nota media es :"+resultado);
        System.out.println("la nota media es:"+ ((nota1+nota2)/2));
       //lo devuelve truncado pero como si fuera un entero
        float nota3=8;
        int   nota4=3;
        float resultado1=(nota3+nota4)/2;
        System.out.println("la nota media es :"+resultado1);
        System.out.println("la nota media es:"+ ((nota3+nota4)/2));
        //para mantener los decimales y que no realice un truncado 
        
        //la forma mas correcta es realizando el casting al tipo de dato de destino
        resultado=(float)(nota1+nota2)/2;
        System.out.println("la nota media es :"+resultado);
    }
}
