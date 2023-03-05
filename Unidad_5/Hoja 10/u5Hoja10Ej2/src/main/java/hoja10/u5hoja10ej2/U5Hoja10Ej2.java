/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja10.u5hoja10ej2;

import hoja10.u5hoja10.Griego;
import hoja10.u5hoja10.Guerrero;
import hoja10.u5hoja10.Troyano;
import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U5Hoja10Ej2 {

    public static void main(String[] args) {
        System.out.println("Introduce el total de guerreros:");
        int total = new Scanner(System.in).nextInt();
        Guerrero[] guer = new Guerrero[total];
        for (int i = 0; i < guer.length; i++) {
            System.out.println("Introduce 1 si quieres crear un Griego, 2 para un Troyano:");
            int opcion = new Scanner(System.in).nextInt();
            do {

                switch (opcion) {
                    case 1 ->
                        guer[i] = new Griego();

                    case 2 ->
                        guer[i] = new Troyano();

                    default -> {
                        System.out.println("Opcion incorrecta");
                    }
                }
            } while (!(opcion == 1 || opcion == 2));
            }
            Caballo cab = new Caballo(guer);
            cab.montar(guer[1]);
            System.out.println(cab.getOcupacion());

    }
}
