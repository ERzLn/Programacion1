/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u3hoja2.u3hoja2ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U3Hoja2ej2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el dia del mes (1-31): ");
        int x=entrada.nextInt();
        
         String dia = switch (x){
             case 1,8,15,22,29 -> "Lunes";
             case 2,9,16,23,30 -> "Martes";
             case 3,10,17,24,31 -> "Miércoles";
             case 4,11,18,25 -> "Jueves";
             case 5,12,19,26 -> "Viernes";
             case 6,13,20,27 -> "Sábado";
             case 7,14,21,28 -> "Domingo";
             default -> "No has introducido un dia del 1 al 31";
         };
         System.out.println("El dia "+x+" cae en: "+dia);
    }
}
