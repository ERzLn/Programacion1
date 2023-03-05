/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoja6.u5hoja6;

/**
 *
 * @author Eloy
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeDos deDos = new DeDos();
        DeTres deTres = new DeTres();
        Series seriesDos = deDos;
        Series seriesTres = deTres;
        System.out.println("Serie DeDos a través de la variable Series");
        for (int i = 0; i < 5; i++) {
            seriesDos.getSiguiente();
        }
        System.out.println();
        
        System.out.println("Serie DeTres a través de la variable Series");
        for (int i = 0; i < 5; i++) {
            seriesTres.getSiguiente();
        }
        System.out.println();

        Series.nombreInterfaz();
        seriesDos.mostrarInicio();
    }
}
