/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja1.u3hoja1ej2;

/**
 *
 * @author Eloy
 */
public class Ticket {
private double kgNaranjas;
private double precioKilo;

    public Ticket(int kgNaranjas) {
        this.kgNaranjas = kgNaranjas;
    }
    public String imprimir(){
        if (kgNaranjas>=10){
            precioKilo=kgNaranjas*1.2;
            return("El total del ticket a 1,2€/kg es: " + precioKilo);
        }
        else precioKilo=kgNaranjas*1.5;
        return ("El total del ticket a 1,5€/kg es: " + precioKilo);
    }

   
        

    
}
