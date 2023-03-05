/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u2hoja9.u2hoja9ej2;

/**
 *
 * @author Eloy
 */
public class U2Hoja9ej2 {

    public static void main(String[] args) {
        Alimento chorizo=new Alimento("Chorizo",0.293,0.19,true);
        chorizo.todo();
        System.out.println("Es dietetico?: "+chorizo.esDietetico());
        System.out.println("Calorias: "+chorizo.calorias(100));
    }
}
