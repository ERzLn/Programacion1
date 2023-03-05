/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojamain.u4hojamainej3;

/**
 *
 * @author Eloy
 */
public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void imprimir(){
        System.out.println("El nombre del empleado es: "+nombre);
        System.out.println("El sueldo de "+nombre+" es de: "+sueldo+"€");
    }
    public void imprimirImpuestos(){
        if(sueldo>3000){
            System.out.println(nombre+" deberá pagar impuestos porque su sueldo es superior a 3000€");
        }
        else System.out.println(nombre+" no debe pagar impuestos porque su sueldo es inferior a 3000€");
    }
}
