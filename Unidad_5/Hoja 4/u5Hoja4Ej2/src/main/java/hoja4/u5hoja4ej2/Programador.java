/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.u5hoja4ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Programador extends Empleado {

    protected int lineasDeCodigoPorHora;
    protected String lenguajeDominante;

    public Programador() {
        super();
        System.out.println("Introduce las lineas de codigo por hora del Programador:");
        lineasDeCodigoPorHora = new Scanner(System.in).nextInt();
        System.out.println("Introduce su lenguaje dominante: ");
        lenguajeDominante = new Scanner(System.in).nextLine();
    }

    public Programador(String nombre, String departamento,
            int edad, boolean casado, double salario,
            int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, departamento, edad, casado, salario);
        this.lineasDeCodigoPorHora=lineasDeCodigoPorHora;
        this.lenguajeDominante=lenguajeDominante;
    }

}
