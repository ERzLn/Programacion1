/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.u5hoja1ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
enum Estado{
    ON, OFF
}
public class Bombilla {
    public static Estado icp=Estado.OFF;
    private Estado interruptor;
    
    public Bombilla() {
        interruptor=Estado.OFF;
    }
    public void pulsaInterruptor(){
        if(interruptor == Estado.ON){
            interruptor = Estado.OFF;
        }
        else{
            interruptor = Estado.ON;
        }
    }
    public static void pulsarIcp(){
        if(icp == Estado.ON){
            icp=Estado.OFF;            
        }
        else{
            icp=Estado.ON;
        }
    }
    public static Estado getIcp(){
        return icp;
    }
    public boolean luce(){
        return (interruptor == Estado.ON) && (icp ==Estado.ON);
    }
}
