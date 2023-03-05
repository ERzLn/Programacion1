/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hojamain.u4hojamainej3;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class U4HojaMainEj3 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre=args[0];
        double sueldo=Double.parseDouble(args[1]);
        Empleado empleado1=new Empleado(nombre,sueldo);
        empleado1.imprimir();
        empleado1.imprimirImpuestos();
        System.out.println("Cambia el nombre: ");
        empleado1.setNombre(entrada.nextLine());
        System.out.println("Cambia el sueldo: ");
        empleado1.setSueldo(entrada.nextDouble());
        empleado1.imprimir();
        empleado1.imprimirImpuestos();
    }
}
