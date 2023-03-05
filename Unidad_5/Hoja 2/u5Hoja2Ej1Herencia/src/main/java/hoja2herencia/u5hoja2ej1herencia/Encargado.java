/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2herencia.u5hoja2ej1herencia;

/**
 *
 * @author DAW122
 */
public class Encargado extends Empleado {
    private double sueldoEncargado;
    
    public Encargado(String nombre,double sueldo) {        
        super(nombre,sueldo);        
        sueldoEncargado=super.sueldo*1.1;  
    }    
    @Override
    public String toString(){
        return "El encargado "+super.nombre+" recibe de sueldo: "+sueldoEncargado+"€";
    }
    }
    

