/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main2;

import com.mycompany.main.Griego;
import com.mycompany.main.Guerrero;
import com.mycompany.main.Troyano;

/**
 *
 * @author Eloy
 */
public class Main2 {

    public static void main(String[] args) {
         System.out.println("### CREAR TROYANOS ###");
        Troyano troyano1 = new Troyano("Troyano Juan", 27, 7);
        //Troyano troyano2 = new Troyano();
        System.out.println("\n### CREAR GRIEGOS ###");
        Griego griego1 = new Griego("Griego Pepe", 40, 8);
        Griego griego2 = new Griego("Griego Paco", 30, 6);
        //Griego griego2 = new Griego();
        System.out.println("\n### CREAR CABALLO 10 Y AGREGAR GRIEGO1 ###");
        Caballo miCaballo = new Caballo(griego1, 10);
        
        System.out.println("\n### MONTAR GRIEGO1 EN CABALLO ###");
        montarGriego(miCaballo.montar(griego1));
        System.out.println("\n### MONTAR TROYANO EN CABALLO ###"); //Error
        montarGriego(miCaballo.montar(troyano1));
        
        System.out.println("\n### CREAR ARRAY DE GUERREROS Y CREAR CABALLO ###");
        Guerrero[] guerreros = {griego1, griego2};
        Caballo miCaballo2 = new Caballo(guerreros);
        
        System.out.println("\n### BÚSQUEDA DE GUERRERO ###");
        int posicionBusqueda = miCaballo2.buscar(Teclado.introduceNombre());
        if (posicionBusqueda >= 0) {
            System.out.println(guerreros[posicionBusqueda].toString());
        } else {
            System.out.println("El guerrero no se encuentra.");
        }
        
    }
    
    /**
     * Método privado monstarGriego que formatea la salida del método montar.
     * 
     * @param montar Parámetro de tipo int que será la salida del método montar.
     */
    private static void montarGriego(int montar) {
        switch (montar) {
            case -1 -> System.out.println("Caballo lleno, no es posible montar el guerrero.");
            case -2 -> System.out.println("El guerrero es un troyano, no se puede montar.");
            default -> System.out.println("Griego montado en el caballo, ocupantes " + montar + ".");
        }
    }
    
}