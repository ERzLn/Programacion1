/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio7;

/**
 *
 * @author xboxr
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        /* 7. Programa que asigna los valores sin pedirlos por pantalla a una variable a el valor
23 y a otra variable b el valor 56. Intercambiar el valor de dichas variables y mostrar
por pantalla el valor que tenían antes y después del intercambio.*/
        
        int a=23;
        int b =56;
        
        System.out.println("El valor de a y b antes de intercambiarlos es a: "+ a +" b: "+ b);
        
        a= a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("El valor de a y b despues de intercambiarlos es a: "+a+ " b: "+b );
        
        
        
    }
    
}
