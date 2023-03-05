/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author xboxr
 */
public class Ejercicio5 {

    public static void main(String[] args) {
            
 /*4. Programa que declara e inicializa dos variables: altura y base de un triángulo,
asigna a altura el valor 12.2 y a la base el valor 10, estos datos deben ser pedidos por
pantalla (Utiliza la clase scanner) y luego nos visualiza el área correspondiente.
El área del triángulo es:61,00*/
 
 Scanner entrada= new Scanner(System.in);
 double base;
 double altura;
 
 System.out.println("Introduce la base del triangulo");
 base= entrada.nextDouble();
 
 System.out.println("Introduce la altura del triangulo");
 altura=entrada.nextDouble();
 double area= base*altura/2;
 System.out.println("El area del triangulo es: " + area);
 
    
}
}