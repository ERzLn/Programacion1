/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u2hoja9.u2hoja9ej1;

import java.util.Scanner;
import javax.swing.JComponent;

/**
 *
 * @author Eloy
 */
public class U2Hoja9ej1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce temperatura: ");
        int x = entrada.nextInt();
        Alarma alarma = new Alarma(x);

        alarma.comprueba();
        alarma.estado();
        if (alarma.isTimbre() == true) {
            alarma.normaliza();
            alarma.estado();
        }

    }
}
