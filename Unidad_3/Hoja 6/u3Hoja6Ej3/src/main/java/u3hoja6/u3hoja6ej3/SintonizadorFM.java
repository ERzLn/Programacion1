/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja6.u3hoja6ej3;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class SintonizadorFM {
    private double frecuencia;

    public SintonizadorFM() {
        if(this.frecuencia<80||this.frecuencia>108){
            this.frecuencia=80;
        }
    }

    public SintonizadorFM(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    public void subir(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Indique cuantas subidas quiere hacer (de 0,5MHz cada una): ");
        int subidas=entrada.nextInt();
        for(int i=1;i<=subidas;i++){
            this.combrobarRango();
            if(frecuencia<=108){
            frecuencia+=0.5;}
        }
    }
    public void bajar(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Indique cuantas bajadas quiere hacer (de 0,5MHz cada una): ");
        int bajadas=entrada.nextInt();
        for(int i=1;i<=bajadas;i++){
            this.combrobarRango();
            if(frecuencia>=80){
            frecuencia-=0.5;}
        }
                      
    }
    private void combrobarRango(){
        if(frecuencia>108)frecuencia=80;
        else if (frecuencia<80)frecuencia=108;
    }
    public void mostrarfrecuencia(){
       this.combrobarRango();
        System.out.println("La frecuencia actual es de: "+frecuencia+"MHz");
    }
    public SintonizadorFM(SintonizadorFM sinto){
       this.frecuencia=sinto.frecuencia;       
    }
}

