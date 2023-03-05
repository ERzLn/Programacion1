/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //objeto de la clase Circulo que se llame c1 utilizando el constructor por defecto
        Circulo c1 = new Circulo();  //Creamos los objetos
        Circulo c2 = new Circulo(10);

        Scanner entrada = new Scanner(System.in); //El valor de c3 lo pedimos por pantalla
        System.out.println("Introduce el valor de c3: ");
        double x = entrada.nextDouble();
        Circulo c3 = new Circulo(x);

        c1.setRadio(5);
        System.out.println("El radio de c1 es: "+ c1.getRadio()); //Mostramos el radio de c1
        
        System.out.println("El valor del radio de c3 es: "+c3.getRadio());
        System.out.printf("El area de c2 es: % ,.2f\n",c2.area());
        System.out.printf("El area de c3 es: % ,.2f y la longitud es: % ,.2f\n",c3.area(), (c3.longitud()) );
        
    }
}
