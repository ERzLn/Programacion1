/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u3hoja4.u3hoja4ej7;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U3Hoja4Ej7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero natural: ");
        int x = entrada.nextInt();

        System.out.println("Introduzca la opción que desea: \n  1) Contar cuantas cifras tiene el número\n  2) Muestra sus 10 primeros múltiplos\n  3) Muestra si es perfecto\n  0) Salir");
        int opcion;
        do {
            Operaciones op = new Operaciones(x);
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 ->
                    op.metodo1();
                case 2 ->
                    op.metodo2();
                case 3 ->
                    op.metodo3();
                case 4 -> {
                    System.out.println("Introduzca un nuevo numero:");

                    x = entrada.nextInt();
                }

                case 0 ->
                    System.out.println("¡¡HASTA LA PROXIMA!!");
                default -> 
                    System.out.println("¡Opcion incorrecta!");

            }
            System.out.println("\nIntroduzca la opción que desea: \n  1) Contar cuantas cifras tiene el número\n  2) Muestra sus 10 primeros múltiplos\n  3) Muestra si es perfecto\n  4)Introducir un numero nuevo\n  0) Salir");

        } while (opcion != 0);

    }
}
