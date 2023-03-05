/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4hoja2.u4hoja2ej4;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Alumno {
    private String nombreAlumno;
    private double []notas;

    public Alumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        notas=new double[5];
        for(int i=0;i<notas.length;i++){
        System.out.println("Introduce la nota "+(i+1)+" :"  );
        Scanner entrada=new Scanner(System.in);
        notas[i]=entrada.nextDouble();
    }
    }
    public double mayor(){
        double mayor=Integer.MIN_VALUE;
        for(int i=0;i<notas.length;i++){
                
                if(notas[i]>mayor)mayor=notas[i];
            }
        return mayor;
        }
    public double menor(){
        double menor=Integer.MAX_VALUE;
        for(int i=0;i<notas.length;i++){
                
                if(notas[i]<menor)menor=notas[i];
            }
        return menor;
        }
    public String mostrar(){
        double media=0;
        String cadena=nombreAlumno.toUpperCase()+" ";    
        for (int i=0; i<notas.length;i++){
            media+=notas[i];
            
           cadena+=String.format("%,.2f ", (notas[i]));        
    }
        media=(media/notas.length);
        
        
        cadena+=" Media: "+String.format("%,.1f\n",(media));
        
        return cadena;
    }
}

 

