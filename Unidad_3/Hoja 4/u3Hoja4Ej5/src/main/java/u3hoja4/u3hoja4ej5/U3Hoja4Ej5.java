/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u3hoja4.u3hoja4ej5;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U3Hoja4Ej5 {

    public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in);
     int nMin=100;
     int nMax=0;
     
     
     for(int nVeces=1;nVeces<=10;nVeces++){
         int n =1+(int)(Math.random()*100);
         System.out.println(n);
         
         if(n<nMin)nMin=n;
         if(n>nMax)nMax=n;
         
         if (nVeces==10){
             System.out.println("El numero aleatorio Máximo ha sido: "+ nMax);
             System.out.println("El numero aleatoria Mínimo ha sido: "+nMin);
             break;
         }
     }
    }
}
