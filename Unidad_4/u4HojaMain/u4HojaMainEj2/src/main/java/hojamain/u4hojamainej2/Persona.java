/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojamain.u4hojamainej2;

/**
 *
 * @author DAW122
 */
public class Persona {
    public String nombre;
    public String edad;

    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;        
    }
    public void imprimir(){
        if((Integer.parseInt(edad))>=18)System.out.println(nombre+" es mayor de edad");
        else System.out.println(nombre+" es menor de edad");
    }
    public boolean esMayorEdad(){
        boolean mayor=(Integer.parseInt(edad))>=18;
        return mayor;
    }
    
}
