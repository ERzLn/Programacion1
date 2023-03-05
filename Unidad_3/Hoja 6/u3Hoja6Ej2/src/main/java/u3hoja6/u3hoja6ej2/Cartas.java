/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja6.u3hoja6ej2;

/**
 *
 * @author Eloy
 */
public class Cartas {

    private int numCarta, numPalo;
    private final String COPAS = "de Copas";
    private final String BASTOS = "de Bastos";
    private final String ESPADAS = "de Espadas";
    private final String OROS = "de Oros";
    private String palo, carta;

    public Cartas() {
        this.numCarta = 1 + (int) (Math.random() * 10);
        this.numPalo = 1 + (int) (Math.random() * 4);
    }

    public String mostrar() {

        palo = switch (numPalo) {
            case 1 ->
                COPAS;
            case 2 ->
                BASTOS;
            case 3 ->
                ESPADAS;
            case 4 ->
                OROS;
            default ->
                null;
        };
        String espacio = " ";
        carta = String.valueOf(numCarta);
        carta = carta.concat(espacio).concat(palo);
        return carta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public void setNumPalo(int numPalo) {
        this.numPalo = numPalo;
    }

    public int getNumCarta() {
        return numCarta;
    }

}
