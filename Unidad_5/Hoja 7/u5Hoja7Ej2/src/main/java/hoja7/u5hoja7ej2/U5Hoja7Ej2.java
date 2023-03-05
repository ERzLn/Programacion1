/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja7.u5hoja7ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja7Ej2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;

        boolean x = true;
        while (x) {

            try {
                System.out.print("Ingrese un número entero: ");
                a = new Scanner(System.in).nextInt();
                System.out.println("Introduce el divisor: ");
                b = new Scanner(System.in).nextInt();
                if (b==0) {
                    throw new ArithmeticException ("Division invalida. No se puede dividir entre 0.");
                }
                System.out.println("El resultado es: " + (a / b));
                x = false;

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                
            }
            catch (InputMismatchException e) {                
                System.out.println("El valor introducido no es un entero.");
                System.out.println("Introduce correctamente los valores:");
            }catch (Exception e){
                System.out.println("Error desconocido");
                System.out.println(e.getMessage());
            }

        }

    }
}
