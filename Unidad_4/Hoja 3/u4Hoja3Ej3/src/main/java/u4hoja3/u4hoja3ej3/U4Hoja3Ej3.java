/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja3.u4hoja3ej3;

/**
 *
 * @author Eloy
 */
public class U4Hoja3Ej3 {

    public static void main(String[] args) {
        Comunidad com=new Comunidad("Andalucia",5);
        com.mostrar();
        System.out.println("El resultado del sorteo es: "+com.sorteo());
        System.out.println("Posicion: "+com.buscar("Granada"));
    }
}
