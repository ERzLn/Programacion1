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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    /*10. Se realiza una competición donde cada participante escribe un algoritmo en
papel y lo lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del
concursoes que la longitud del lanzamiento se mide en metros, con tantos
decimales como se desee, pero el ranking solo se tiene en cuenta la longitud en
centímetros sin decimales. Por ejemplo, para un lanzamiento de 12,3456 metros,
solo se contabilizan 1234 centímetros.
Realiza un programa que solicite la longitud (en metros) de un lanzamiento y
muestre la parte entera correspondiente en centímetros.*/
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el numero de metros (con decimales si se desea) lanzados" );
        float metros=entrada.nextFloat();
        int cm;
        cm=(int) (metros*100);
        
        System.out.println("El numero de centimetros lanzados son: "+cm+"cm");
        
    }
    
}
