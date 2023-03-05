/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja3.u3hoja3ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Calculo {

    Scanner entrada = new Scanner(System.in);

    public static void metodo1() {
        int x = 10;
        System.out.println("¡¡CUENTA ATRÁS!!");
        while (x <= 10 && x >=1 ) {
            System.out.println(x);
            x--;
        }
        System.out.println("¡DESPEGUE!");
    }

    public static void metodo2() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce 10 numeros enteros: ");
        int i = 10;
        int positivos = 0;
        int negativos = 0;
        int nulos = 0;
        while (i <= 10 && i >= 1) {
            int n = entrada.nextInt();
            if (n < 0) {
                negativos++;
            } else if (n == 0) {
                nulos++;
            } else if (n > 0) {
                positivos++;
            } else {
                System.out.println(" No has introducido un numero");
            }
            i--;

        }
        System.out.println("Has introducido:\n" + positivos + " positivos\n" + negativos + " negativos\n" + nulos + " nulos");
    }

    public static void metodo3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce numero para calcular su factorial: ");

        int numeroIni = entrada.nextInt();
        int numero = numeroIni;
        int factorial = 1;
        while (numero > 10) {
            factorial = factorial * numero;
            numero--;
        }

        System.out.println("El factorial de " + numeroIni + " es: " + factorial);
    }

    public static void metodo4() {
        Scanner entrada = new Scanner(System.in);

        String aux = "";
        String finalizar = ".";
        int tamanoCadena = 0;
        System.out.println("Introduce la serie de caracteres a contar.(Se finaliza introduciendo '.': ");
        while (!aux.equals(finalizar)) {

            aux =new Scanner(System.in).next();

            tamanoCadena += aux.length();

        }
        System.out.println("El tamaño de la cadena es de: " + (tamanoCadena - 1) + " caracteres");
    }

    public static void metodo5() {
        Scanner entrada = new Scanner(System.in);
        int cantidadNumeros = 0;
        int sumaNumeros = 0;
        int numero = 0;
        System.out.println("Introduce los numeros para calcular su media (Se finalizará al introducir un numero negativo): ");
        while (numero >= 0) {
            numero = entrada.nextInt();
            if (numero >= 0) {
                sumaNumeros += numero;
                cantidadNumeros++;
            }

            
        }
        System.out.println("La media de los numeros introducidos es de: " + (sumaNumeros / cantidadNumeros));
    }

}
