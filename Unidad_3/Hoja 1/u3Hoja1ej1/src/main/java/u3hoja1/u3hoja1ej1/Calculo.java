/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja1.u3hoja1ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Calculo {
    
    Scanner entrada=new Scanner(System.in);
    double scan=entrada.nextDouble();
    public boolean entre100y1000() {

        if (scan >= 100 && scan <= 1000) {
            return true;
        } 
        else  return false;
} 
        
    
    
    public void positivoNegativoNulo() {
        if (scan > 0) {
            System.out.println("El numero es positivo");
        } else if (scan < 0) {
            System.out.println("El numero es negativo");
        } else if (scan == 0) {
            System.out.println("el numero es nulo, por lo tanto 0");
        }
    }

    public void divisible2y5(){
    if (scan%2==0&&scan%5==0){
        System.out.println(scan+ " es divisible entre 2 y 5");
    }  
    else System.out.println(scan+" no es divisible entre 2 y 5");
}
    public void fraccionario(){
        if (scan%1==0) System.out.println(scan+" es entero");
        else System.out.println("Es fraccionario");
    }

}