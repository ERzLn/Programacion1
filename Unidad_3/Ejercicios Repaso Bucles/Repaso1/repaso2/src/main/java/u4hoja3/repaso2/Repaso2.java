/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja3.repaso2;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Repaso2 {

    public static void main(String[] args) {
        System.out.println("Introduce una palabra: ");
        Scanner entrada=new Scanner(System.in);
        String palabra=entrada.nextLine();
        for (int i=0; i<palabra.length();i++){
            char letra=palabra.charAt(i);
            System.out.println(letra);
        }
    }
}
