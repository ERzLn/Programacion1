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
public class Ejercicio1 {

    public static void main(String[] args) {
    /*1. Un economista te ha encargado un programa para realizar cálculos con el IVA.
La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
Muestra en pantalla el importe correspondiente al IVA y al total.*/  
     Scanner teclado=new Scanner(System.in);
     double baseimponible;
     double IVA;
     
     System.out.println("Introduce la base imponible a aplicar");
     baseimponible=teclado.nextInt();
     
     System.out.println("Introduce el IVA a aplicar");
     IVA= teclado.nextDouble();
     
     double IVAr=(baseimponible*IVA/100); //IVA total a aplicar
     double total=IVAr+baseimponible;
     
     System.out.println("El importe correspondiente al IVA es: "+ IVAr );
     System.out.println("El importe total es: "+total);
    }
    
}
