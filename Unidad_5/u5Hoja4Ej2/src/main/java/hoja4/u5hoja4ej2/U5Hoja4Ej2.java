/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.u5hoja4ej2;

/**
 *
 * @author DAW122
 */
public class U5Hoja4Ej2 {

    public static void main(String[] args) {
        Plantilla plantilla=new Plantilla();
        Programador david=new Programador();
        Programador eloy=new Programador();
        plantilla.insertar(david);
        plantilla.insertar(eloy);
        System.out.println(plantilla.infoEmpleados());
    }
}
