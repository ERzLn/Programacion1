/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author xboxr
 */
public class Ejercicio8 {

    public static void main(String[] args) {
     /* 8. Programa que pide por teclado el radio de un círculo, y visualiza luego su longitud y
su área.
Utiliza la clase scanner y Math y y los valores pueden contener decimales.*/
     
     double radio;
     Scanner entrada= new Scanner(System.in);
    System.out.println("Introduce el radio del circulo");
    radio=entrada.nextDouble();
    
    double longitud;
    longitud=2*Math.PI*radio;
    
    double area;
    area= Math.PI*Math.pow(radio, 2);
    
    System.out.printf("La longitud del circulo es %,.2f\n", longitud);
    System.out.printf("El area del circulo es %,.2f\n", area);
    
     
     
    }
    
}
