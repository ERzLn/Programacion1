/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja6.u4hoja6ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U4Hoja6ej2 {

    public static void main(String[] args) {
        Banco banco=new Banco(1000);
        int opcion;
        do{
            Scanner entrada=new Scanner(System.in);
            System.out.println("Selecciona la opcion que desea");
            System.out.println("1 - Ingresar cliente");
            System.out.println("2 - Mostrar usuarios");
            System.out.println("3 - Buscar un cliente");
            System.out.println("4 - Eliminar cliente");
            System.out.println("5- Salir");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Selecciona cuantos ingresos desea hacer: ");
                    int ingresos=entrada.nextInt();
                    banco.ingresar(ingresos);
                }
                case 2 ->                     {
                        System.out.println("Introduzca el id del cliente a mostrar:");
                        int idCliente=entrada.nextInt();
                        banco.mostrar(idCliente);
                    }
                case 3 -> banco.buscar();
                case 4 ->                     {
                        System.out.println("Introduzca el id del cliente a eliminar: ");
                        int idCliente=entrada.nextInt();
                        banco.eliminar(idCliente);
                    }
                default -> System.out.println("Esa opción no es valida");
            }
        }
        while(opcion!=5);
            
        
        
        
    }
}
