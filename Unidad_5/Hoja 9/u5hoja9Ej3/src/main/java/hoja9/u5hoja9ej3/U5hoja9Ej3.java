/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.u5hoja9ej3;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5hoja9Ej3 {

    public static void main(String[] args) {
        System.out.println("Introduce el tamaño del array:");
        int tamanio=new Scanner(System.in).nextInt();
        int []array=new int[tamanio];
        System.out.println("Introduce la posicion del array que quiere conocer:");
        int pos=new Scanner(System.in).nextInt()-1;
        try{
            System.out.println(array[pos]);
        }catch (ArrayIndexOutOfBoundsException aio){
            System.out.println("ERROR");
            System.out.println(aio.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
