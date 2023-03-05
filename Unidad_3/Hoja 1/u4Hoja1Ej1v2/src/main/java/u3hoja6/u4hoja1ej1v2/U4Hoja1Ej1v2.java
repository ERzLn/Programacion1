/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u3hoja6.u4hoja1ej1v2;

/**
 *
 * @author Eloy
 */
public class U4Hoja1Ej1v2 {

    public static void main(String[] args) {
        int[] ar = new int[10];

        for (int i = 0; i < ar.length; i++) {
            int m = 10;
            int n = 1;
            ar[i] = (int) Math.floor(Math.random() * (m - n + 1)) + n;

            if (i > 0) {
                for (int auxI = 0; auxI < i; auxI++) { //Creo un bucle pasando los numeros anteriores al 'i' actual.
                    if (ar[auxI] == ar[i]) { //Si alguno de los numeros anteriores a 'i' fuesen = que 'i'
                        ar[i] = (int) Math.floor(Math.random() * (m - n + 1)) + n; //generamos otro numero aleatorio
                        auxI = -1; //como hemos generado otro numero aleatorio, reiniciamos el contador para volver a comprobarlo
                    }             //si esto ultimo se hace volvemos a la linea 22 hasta que no coincida con ningún numero 
                }                 //Ahora parece sencillo, pero ha sido un follón jaja
            }
            System.out.println("Para la posicion " + (i + 1) + " el valor es " + ar[i]);
        }
    }
}
