/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author xboxr
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String texto; //variable para almacenar los datos recogidos por la caja de texto
        byte edad;
        texto =JOptionPane.showInputDialog("Escriba un numero");
        edad=Byte.parseByte(texto);
        byte edad1=(byte)(edad+1);
        System.out.println("la edad dentro de un año es "+edad1);
        System.out.println("la edad dentro de un año es "+(edad+1));
    }
}
