/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.u5hoja5ej3;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Agenda {
    private int contador;
    private Contacto[] contactos;

    public Agenda(int tamañoAgenda) {
        contactos=new Contacto[tamañoAgenda];
        contador=0;
    }
    public void insertar(){
        contactos[contador]=new Contacto();
        contador++;
    }
    public void buscar(){
        System.out.println("Introduce el nombre a buscar: ");
        String nombreBuscar=new Scanner(System.in).nextLine();
        for (int i = 0; i < contador; i++) {
            if(contactos[i].)
            
        }
    }
}
