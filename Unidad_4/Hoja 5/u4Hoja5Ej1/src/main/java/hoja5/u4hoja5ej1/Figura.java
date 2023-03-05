/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.u4hoja5ej1;

/**
 *
 * @author DAW122
 */
public class Figura {

    private char[][] matriz;
    private char letra;

    public Figura(int n) {
        letra = 'L';
        matriz = new char[n][n];
    }

    public String cuadrado() {
        String dibujo = "";
        
        for (int i = 0; i < matriz.length; i++) {
            dibujo += "\n";
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = letra;
                dibujo += matriz[i][j];
            }
        }
        return dibujo;
    }

    public String cuadradoVacio() {
        String dibujo = "";
        String espacio = " ";
        for (int i = 0; i < matriz.length; i++) {
            dibujo += "\n";
            for (int j = 0; j < matriz.length; j++) {
                if (i == 0 || i == matriz.length - 1 || j == 0) {
                    matriz[i][j] = letra;
                    dibujo += matriz[i][j];
                }
                else if(j == matriz.length - 1 && i != 0 && i != matriz.length - 1) {
                    for (int l = 0; l < matriz.length - 2; l++) {
                        dibujo += espacio;
                    }
                    dibujo += letra;
                }
            }
        }
        return dibujo;
    }

    public String aspa() {
        String resultado = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || i == matriz.length - 1 - j) {
                    matriz[i][j] = letra;
                    resultado += letra;
                } else {
                    matriz[i][j] = ' ';
                    resultado += ' ';
                }
            }
            resultado += "\n";
        }
        return resultado;

    }
}
