/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u3hoja1.u3hoja4ej2;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U3Hoja4ej2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double totDonativos = 0;
        int numDonativos=0;
        for (numDonativos=0; totDonativos <= 600; numDonativos++) {
            System.out.println("Ingrese la cantidad que desea donar: ");
            totDonativos += entrada.nextDouble();
            System.out.println("La cantidad donada hasta ahora es de: " + totDonativos + "€");
            
        }
        System.out.println("¡¡GRACIAS!! Hemos llegado a 600€ donados");
        System.out.println("El numero de donativos ha sido de: "+numDonativos);
    }
}
