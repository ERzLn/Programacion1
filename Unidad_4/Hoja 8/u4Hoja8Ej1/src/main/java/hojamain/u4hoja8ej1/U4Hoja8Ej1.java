/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hojamain.u4hoja8ej1;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U4Hoja8Ej1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Array arr = new Array();
        
        int opcion;
        do {
            System.out.println("---- INTRODUCE LA OPCION ---");
            System.out.println();
            System.out.println("1) MOSTRAR ARRAY");
            System.out.println("2) INTRODUCIR ARRAY");
            System.out.println("3) MEDIA DE LOS VALORES DEL ARRAY");
            System.out.println("4) MODIFICAR VALOR DE UNA POSICION");
            System.out.println("5) ROTAR ARRIBA");
            System.out.println("6) ROTAR ABAJO");
            System.out.println("7) COMPARAR NUMERO ENTRE DOS ARRAYS");
            System.out.println("8) SUMAR LOS NUMEROS PARES DEL ARRAY");
            System.out.println("9) RELLENA ARRAY CON UN NUMERO ESCOGIDO Y SUS MULTIPLOS");
            System.out.println("0) PARA SALIR");
            System.out.println();
            opcion = entrada.nextInt();
            switch (opcion) {

                case 1 ->
                    arr.mostrar();

                case 2 ->
                    arr.introducir();

                case 3 ->
                    System.out.println("LA MEDIA ES: " + arr.media());

                case 4 -> {
                    System.out.println("SELECIONA LA POSICION A MODIFICAR");
                    int pos = new Scanner(System.in).nextInt();
                    System.out.println("INTRODUCE EL NUMERO PARA LA POSICION: " + pos);
                    int num = new Scanner(System.in).nextInt();
                    arr.modificar(num, pos);
                }

                case 5 ->
                    arr.rotarIzquierda();

                case 6 ->
                    arr.rotarDerecha();

                case 7 -> {
                    Array a = new Array();
                    a.introducir();
                    arr.comparar(a);
                }

                case 8 ->
                    arr.sumaPares();

                case 9 -> {
                    System.out.println("INTRODUCE EL NUMERO PARA RELLENA CON SUS MULTIPLOS");
                    int mult = new Scanner(System.in).nextInt();
                    arr.multiplos(mult);
                }
                case 0 ->
                    System.out.println("¡¡HASTA LA PROXIMA!!");
                    
                default -> System.out.println("OPCIÓN NO VALIDA");
            }
        } while (opcion != 0);

    }
}
