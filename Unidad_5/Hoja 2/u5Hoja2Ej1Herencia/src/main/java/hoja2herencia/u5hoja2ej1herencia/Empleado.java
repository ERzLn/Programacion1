/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2herencia.u5hoja2ej1herencia;

/**
 *
 * @author DAW122
 */
public class Empleado {
    protected double sueldo;
    protected String nombre;
    public Empleado(String nombre,double sueldo) {
        this.sueldo=sueldo;
        this.nombre=nombre;
    }
    public String toString(){
        return "El empleado "+nombre+" recibe de sueldo: "+sueldo+"€";
    }
}
