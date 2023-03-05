/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.u5hoja3ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public abstract class Persona {
    private String dni,nombre, direccion;

    public Persona() {
        System.out.println("Introduce nombre: ");
        nombre=new Scanner(System.in).nextLine();
        System.out.println("Introduce dirección: ");
        direccion= new Scanner (System.in).nextLine();
        System.out.println("Introduce DNI: ");
        dni=new Scanner (System.in).nextLine();
        }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
