/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja8.u4hoja8ej2;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U4Hoja8Ej2 {

    public static void main(String[] args) {
       Multiplicar array=new Multiplicar();
       
       array.multiplica();
       
       array.muestra();
       
       System.out.println();
       System.out.println();
       
       int[]valoresAspa=array.valoresAspa();
       for(int i=0;i<valoresAspa.length;i++){
           System.out.print(" "+valoresAspa[i]);
       }
       System.out.println();
       System.out.println();
       
       Scanner entrada=new Scanner(System.in);
       System.out.println("Introduce el numero de la tabla de multiplicar que desea: ");
       
       int n=entrada.nextInt();
       int[]tablaMultiplicar=array.tablaMultiplicar(n);
       for(int i=0;i<tablaMultiplicar.length;i++){           
           System.out.print(" "+tablaMultiplicar[i]);
       }
    }
}
