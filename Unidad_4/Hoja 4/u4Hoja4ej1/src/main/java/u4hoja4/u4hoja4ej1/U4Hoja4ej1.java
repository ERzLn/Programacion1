/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja4.u4hoja4ej1;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U4Hoja4ej1 {

    public static void main(String[] args) {
        int matriz1[][]={{101,102,103,104,105},{201,202,203,204,205},{301,302,303,304,305},{401,
        402,403,404,405},{501,502,503,504,505}};
        Scanner entrada=new Scanner (System.in);
        int opcion=0;
        do{System.out.println("Seleccione una opción:\n 1- Elegir fila\n 2- Elegir columna\n 3- Mostrar elementos de la diagonal\n 4- Mostrar elementos de la diagonal inversa\n 5- Mostrar elementos de la diagonal hacia arriba\n 6- Salir");
        opcion=entrada.nextInt();
        switch(opcion){
            case 1->{ 
                System.out.println("Introduce el numero de la fila del 1 al 5: ");
                int fila=entrada.nextInt();
                if (fila>5&&fila<1)System.out.println("Introduce una fila valida");
                else{
                    for(int i=0;i<matriz1.length;i++){
                        System.out.print(matriz1[fila-1][i]+" ");
                    }
                    System.out.println();
                }}
            case 2-> {
                System.out.println("introduce el numero de la columna");
                 int columna=entrada.nextInt();
                 if (columna>5&&columna<1)System.out.println("Introduce una fila valida");
                 else {
                     for(int i =0; i<matriz1.length;i++){
                         System.out.print(matriz1[i][columna-1]+" ");
                     }
                     System.out.println();
                     
                 }}
            case 3->{
                System.out.println("Diagonal:");
                for (int i=0;i<matriz1.length;i++){
                    System.out.print(matriz1[i][i]+" ");
                }
                System.out.println();
                 
            }
            case 4->{
                System.out.println("Elementos de la diagonal inversa:");
          for (int i = 0; i < matriz1.length; i++) {
            System.out.print(matriz1[i][matriz1.length-1-i] + " ");
          }
          System.out.println();
                
            }case 5->{
                System.out.println("Diagonal hacia arriba:");
                for (int i=matriz1.length-1;i>=0;i--){
                    System.out.print(matriz1[i][i]+" ");
                }
                System.out.println(); 
                
            }
        }}
        while (opcion!=6);
    }
}
