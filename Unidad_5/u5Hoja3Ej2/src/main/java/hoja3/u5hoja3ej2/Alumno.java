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
public class Alumno extends Persona {
    private int [] notas;

    public Alumno(int numNotas) {
        notas=new int [numNotas];
        for (int i = 0; i < notas.length; i++) {            
            System.out.println("Introduce la nota "+(i+1)); 
            notas[i]=new Scanner(System.in).nextInt();
        }
    }
    public String mostrar(){
        String mostrar="";
        int media=0;
        for (int i = 0; i < notas.length; i++) {
            media+=notas[i];                        
        }
        mostrar+="DNI: "+super.getDni()+" Direccion: "+super.getDireccion()+ " Nombre alumno: "+super.getNombre()+" Media: "+media+"\n";
        return mostrar;
    }
    
}
