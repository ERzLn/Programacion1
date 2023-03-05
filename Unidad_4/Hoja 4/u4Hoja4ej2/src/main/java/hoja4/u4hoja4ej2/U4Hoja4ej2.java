/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.u4hoja4ej2;

/**
 *
 * @author DAW122
 */
public class U4Hoja4ej2 {

    public static void main(String[] args) {
       Tabla tabla=new Tabla();
       tabla.mostrar();
       System.out.println("La fila mayor es: "+tabla.mayorF(3));
        System.out.println("La columna mayor es: "+tabla.mayorC(4));
        System.out.println("La media es: "+tabla.media());
     
    }
}
