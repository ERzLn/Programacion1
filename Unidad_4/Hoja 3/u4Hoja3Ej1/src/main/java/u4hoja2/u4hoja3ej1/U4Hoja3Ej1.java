/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja2.u4hoja3ej1;

/**
 *
 * @author Eloy
 */
public class U4Hoja3Ej1 {

    public static void main(String[] args) {
        Triatlon tri=new Triatlon("144","Jesus",5);
        System.out.println(tri.mostrar());
        System.out.println("Ha sido seleccionado? "+tri.esSeleccionado());
        Triatlon tri2=new Triatlon();
        
        System.out.println(tri2.mostrar());
        System.out.println("Ha sido seleccionado? "+tri2.esSeleccionado());
    }
}
