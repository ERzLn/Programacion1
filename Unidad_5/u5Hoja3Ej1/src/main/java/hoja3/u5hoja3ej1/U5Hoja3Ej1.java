/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.u5hoja3ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja3Ej1 {

    public static void main(String[] args) {
        System.out.println("Introduce el radio y la altura del cono (cm): ");
        Scanner entrada=new Scanner(System.in);
        
        Cilindro cilindro=new Cilindro(entrada.nextDouble(),entrada.nextDouble());
        System.out.println("El area del cilindro es: "+cilindro.area()+"cm cuadrados");
        System.out.println("El volumen del cilindro es: "+cilindro.volumen()+"cm cuadrados");
    }
}
