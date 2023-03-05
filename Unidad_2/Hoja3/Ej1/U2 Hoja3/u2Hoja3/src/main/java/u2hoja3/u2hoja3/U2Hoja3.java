/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u2hoja3.u2hoja3;

import java.util.Scanner;

/**
 *
 * @author xboxr
 */
public class U2Hoja3 {

    public static void main(String[] args) {
        double x;
        Finanzas finanza=new Finanzas(1.06);
        
    
        
         
    Scanner entrada= new Scanner(System.in);
    System.out.println("Introduce los Euros que quieres pasar a Dólares: ");
    double euro=entrada.nextInt();
    
    System.out.println("Introduce los Dolares que quieres pasar a Euros: ");
    double dolar=entrada.nextInt();
        
    double pasaraEuro, pasaraDolar;
    pasaraEuro=finanza.getFinanzas()*dolar;
    pasaraDolar=euro/finanza.getFinanzas();
    
    
        System.out.printf("%,.2f dolares son %,.2f euros \n",dolar, pasaraEuro);
        System.out.printf("%,.2f euros son %,.2f dolares \n",euro, pasaraDolar);
        
        System.out.println("Introduce el precio actual del euro respecto al dolar");
        x=entrada.nextInt();
        Finanzas finanza2=new Finanzas(x);
        
        pasaraEuro=finanza2.getFinanzas()*dolar;
        pasaraDolar=euro/finanza2.getFinanzas();
        
        
        System.out.printf("%,.2f dolares son %,.2f euros \n",dolar, pasaraEuro);
         System.out.printf("%,.2f euros son %,.2f dolares \n", euro, pasaraDolar);
    }
}
