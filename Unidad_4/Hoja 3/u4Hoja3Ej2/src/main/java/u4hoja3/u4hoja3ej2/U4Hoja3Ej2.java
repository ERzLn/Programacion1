/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja3.u4hoja3ej2;

/**
 *
 * @author Eloy
 */
public class U4Hoja3Ej2 {

    public static void main(String[] args) {
        Curso curso=new Curso("Daw",3);
        curso.iniciales();
        curso.desplaza();
        curso.verNombre(2);
        System.out.println(curso.esDaw());
    }
}
