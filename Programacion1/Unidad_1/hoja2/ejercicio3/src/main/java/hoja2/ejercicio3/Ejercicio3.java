/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author xboxr
 */
public class Ejercicio3 {

    public static void main(String[] args) {
    
    
    /*3. Programa que declara una variable que almacenará el precio de una vivienda que
se pide por teclado su valor, por ejemplo 224000.70 euros, después nos visualiza
dicho precio en euros y en pesetas.
El precio de la vivienda en euros es: 224.000,70
El precio de la vivienda en pesetas es: 37.270.580*/
    
    
    Scanner precioeuros= new Scanner (System.in);
    
    float precio;
    
    System.out.println("Introduce en euros el importe en euros a convertir en pesetas");
    
    precio=precioeuros.nextFloat();
    
    int precioPesetas= (int)(precio*166.386);
    
    System.out.println("El precio de la vivienda en pesetas es "+ precioPesetas);
    

    
        
    
    
    
}
}


