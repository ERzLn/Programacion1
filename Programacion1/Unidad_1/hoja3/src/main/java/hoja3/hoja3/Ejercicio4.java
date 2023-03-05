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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*4. Dado el siguiente polinomio de segundo grado: y=ax2+bx+c crea un programa
que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor
correspondiente de y.*/
       int a;
       int b,c,x;
       Scanner entrada=new Scanner(System.in);
       System.out.println("Introduce el valor de a ");
       a=entrada.nextInt();
       System.out.println("Introduce el valor de b ");
       b=entrada.nextInt();
       System.out.println("Introduce el valor de c ");
       c=entrada.nextInt();
       System.out.println("Introduce el valor de x ");
       x=entrada.nextInt();
       int y= (int) ((a*Math.pow(x, 2))+b*x+c);
       
       System.out.println("El resultado de la ecuacion es: "+y);
    }
    
}
