/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u3hoja5.u3hoja5ej2;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U3Hoja5Ej2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el número de lineas: ");
        int lineas = entrada.nextInt();

        for (int linea = 1; linea <= lineas; linea++) {
            for (int impar = 9; linea % 2 == 0 && impar >= 1; impar--) {
                System.out.print(impar);
            }

            for (int par = 1; linea % 2 != 0 && par <= 9; par++) {
                System.out.print(par);
            }
            System.out.println();
        }
    }
}
