/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplogit.u4hoja2ej3;

/**
 *
 * @author DAW122
 */
public class U4Hoja2Ej3 {

    public static void main(String[] args) {
        Invierno inv=new Invierno(3);
        System.out.printf("TempMedia: %,.2fºC ",inv.tempMedia());
        System.out.println("Fahrenheit: "+inv.mostrar(inv.fahrenheit()));
        System.out.println("Celsius: "+inv.mostrar(inv.getAr()));
        
        
    }
}
