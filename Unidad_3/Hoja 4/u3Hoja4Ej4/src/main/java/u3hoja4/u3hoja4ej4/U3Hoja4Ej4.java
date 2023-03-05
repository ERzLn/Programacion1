/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u3hoja4.u3hoja4ej4;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U3Hoja4Ej4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intento = 0;
        int pass = 1 + (int) (Math.random() * 9999);
        
        for (int intentos = 1; intentos <= 4 && intento != pass; intentos++) {
            System.out.println("pass:" +pass);
            System.out.println("Introduce la contraseña (max 3 intentos): ");
            intento = entrada.nextInt();
            if (intento == pass) {
                System.out.println("¡¡CONTRASEÑA CORRECTA!!");
            } else if (intentos <= 4) {
                System.out.println("Contraseña incorrecta. Le quedan " + (3 - intentos) + " intentos");
            }
            if (intentos == 4 && intento != pass) {
                System.out.println("ACCESO BLOQUEADO");
            }
        }

    }
}
