/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u2hoja7.ej2u2hoja7;

/**
 *
 * @author Eloy
 */
public class Ej2U2Hoja7 {

    public static void main(String[] args) {
        Triangulo triangulo=new Triangulo(10,15,15);
        System.out.println("Es equilatero?: "+triangulo.esEquilatero());
        System.out.println("Es isosceles?: "+triangulo.esIsosceles());
        System.out.printf("Perimetro %,.2f\n", triangulo.perimetro());
    }
}
