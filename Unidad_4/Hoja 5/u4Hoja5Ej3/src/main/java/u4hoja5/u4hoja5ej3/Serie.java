/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4hoja5.u4hoja5ej3;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Serie {

    private double[] serie;
    private char variable;

    public Serie(char variable) {
        this.variable = variable;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres ingresar?: ");
        int numeros = entrada.nextInt();
        serie = new double[numeros];

        for (int i = 0; i < serie.length; i++) {
            System.out.println("Introduce la posición " + (i + 1) + " :");
            serie[i] = entrada.nextDouble();
        }
    }

    public double resultado() {
        double total = 0;
        switch (variable) {
            case '+' -> {
                total = 0;
                for (int i = 0; i < serie.length; i++) {
                    total += serie[i];
                }
            }
            case '*' -> {
                total = 1;
                for (int i = 0; i < serie.length; i++) {
                    total *= serie[i];
                }
            }
            default ->
                System.out.println("Variable introducida INCORRECTA");
        }
        return total;
    }
}
