/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja5.u5hoja5ej2;

/**
 *
 * @author DAW122
 */
public class U5Hoja5Ej2 {

    public static void main(String[] args) {
        Gato gatito=new Gato("Callejero","pienso",4);
        System.out.println(gatito.toString());
        System.out.println(gatito.araniar()+" "+gatito.obedecer());
    }
}
