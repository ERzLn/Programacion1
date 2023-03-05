/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author xboxr
 */
public class Ejercicio6 {
public static void main(String[] args) {
    

       /*6. Programa que declare una variable para almacenar el radio de un cilindro y otra que
permita almacenar su altura. Asigna a ambas variables un valor y visualiza luego:
a. Su área lateral es igual Al = 2* PI* r* h
b. Su volumen es igual V= PI * r^2 * h
Utiliza la clase scanner y Math y los valores pueden contener decimales. */
        
        Scanner entrada= new Scanner(System.in);
        
        double radio;
        double altura;
        System.out.println("Introduce el radio del cilindro");
        
        radio=entrada.nextDouble();
        
        System.out.println("Introduce la altura del cilindro");
        altura=entrada.nextDouble();
        
        double areal;
        areal= (2*Math.PI*radio*altura);
        System.out.printf("El area lateral del cilindro es %,.2f\n",areal);
        
        double volumen;
        volumen=Math.PI*Math.pow(radio, 2)*altura;
        System.out.printf("El volumen del cilindro es %,.2f\n",volumen);
        
        
}
}