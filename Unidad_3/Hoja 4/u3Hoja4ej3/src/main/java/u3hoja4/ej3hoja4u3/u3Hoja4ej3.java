/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u3hoja4.ej3hoja4u3;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class u3Hoja4ej3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anio, a, b, c, d, e, n;

        System.out.println("Introduce un año comprendido entre el 2016 y 2030 (introduce 0 para salir):");
        anio = entrada.nextInt();
        do {
            if (anio >= 2016 && anio <= 2030) {
                a = anio % 19;
                b = anio % 4;
                c = anio % 7;
                d = (19 * a + 24) % 30;
                e = (2 * b + 4 * c + 6 * d + 5) % 7;
                n = (22 + d + e);
                if (n < 31) {
                    System.out.println("El domingo " + n + " de marzo es pascua para el año " + anio+"\n");
                    System.out.println("Introduce un año comprendido entre el 2016 y 2030 (introduce 0 para salir):");
                    anio = entrada.nextInt();
                } else {
                    System.out.println("El domingo " + (n - 31) + " de abril es pascua para el año " + anio+"\n");
                    System.out.println("Introduce un año comprendido entre el 2016 y 2030 (introduce 0 para salir):");
                    anio = entrada.nextInt();
                }

            }
            else System.out.println("Introduce una fecha correcta comprendida entre el año 2016 y 2030:");
            anio = entrada.nextInt();

        } while (anio != 0);
    }
}
