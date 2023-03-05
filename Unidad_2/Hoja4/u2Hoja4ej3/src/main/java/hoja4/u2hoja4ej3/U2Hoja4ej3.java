/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.u2hoja4ej3;

/**
 *
 * @author DAW122
 */
public class U2Hoja4ej3 {

    public static void main(String[] args) {
        Monedero monedero1= new Monedero(20);
        monedero1.ingreso(10.4);
        System.out.println("Tienes: "+monedero1.getSaldo()+"€");
        monedero1.retirada(50);
        monedero1.retirada(20);
        System.out.printf("Tienes:%,.2f€ \n",monedero1.getSaldo());
    }
}
