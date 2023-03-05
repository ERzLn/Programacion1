/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.u5hoja1ej1;

/**
 *
 * @author DAW122
 */
public class Pajaro {
    public static int numPajaros;
    private int edad;
    private String color;

    public Pajaro() {  
        nuevoPajaro();
    }

    public Pajaro(int edad, String color) {
        this.edad = edad;
        this.color = color;
        nuevoPajaro();        
    }
    
    private static void nuevoPajaro(){
        numPajaros++;
    }
    public static void muestraPajaro(){
        System.out.println("Actualmente hay: "+numPajaros+" pajaros");
    }
    
}
