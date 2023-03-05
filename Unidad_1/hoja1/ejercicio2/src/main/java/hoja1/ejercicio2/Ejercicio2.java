/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author xboxr
 */
public class Ejercicio2 {

    public static void main(String[] args) throws IOException {
        short anoActual=2022;
       short  anoNacimiento;
        
       
       InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("Introduce el ano de nacimiento: ");
String cad = br.readLine();

anoNacimiento= Short.parseShort(cad);
        
        short resultado=(short) (anoActual-anoNacimiento);
        System.out.println("La edad es "+ resultado);
    }
}
