/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja7.u5hoja7ej5;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U5Hoja7Ej5 {
    public class Principal {

    public static double dividir(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }
    /*
      public static double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }
     */
}

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el dividendo: ");
        double dividendo = entrada.nextDouble();
        System.out.print("Introduce el divisor: ");
        double divisor = entrada.nextDouble();
        try {
            System.out.println("Resultado de la división: " + Principal.dividir(dividendo, divisor));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el dividendo: ");
        double dividendo = entrada.nextDouble();
        System.out.print("Introduce el divisor: ");
        double divisor = entrada.nextDouble();
        try {
            if (divisor == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            System.out.println("Resultado de la división: " + dividir(dividendo, divisor));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
 */
