/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja1.u4hoja1ej3;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U4Hoja1Ej3 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero para saber su posición en el array: ");
        int posicion=entrada.nextInt();
        int[]lista={1,5,10,9,2,6,7,8,4,3};
        if(posicion<=(lista.length)){
        if(lista[posicion]<11&&lista[posicion]>0){
            System.out.println("El numero " + posicion+ " corresponde a la posicion "+lista[posicion-1]);}}
        else System.out.println("Número no encontrado");
        
            
        
    }
}
