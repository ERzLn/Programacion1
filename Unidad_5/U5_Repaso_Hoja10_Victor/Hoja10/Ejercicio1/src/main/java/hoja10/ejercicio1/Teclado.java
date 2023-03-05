/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Víctor Sánchez Llada
 */
public class Teclado {

    /**
     * Método estático introduceNombre que solicita por teclado un nombre, comprueba si es válido (letras y espacios) y lo devuelve como un String.
     *
     * @return Devuelve un String.
     */
    public static String introduceNombre() {

        int contCaracteres;
        boolean exitFor;
        String nombre;

        do {

            contCaracteres = 0;
            exitFor = false;
            nombre = introString("Introduce el nombre del guerrero: ");

            for (int i = 0; i < nombre.length() && !exitFor; i++) {

                try {

                    if (Character.isLetter(nombre.charAt(i)) || nombre.charAt(i) == ' ') {
                        contCaracteres++;
                    } else {
                        exitFor = true;
                        throw new Exception("El nombre '" + nombre + "' no es válido. Caracteres válidos: letras y espacio. Vuelve a intentarlo.");
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }

        } while (contCaracteres != nombre.length());

        return nombre;

    }

    /**
     * Método introduceEdad que solicita por teclado una edad o fuerza, validando que sea un rango entre los valores introducidos por parámetro.
     * 
     * @param valorMin Parámetro de tipo int que será el valor mínimo permitido.
     * @param valorMax Parámetro de tipo int que será el valor máximo permitido.
     * @param cadena Parámetro de tipo String que será parte del mensaje a mostrar.
     * @return Devuelve un int.
     */
    public static int introduceEdadFuerza(int valorMin, int valorMax, String cadena) {

        boolean valido = false;
        int valor = 0;

        do {

            try {
                
                valor = introEntero("Introduce la " + cadena + " del guerrero: ");

                if (valor >= valorMin && valor <= valorMax) {
                    valido = true;
                } else {
                    throw new Exception("La " + cadena + " introducida no es válida, valores permitidos " + valorMin + "-" + valorMax + ".");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("El formato de la " + cadena + " no es correcto, vuelve a intentarlo.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (!valido);
        
        return valor;

    }
    
    /**
     * Método estático introEntero que solicita por teclado un número entero.
     *
     * @param mensaje Parámetro de tipo String que será el mensaje a mostrar por pantalla.
     * @return Devuelve un int.
     * @throws InputMismatchException Lanza una excepción si el formato introducido no es válido.
     */
    public static int introEntero(String mensaje) throws InputMismatchException {
        System.out.print(mensaje);
        return new Scanner(System.in).nextInt();
    }

    /**
     * Método estático introString que solicita por teclado una cadena de texto.
     *
     * @param mensaje Parámetro de tipo String que será el mensaje a mostrar por pantalla.
     * @return Devuelve un String.
     */
    public static String introString(String mensaje) {
        System.out.print(mensaje);
        return new Scanner(System.in).nextLine();
    }

}
