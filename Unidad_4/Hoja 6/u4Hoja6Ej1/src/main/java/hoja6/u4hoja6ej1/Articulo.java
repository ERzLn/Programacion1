/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.u4hoja6ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Articulo {
    private int codigo, existencias;
    private String descripcion;

    public Articulo() {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduces el codigo del producto: ");
        this.codigo=entrada.nextInt();
        System.out.println("Introduce la descripcion del articulo: ");
        this.descripcion=new Scanner(System.in).nextLine();
        System.out.println("Introduce la existencias del producto: ");
        this.existencias=new Scanner(System.in).nextInt();        
    }    

    public int getCodigo() {
        return codigo;
    }

    public int getExistencias() {
        return existencias;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
