/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja3.u3hoja3ej1;


/**
 *
 * @author DAW122
 */
public class Fondo {
    private double c, i;
    private int n;

    public Fondo(double capitalfondo, double interesFondo, int añoCapitalFondo) {
        this.c = capitalfondo;
        this.i = interesFondo;
        this.n = añoCapitalFondo;
    }
    public void evolucion(){        
        int x=1;
        while(x<=n){
            
            double cFinal=c+(c*i/100*x);
            System.out.printf("En el año %d el capital final es de: %,.2f€\n",x , cFinal);
            c=cFinal;
            x++;
        }
    }
}
