/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hojafechas.u4hojafechasej2;

/**
 *
 * @author Eloy
 */
public class U4HojaFechasEj2 {

    public static void main(String[] args) {
        Veterinario vet=new Veterinario();
        vet.añadir();
        vet.añadir();
        vet.añadir();
        System.out.println("Datos completos de la clinica: "+vet.mostrar());
        System.out.println("Datos de los mayores de los 5 años"+vet.mostrarMayores());
    }
}
