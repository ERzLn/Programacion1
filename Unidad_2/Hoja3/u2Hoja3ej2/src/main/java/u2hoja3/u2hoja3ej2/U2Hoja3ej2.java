/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u2hoja3.u2hoja3ej2;

import java.util.Scanner;

/**
 *
 * @author xboxr
 */
public class U2Hoja3ej2 {

    public static void main(String[] args) {
        
        Numero n1=new Numero();
        Numero n2=new Numero();
        Numero n3=new Numero();
        Numero n4=new Numero(5);
        Numero n5=new Numero(10);
        Numero n6=new Numero(10);
        System.out.println("Suma: "+ n1.suma(15));
        System.out.println("Resta: "+n2.resta(45));
        System.out.println("Numero Interno: "+n3.dameNumero());
        System.out.println("Doble: "+n4.doble());
        System.out.println("Triple: "+n5.triple());
        System.out.println("Variar numero interno: ");
        Scanner entrada= new Scanner(System.in);
        int numInt=entrada.nextInt();
        System.out.println("El numero interno es: "+n6.ponNumero(numInt));
    }
}
