/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.u5hoja10;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Teclado {    
    public static void tecladoGuerrero() {
        boolean valido = false;
        do {
            try {
                System.out.println("Introduce el nombre del guerrero:");
                String NOMBRE = new Scanner(System.in).nextLine();
                System.out.println("Introduce su edad:");
                int edad = new Scanner(System.in).nextInt();
                if (edad < 60 && edad > 15) {
                    valido = true;
                } else {
                    throw new Exception("La edad no puede superar los 60 años ni ser inferior a 15.");
                }

                System.out.println("Introduce su fuerza");
                int fuerza = new Scanner(System.in).nextInt();
                if (fuerza > 1 && fuerza < 10) {
                    valido = true;
                } else {
                    throw new Exception("La fuerza debe de estar entra 1-10.");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!valido);
    }
}
