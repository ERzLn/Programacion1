/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u3hoja2.u3hoja2ej3;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U3Hoja2ej3 {

    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
        System.out.println("Escoge una opcion:\n 1)Cuadrado de un numero \n 2)El doble de un numero\n 3)Raiz cuadrada de un numero");
        int x=entrada.nextInt();
        System.out.println("Escribe el numero a calcular: ");
        int y=entrada.nextInt();
        String opcion= switch (x){
            case 1 -> "El cuadrado de "+y+" es: "+Math.pow(y, 2);
            case 2 -> "El doble de "+y+" es: "+y*2;
            case 3 -> "La raiz de "+y+" es: "+ Math.sqrt(y);
            default -> "La opción escogida no es valida";
        };
        
        System.out.println(opcion);
    }
}
