/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u3hoja2.u3hoja2ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U3Hoja2ej1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce el numero del dia de la semana");
        byte diaSem=entrada.nextByte();
        
        String dia= switch (diaSem){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";    
            default ->"Debes poner un numero del 1 al 7";
        };
        System.out.println("El dia de la semana "+diaSem+" es el: "+dia);
    }
}
