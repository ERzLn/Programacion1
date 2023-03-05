/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hojamain.u4hojamainej4;

/**
 *
 * @author Eloy
 */
public class U4hojaMainEj4 {

    public static void main(String[] args) {
        Operaciones operacion1=new Operaciones(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        System.out.println("Numeros: "+operacion1.a+ " y "+operacion1.b+" \n");
        System.out.println("Suma: "+operacion1.suma()+"\n");
        System.out.println("Resta: " +operacion1.resta()+"\n");
        System.out.println("Multiplicación: "+operacion1.multiplicacion()+"\n");
        System.out.println("División: "+operacion1.division()+"\n");
    }
}
