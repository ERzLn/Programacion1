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
public class Ejercicio8 {

    /**
     8. Una empresa que gestiona un parque acuático te solicita una aplicación que les
ayude a calcular el importe que hay que cobrar en taquilla por la compra de una
serie de entradas (cuyo número será introducido por el usuario). Existen dos tipos
de entrada: infantiles, que cuestan 15,50€; y de adultos, que cuestan 20€.
En el caso de que el importe total sea igual o superior a 100€, se aplicará
automáticamente un bono descuento del 5%.
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el numero de entradas infantiles a comprar: ");
        int entradasIn=entrada.nextInt();
        float totentradasIn= (float) ((int) entradasIn*15.5);
        
        System.out.println("Introduce el numero de entradas para adultos a comprar: ");
        int entradasA=entrada.nextInt();
        int totentradasA=entradasA*20;
        
        float total= totentradasIn+totentradasA;
        
        
        if (total<100){
        System.out.println("El precio total de las entradas es: "+ total+"€");    
        }
        else if (total>100){
        float totaldes=total-(total*10/100);
        System.out.println("El precio total de las entradas con un 10% de descuento es: "+totaldes+"€");
    }
    }
    
}
