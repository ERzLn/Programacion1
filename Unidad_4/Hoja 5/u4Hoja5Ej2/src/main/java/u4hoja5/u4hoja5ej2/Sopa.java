/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4hoja5.u4hoja5ej2;

/**
 *
 * @author Eloy
 */
public class Sopa {

    char[][] arr;

    public Sopa() {
        arr = new char[10][20];
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                arr[x][y] = (char) ((int) (Math.floor(Math.random() * (90 - 65 + 1)) + 65));
            }
        }
    }

    public Sopa(int filas, int columnas) {
        arr = new char[filas][columnas];
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                arr[x][y] = (char) ((int) (Math.floor(Math.random() * (90 - 65 + 1)) + 65));
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }

    public void setPalabra(String palabra, int x, int y, int D) {
        palabra = palabra.toUpperCase();
        switch (D) {
            case 1 -> {
                if (x + palabra.length() <= arr.length) {
                    for (int i = 0; i < palabra.length(); i++) {
                        arr[x + i][y] = palabra.charAt(i);
                    }
                } else {
                    System.out.println("La palabra no cabe!!");
                }
            }
            case -1 -> {
                if (y + palabra.length() <= arr[x].length) {
                    for (int i = 0; i < palabra.length(); i++) {
                        arr[x][y + i] = palabra.charAt(i);
                    }
                } else {
                    System.out.println("La palabra no cabe!!");
                }

            }
        }
    }}
