/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.u4hoja7;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U4Hoja7 {

    public static void main(String[] args) {
        Alumno alumno=new Alumno("Eloy");
        System.out.println("La mayor nota es: "+alumno.mayor());
        System.out.println("La menor nota es: "+alumno.menor());
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce la posicion de la nota a mostrar: ");
        System.out.println(alumno.buscar(entrada.nextInt()));
        alumno.tresMejores();
        
        System.out.println("Las notas se ponen a cero");
        
        System.out.println("Las tres mejores notas son:");
        int[]copia=alumno.tresMejores();
        for(int i=0;i<alumno.tresMejores().length;i++){
            System.out.println(copia[i]);
        }
    }
}
