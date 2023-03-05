/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.u4hoja4ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Tabla {

    private int[][] arr;

    public Tabla() {
        arr=new int[4][5];
        for (int i=0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=(int)(Math.floor(Math.random()*100+1));
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
    public int mayorF(int fila){
        int mayor=Integer.MIN_VALUE;
            for (int i = 0; i < arr[fila].length; i++) {
                if(arr[fila][i]>mayor)mayor=arr[fila][i];
            }
        return mayor;
    }
    public int mayorC(int columna){
        int mayor=Integer.MIN_VALUE;  
            for (int i = 0; i < arr.length; i++) {
                if(arr[i][columna-1]>mayor)mayor=arr[i][columna-1];
            }
        return mayor;
    }
    public int media(){
        int total=0;
        int contador=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                total+=arr[i][j];
                contador++;
            }
        }
        return total/contador;
    }
}
