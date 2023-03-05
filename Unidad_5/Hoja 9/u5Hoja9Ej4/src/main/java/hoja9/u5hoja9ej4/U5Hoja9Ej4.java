/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja9.u5hoja9ej4;

/**
 *
 * @author DAW122
 */
public class U5Hoja9Ej4 {

    public static void main(String[] args) {
        try {
            throw new MiExcepcion("mi propia Excepción");
        } catch (MiExcepcion e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
