/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.u4hoja8ej2;

/**
 *
 * @author Eloy
 */
public class Multiplicar {

    private int[][] array;

    public Multiplicar() {
        array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    array[i][j] = j;
                } else if (j == 0) {
                    array[i][j] = i;
                }
            }
        }
    }

    public void multiplica() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    array[i][j] = j;
                } else if (j == 0) {
                    array[i][j] = i;
                } else {
                    array[i][j] = array[0][j] * array[i][0];
                }
            }
        }
    }

    public void muestra() {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
        }
    }

    public int[] valoresAspa() {
        int[] valoresAspaDiagonal = new int[10];
        int[] valoresAspaDiagInvert = new int[10];

        for (int i = 0; i < array.length; i++) {
            valoresAspaDiagInvert[i] = array[i][i];
        }
        for (int i = (valoresAspaDiagonal.length - 1), j = 0; j < array.length && i >= 0; i--, j++) {
            valoresAspaDiagonal[j] = array[i][j];
        }

        int[] valoresAspa = new int[20];
        int contador = 0;
        for (int i = 0; i < valoresAspaDiagInvert.length; i++) {
            valoresAspa[contador] = (int) valoresAspaDiagInvert[i];
            contador++;
        }
        for (int i = 0; i < valoresAspaDiagonal.length; i++) {
            valoresAspa[contador] = valoresAspaDiagonal[i];
            contador++;
        }
        return valoresAspa;
    }

    public int[] tablaMultiplicar(int numero) {
        int[] tablaMultiplicar = new int[9];

        for (int i = 0; i < tablaMultiplicar.length; i++) {
            if (numero == 0) {
                tablaMultiplicar[i] = array[numero][i] = 0;
            } 
            else{
                tablaMultiplicar[i] = array[(numero)][i + 1];
            }
        }
        return tablaMultiplicar;
    }

}
