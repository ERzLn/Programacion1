/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u2hoja7.ej1u2hoja7;

/**
 *
 * @author Eloy
 */
public class Ej1U2Hoja7 {

    public static void main(String[] args) {
        
        Rectangulo rec1=new Rectangulo();
        rec1.setAncho(10);
        rec1.setLargo(15);
        System.out.println("Ancho:"+rec1.getAncho());
        System.out.println("Largo: "+rec1.getLargo());
        System.out.println("Area: "+rec1.area());
        System.out.printf("Diagonal: %,.2f\n",rec1.diagonal());
    }
}
