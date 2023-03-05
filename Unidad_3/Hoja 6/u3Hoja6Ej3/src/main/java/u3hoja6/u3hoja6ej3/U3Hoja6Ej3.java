/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u3hoja6.u3hoja6ej3;

/**
 *
 * @author Eloy
 */
public class U3Hoja6Ej3 {

    public static void main(String[] args) {
        SintonizadorFM sinto=new SintonizadorFM(100);
        System.out.println("Sintonizador 1: ");
        sinto.subir();
        sinto.mostrarfrecuencia();
        sinto.bajar();
        sinto.mostrarfrecuencia();
        SintonizadorFM sinto2=new SintonizadorFM(200);
        System.out.println("Sintonizador 2: ");
        sinto2.mostrarfrecuencia();
        SintonizadorFM copiaSinto=new SintonizadorFM(sinto);
        System.out.println("Sintonizador Copia: ");
        copiaSinto.mostrarfrecuencia();
    }          
}
