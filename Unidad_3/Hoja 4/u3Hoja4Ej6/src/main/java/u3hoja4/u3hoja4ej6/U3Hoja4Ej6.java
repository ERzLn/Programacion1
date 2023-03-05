/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u3hoja4.u3hoja4ej6;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U3Hoja4Ej6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int cantidad = 0;
        do {
            System.out.println("DOBLE O NADA \n 1)Apostar \n 2)Retirarse \n 0) Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    if (cantidad == 0) {
                        System.out.println("Introduzca la cantidad en Euros a apostar: ");
                        cantidad = entrada.nextInt();
                    }
                    if (1 + (int) (Math.random() * 2) == 1) {
                        System.out.println("¡¡ENHORABUENA!! Ahora tienes:" + (cantidad = cantidad * 2) + "€");
                    } else {
                        System.out.println("LO SENTIMOS, has perdido todo. Saldo: " + (cantidad = cantidad * 0) + "€");
                    }
                }
                case 2 ->
                    System.out.println("¡¡HASTA LA PROXIMA!! Tu saldo disponible es: " + cantidad + "€");
                case 0 ->
                    System.out.println("¡¡ADIOS!! Has retirado: " + cantidad + "€");
                default -> {
                }
            }
        } while (opcion != 0);
    }
}
