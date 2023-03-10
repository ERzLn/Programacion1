/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad6.ejercicio1hoja1;

import java.util.Arrays;


/**
 *
 * @author DAW122
 */
public class Contenedor<T> {

    private T[] elementos;
    private int tamaño;

    public Contenedor() {
        elementos = (T[]) new Object[0];
        tamaño = 0;
    }

    public void insertarAlPrincipio(T nuevo) {
        T[] nuevoArray = (T[]) new Object[tamaño + 1];
        nuevoArray[0] = nuevo;
        System.arraycopy(elementos, 0, nuevoArray, 1, tamaño);
        elementos = nuevoArray;
        tamaño++;
    }

    public void insertarAlFinal(T nuevo) {
        T[] nuevoArray = (T[]) new Object[tamaño + 1];
        System.arraycopy(elementos, 0, nuevoArray, 0, tamaño);
        nuevoArray[tamaño] = nuevo;
        elementos = nuevoArray;
        tamaño++;
    }

    public T extraerDelPrincipio() {
        if (tamaño == 0) {
            return null;
        }
        T elemento = elementos[0];
        T[] nuevoArray = (T[]) new Object[tamaño - 1];
        System.arraycopy(elementos, 1, nuevoArray, 0, tamaño - 1);
        elementos = nuevoArray;
        tamaño--;
        return elemento;
    }

    public void ordenar() {
        Arrays.sort(elementos, 0, tamaño);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamaño; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(elementos[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
