/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package fechas.fechashoja1ej1;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class FechasHoja1Ej1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero total de letras: ");
        int n = entrada.nextInt();
        Letra[] letra = new Letra[n];
        for (int i = 0; i < n; i++) {
            letra[i] = new Letra();
            if (letra[i].vencida()) {
                System.out.println();
                System.out.println("Letra Vencida: ");
                letra[i].mostrar();
                if (letra[i].devuelveMes().equalsIgnoreCase("enero")) {
                    letra[i].demora(15);
                }
            } else {
                System.out.println();
                System.out.println("Letra no vencida: ");
                letra[i].mostrar();
            }
        }
    }
}
