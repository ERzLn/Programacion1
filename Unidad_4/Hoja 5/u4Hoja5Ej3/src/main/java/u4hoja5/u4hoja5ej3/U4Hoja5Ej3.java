/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja5.u4hoja5ej3;

/**
 *
 * @author Eloy
 */
public class U4Hoja5Ej3 {

    public static void main(String[] args) {
        Serie serie=new Serie('*');
        System.out.printf("El numero resultante es: %,.2f\n",serie.resultado());
        Serie serie1 = new Serie('+');
        System.out.printf("El numero resultante es: %,.2f\n",serie1.resultado());
    }
}
