/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u2hoja4.u2hoja4ej1;

/**
 *
 * @author Eloy
 */
public class U2Hoja4ej1 {

    public static void main(String[] args) {
        Circulo radio1=new Circulo();
        radio1.setRadio(6.30f);
        System.out.println("Radio 1: "+radio1.getRadio());
        
        Circulo radio2 = new Circulo(10.0f);
        System.out.println("Radio 2: "+radio2.getRadio());
        
        
        
    }
}
