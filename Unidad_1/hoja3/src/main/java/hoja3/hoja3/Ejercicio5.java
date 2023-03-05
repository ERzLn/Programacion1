/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.hoja3;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author xboxr
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*5. Diseña una aplicación que solicite al usuario que introduzca una cantidad de
segundos. La aplicación debe mostrar cuántas horas, minutos y segundos hay
en el número de segundos introducidos por el usuario.*/
        
        int segundosT;
        int horas;
        int minutos;
        int segundos;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca los segundos a convertir ");
        segundosT= entrada.nextInt();
        
        horas= segundosT/3600;
        minutos= segundosT%3600/60;
        segundos=segundosT%3600%60;
        
        System.out.println("El resultado es: Horas:"+horas+" Minutos: "+minutos+" Segundos: "+ segundos);
    }
    
}
