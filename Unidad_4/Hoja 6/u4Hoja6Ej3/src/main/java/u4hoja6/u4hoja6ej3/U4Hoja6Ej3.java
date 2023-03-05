/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja6.u4hoja6ej3;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U4Hoja6Ej3 {

    public static void main(String[] args) {
        Agenda agenda1=new Agenda(50); 
        int opcion;
         do{
        System.out.println("Seleccione opcion: \n  1- Insertar nuevo contacto \n  2- Mostrar agenda \n  3- Buscar contacto \n  4- Numero de contactos en la agenda \n  5- Modificar un contacto \n  6- Salir ");
         Scanner entrada=new Scanner(System.in);
         opcion=entrada.nextInt();
        
            switch (opcion) {
                
                case 1 ->{ agenda1.insertar();
                System.out.println();}
                
                case 2 ->{ agenda1.mostrar();
                System.out.println();}
                case 3 ->{System.out.println("Introduce el nombre a buscar: ");
                String nombre=entrada.nextLine();
                    agenda1.buscar(nombre);
                System.out.println();}
                case 4 ->{ System.out.println("En la agenda hay "+ agenda1.contador+" contactos registrados.");
                System.out.println();}
                case 5 -> {
                    System.out.println("Introduzca el nombre a modificar:");                    
                    String nombre=new Scanner(System.in).nextLine();
                    agenda1.modificar(nombre);
                    System.out.println();
                }
                default ->{ System.out.println("Opcion no valida");
               System.out.println(); }}
        }
        while(opcion!=6);       
    }}      
    

