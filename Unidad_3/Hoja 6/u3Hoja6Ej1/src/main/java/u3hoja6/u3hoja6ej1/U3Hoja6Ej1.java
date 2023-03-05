/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u3hoja6.u3hoja6ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U3Hoja6Ej1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
       
       Tarjeta tar=new Tarjeta("Eloy","123456789",1000);
        System.out.println("Clave: "+tar.getClave());
        System.out.println("Introduce pin:");
        int clave=entrada.nextInt();
       tar.desbloquea(clave);
       tar.pagar(500, clave, "Ordenador", false);
    }
}
