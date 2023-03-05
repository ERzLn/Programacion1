/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja1.u3hoja1ej3;

/**
 *
 * @author Eloy
 */
public class Llamada {

    private int segDuracionTotal;
    private int segundosLlamada, minutosLlamada;
    private double precioLlamada;

    public Llamada() {
        segDuracionTotal = 0;
    }

    public double aPagar(int minutosLlamada, int segundosLlamada) {
        segDuracionTotal = (minutosLlamada * 60) + segundosLlamada;
        if (segDuracionTotal <= 60) {
            precioLlamada = 0.25;

        } else if (segDuracionTotal >= 60) {
            precioLlamada = 0.25 + (((segDuracionTotal - 60) / 10) * 0.1);

        }
        return precioLlamada;
    }
}
