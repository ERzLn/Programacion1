/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.u4hoja7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Alumno {

    private String alumno;
    private int[] notas;

    public Alumno(String alumno) {
        this.alumno = alumno;
        notas = new int[5];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce las 5 notas del alumno:");
        for (int i = 0; i < 5; i++) {
            notas[i] = entrada.nextInt();
        }
    }

    public int mayor() {        
        Arrays.sort(notas);
        int mayor=(notas.length-1);
        return notas[mayor];
    }
    public int menor() {        
        Arrays.sort(notas);
        int menor=0;
        return notas[menor];
    }
    public void ponerACero(){
        Arrays.fill(notas, 0);
    }
    public int buscar(int posicion){
        Arrays.sort(notas);
        return notas[(posicion-1)];        
        }
    public int[] tresMejores(){
        Arrays.sort(notas);
        /*int notasCopia[]=Arrays.copyOfRange(notas, 2, 5);
        System.out.println("Las tres mejores notas son: ");
        for(int i=0;i<notasCopia.length;i++){
            System.out.println( notasCopia[i]);
        }*/
        return Arrays.copyOfRange(notas, notas.length-3, notas.length);
    }
    

}
