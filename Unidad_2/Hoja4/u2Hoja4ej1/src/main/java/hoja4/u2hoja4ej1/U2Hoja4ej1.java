/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.u2hoja4ej1;

/**
 *
 * @author DAW122
 */
public class U2Hoja4ej1 {

    public static void main(String[] args) {
        Circulo c1= new Circulo();
        Circulo c2=new Circulo(10);
        c1.setRadio(6.30f);
        
        System.out.println("Circulo 1= "+c1.getRadio());
        System.out.println("Circulo 2= "+c2.getRadio());
        
    }
}
