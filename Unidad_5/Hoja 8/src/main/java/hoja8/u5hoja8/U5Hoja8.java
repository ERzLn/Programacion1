/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja8.u5hoja8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja8 {

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[2];
        for (int i = 0; i < alumnos.length; i++) {
            try {
                System.out.println("Introduce la cantidad de notas a almacenar para el alumno " + (i + 1) + " :");
                int notasTot = new Scanner(System.in).nextInt();
                alumnos[i] = new Alumno(notasTot);
            } catch (Exception e) {
                System.out.println("La cantidad de notas debe ser un numero valido");
                i--;
            }
        }
        boolean control = false;
        do {

            System.out.println("Introduce el numero del alumno a buscar: ");

            try {
                int numAl = new Scanner(System.in).nextInt();
                numAl--;
                alumnos[numAl].mostrar();
                control = true;
            } catch (InputMismatchException x) {
                System.out.println("Solo se admiten numeros.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("El numero de alumno ingresado es invalido.");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (!control);

    }

}
