/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja8.u4hoja8ej3;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U4Hoja8Ej3 {

    public static void main(String[] args) {
        Pais pais = new Pais("España");
        Scanner entrada=new Scanner(System.in);
        int opcion;
        do {
        System.out.println();
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Añadir ciudad");
        System.out.println("2. Mostrar ciudad con más habitantes");
        System.out.println("3. Comprobar si una ciudad existe");
        System.out.println("4. Mostrar población media de las ciudades");
        System.out.println("5. Mostrar todos los datos del país");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        System.out.println();
        opcion=entrada.nextInt();
        switch(opcion){
            case 1 ->pais.añadirCiudad();
            case 2 ->System.out.println(pais.ciudadMasPoblada());
            case 3 ->{
                System.out.println("Introduce la ciudad a comprobar: ");
                String ciudad=new Scanner(System.in).nextLine();
                pais.existeCiudad(ciudad);
            }
            case 4 -> System.out.println("La poblacion media es: "+pais.poblacionMedia());
            case 5 -> System.out.println(pais.toString());
            default ->System.out.println("Introduce una opcion valida.");
        }
        } while (opcion!=0);   
    }
    
}
