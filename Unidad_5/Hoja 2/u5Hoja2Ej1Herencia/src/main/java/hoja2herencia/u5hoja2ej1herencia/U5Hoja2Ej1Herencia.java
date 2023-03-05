/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2herencia.u5hoja2ej1herencia;

/**
 *
 * @author DAW122
 */
public class U5Hoja2Ej1Herencia {

    public static void main(String[] args) {
        
        Encargado encargado1=new Encargado("Juan",2000);
        System.out.println(encargado1.toString());
        
        Empleado empleado1=new Empleado("Pedro",1500);
        System.out.println(empleado1.toString());
    }
}
