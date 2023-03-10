/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unidad6.ejercicio1hoja1;

/**
 *
 * @author DAW122
 */
public class Ejercicio1Hoja1 {

    public static void main(String[] args) {
        Contenedor<Integer> contenedor = new Contenedor<>();
        contenedor.insertarAlPrincipio(1);
        contenedor.insertarAlPrincipio(2);
        contenedor.insertarAlFinal(3);
        System.out.println(contenedor); // [2, 1, 3]
        contenedor.extraerDelPrincipio();
        System.out.println(contenedor); // [1, 3]
        contenedor.ordenar();
        System.out.println(contenedor); // [1, 3]
    }
}