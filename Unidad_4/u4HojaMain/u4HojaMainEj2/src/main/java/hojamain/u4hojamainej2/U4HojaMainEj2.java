/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hojamain.u4hojamainej2;

/**
 *
 * @author DAW122
 */
public class U4HojaMainEj2 {

    public static void main(String[] args) {
        String nombre=args[0];
        String edad=args[1];
        Persona eloy=new Persona(nombre,edad);
        eloy.imprimir();
        System.out.println("Es mayor de edad?: "+eloy.esMayorEdad());
    }
}
