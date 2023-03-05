/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u3hoja5.u3hoja5ej3;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U3Hoja5Ej3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la hora de inicio (0-24):");
        int hora = entrada.nextInt();
        System.out.println("Introduzca los minutos de inicio (0-59):");
        int minutos = entrada.nextInt();
        System.out.println("Introduzca los segundos de inicio (0-59");
        int segundos = entrada.nextInt();
        int i = hora, iMin = minutos, iSeg = segundos;
        for (i = hora; i < 24; i++) {
            if (i != hora) {
                System.out.println(i + ":" + iMin + ":" + iSeg);
            }
            for (iMin = minutos; iMin < 60; iMin++) {
                if (iMin != minutos) {
                    System.out.println(i + ":" + iMin + ":" + iSeg);
                }
                for (iSeg = segundos; iSeg < 60; iSeg++) {
                    if (iSeg != segundos) {
                        System.out.println(i + ":" + iMin + ":" + iSeg);
                    }
                }
            }
            System.out.println("Fin del dia  ¡HASTA MAÑANA!!");
        }
    }
}
