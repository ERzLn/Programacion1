/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja4.u3hoja4ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Clase {

    public static void metodo1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero para mostrar todos sus divisores: ");
        int n = entrada.nextInt();
        for (int div = 1; n >= div; div++) {
            if (n % div == 0) {
                System.out.println("Divisor de " + n + " : " + div);
            }
        }
    }

    public static void metodo2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int n1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int n2 = entrada.nextInt();
        int n1aux = n1;
        int n2aux = n2;
        int totN1aux = 0;
        int totN2aux = 0;
        while (n1 > n2aux) {
            n2aux++;
            if (n1 > n2aux && n2aux % 2 != 0) {
                System.out.println(n2aux + " numero impar entre " + n1 + " y " + n2);
                totN2aux += n2aux;

            }
        }
        if (n1 > n2) {
            System.out.println("La suma de los numeros impares comprendidos entre " + n1 + " y " + n2 + " es: " + totN2aux);
        }

        while (n2 > n1aux) {
            n1aux++;
            if (n2 > n1aux && n1aux % 2 != 0) {
                System.out.println(n1aux + " numero impar entre " + n2 + " y " + n1);
                totN1aux += n1aux;
            }
        }
        if (n2 > n1) {
            System.out.println("La suma de los numeros impares comprendidos entre " + n2 + " y " + n1 + " es: " + totN1aux);
        }
    }

    public static void metodo3() {
        System.out.println("Introduce un numero positivo para saber su tabla de multiplicar (pulsa 0 para salir): ");
        Scanner entrada = new Scanner(System.in);
        int multiplicador = 1;
        int numero = entrada.nextInt();
        do {
            if (numero < 0) {
                System.out.println("No has introducido un numero positivo");
                System.out.println("Introduce un numero positivo para saber su tabla de multiplicar (pulsa 0 para salir): ");
                numero = entrada.nextInt();
            } else if (numero > 0 && multiplicador <= 10) {
                System.out.println(numero + " X " + multiplicador + " = " + numero * multiplicador);
                multiplicador++;
            } else if (multiplicador > 10) {
                multiplicador = 0;
                System.out.println("Introduce un numero positivo para saber su tabla de multiplicar (pulsa 0 para salir): ");
                numero = entrada.nextInt();
            } else {
                System.out.println("¡¡HASTA LUEGO!!");
            }
        } while (numero != 0);
    }

    public static void metodo4() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el Dividendo: ");
        int numA = entrada.nextInt();

        System.out.println("Introduce el Divisor: ");
        int numB = entrada.nextInt();

        int cociente = 0;
        int resto = 0;
        /*do{
          System.out.println("numero A: "+numA+" Numero B: "+numB+" = "+ (numA-=numB));
           resta++;
          
        }*/
        for (int i = numA; i >= numB; i -= numB) {
            cociente++;
            resto = i-numB;
        }

        System.out.println("Cociente:" + cociente);
        System.out.println("Resto:" + resto);
        /* while(numA>=numB);        
        System.out.println("Numero cociente: "+cociente);
        System.out.println("Resto:"+numA)*/
    }

}
