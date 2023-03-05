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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*3. Modifica el ejercicio 2 para que, indicando dos números n y m, diga que
cantidad hay que sumarle a n para que sea múltiplo de m.*/
       
 int n;
int suma;
int x;

int m;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el numero entero:" );
        n= entrada.nextInt();
        
        System.out.println("Escribe el numero para ser multiplo");
        m=entrada.nextInt();
        
        x=n%m;
        suma=m-x;
        System.out.println("Hay que sumar "+suma+" para que sea multiplo de "+m);
        
    }
    
}
