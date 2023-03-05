/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u3hoja6.u3hoja6ej2;

/**
 *
 * @author Eloy
 */
public class U3Hoja6Ej2 {

    public static void main(String[] args) {
        Cartas car1=new Cartas();
        Cartas car2=new Cartas();
        if (car1.getNumCarta()>car2.getNumCarta())System.out.println("El "+car1.mostrar()+" es mayor que el "+car2.mostrar());
        else if (car1.getNumCarta()==car2.getNumCarta())System.out.println("Ambas cartas valen lo mismo");
        else System.out.println("El "+car2.mostrar()+" es mayor que el "+car1.mostrar());
    }
}
