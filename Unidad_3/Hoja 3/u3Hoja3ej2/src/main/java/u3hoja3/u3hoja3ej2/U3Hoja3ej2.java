/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u3hoja3.u3hoja3ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U3Hoja3ej2 {

    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion=1;

        while (opcion > 0 || opcion < 0) {
            System.out.println("Seleccione la opción que desee (pulse '0' para finalizar):  ");
            System.out.println(" \n  1) Cuenta atrás \n  2) Numero de positivos, negativos o nulos en 10 numeros \n  3) Factorial de un numero \n  4) Contador de caracteres \n  5) Media de numeros naturales");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 ->
                    Calculo.metodo1();
                case 2 ->
                    Calculo.metodo2();
                case 3 ->
                    Calculo.metodo3();
                case 4 ->
                    Calculo.metodo4();
                case 5 ->
                    Calculo.metodo5();
                default -> System.out.println("No has introducido una opcion valida.");

            };
            if (opcion ==0 ) {
                System.out.println("¡¡HASTA LUEGO!!");
            }
        }
    }
}
