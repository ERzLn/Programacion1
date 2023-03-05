/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.u5hoja1ej3;

/**
 *
 * @author DAW122
 */
public class U5Hoja1Ej3 {

    public static void main(String[] args) {
        System.out.println("Consumo total "+AparatoElectrico.consumoTotal);
        AparatoElectrico bombilla=new AparatoElectrico();
        bombilla.pulsar();
        AparatoElectrico plancha=new AparatoElectrico();        
        plancha.pulsar();
        plancha.pulsar();
        System.out.println(AparatoElectrico.consumoTotal);
    }
}
