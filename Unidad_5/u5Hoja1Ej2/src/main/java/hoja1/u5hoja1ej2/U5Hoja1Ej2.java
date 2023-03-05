/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.u5hoja1ej2;

/**
 *
 * @author DAW122
 */
public class U5Hoja1Ej2 {

    public static void main(String[] args) {
        Bombilla.pulsarIcp();
        Bombilla bombilla1=new Bombilla();
        bombilla1.pulsaInterruptor();
        System.out.println(bombilla1.luce());
        System.out.println(Bombilla.getIcp());
        Bombilla.pulsarIcp();
        System.out.println(Bombilla.getIcp());
    }
}
