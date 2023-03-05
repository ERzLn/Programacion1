/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja5.u4hoja5ej2;

/**
 *
 * @author Eloy
 */
public class U4Hoja5Ej2 {

    public static void main(String[] args) {
        Sopa sopa=new Sopa(10,10);
        System.out.println("MUESTRA:\n");
        sopa.mostrar();
        System.out.println();
        System.out.println("Palabras introducidas en la sopa de letras:\n");
        sopa.setPalabra("francia", 1, 9, 1);
        sopa.setPalabra("tanos", 3, 0, 1);
        sopa.setPalabra("agua", 5, 2, -1);
        sopa.mostrar();
    }
}
