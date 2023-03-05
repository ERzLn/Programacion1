/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojafechas.u4hojafechasej2;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Eloy
 */
public class Mascota {
    private LocalDate fechNac;
    private String nombre;
    private int edad;

    public Mascota(String nombre, LocalDate fechNac ) {
        this.nombre = nombre;
        this.fechNac= fechNac;
        
        
    }
    public int getEdad(){
        edad=LocalDate.now().getYear()-fechNac.getYear();
        return edad;
    }
    @Override
    public String toString(){        
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String nacimiento=fechNac.format(format);
        String info="Nombre: "+nombre+"\n Fecha de nacimiento: "+nacimiento+"\n Edad: "+edad;
        return info;
    }
}
