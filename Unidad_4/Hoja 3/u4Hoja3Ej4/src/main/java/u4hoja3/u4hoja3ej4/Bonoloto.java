/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4hoja3.u4hoja3ej4;

/**
 *
 * @author Eloy
 */
public class Bonoloto {

    private int[] loteria;

    public Bonoloto() {
        loteria = new int[6];
        for (int i = 0; i < loteria.length; i++) {
            loteria[i] = (int) Math.floor(Math.random() * 50 + 1);
            if (i > 0) {
                for (int auxI = 0; auxI < i; auxI++) {
                    if (loteria[i] == loteria[auxI]) {
                        loteria[i] = (int) Math.floor(Math.random() * 50 + 1);
                        auxI = -1;
                    }
                }
            }
        }
    }

    public String mostrar() {
        String mostrar = "";
        for (int i = 0; i < loteria.length; i++) {
            mostrar += loteria[i] + " ";
        }
        return mostrar;
    }

}
