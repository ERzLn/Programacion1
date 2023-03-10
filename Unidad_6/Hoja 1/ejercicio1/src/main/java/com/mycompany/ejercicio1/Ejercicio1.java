package com.mycompany.ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> listaValores = leeValores();
        int suma = calcularSuma(listaValores);
        double media = (double) suma / listaValores.size();
        mostrarResultados(listaValores, suma, media);
    }

    public static ArrayList<Integer> leeValores() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaValores = new ArrayList<>();
        System.out.println("Introduce valores numéricos enteros (termina con -99):");
        int valor = sc.nextInt();
        while (valor != -99) {
            listaValores.add(valor);
            valor = sc.nextInt();
        }
        return listaValores;
    }

    public static int calcularSuma(ArrayList<Integer> listaValores) {
        int suma = 0;
        Iterator<Integer> it = listaValores.iterator();
        while (it.hasNext()) {
            suma += it.next();
        }
        return suma;
    }

    public static void mostrarResultados(ArrayList<Integer> listaValores, int suma,
                                         double media) {
        System.out.println("Números introducidos: " + listaValores.size());
        System.out.println("Suma: " + suma);
    }
}