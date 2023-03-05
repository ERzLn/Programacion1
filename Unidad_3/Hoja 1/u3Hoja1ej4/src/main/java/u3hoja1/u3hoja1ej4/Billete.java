/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja1.u3hoja1ej4;

/**
 *
 * @author Eloy
 */
public class Billete {

    private int distancia, diasEstancia;
    private double precioBillete;

    public Billete(int distancia, int diasEstancia) {
        this.distancia = distancia;
        this.diasEstancia = diasEstancia;
    }

    public double importe() {
        if (diasEstancia >= 7 && distancia >= 800) {
            precioBillete = distancia * 0.6;
            precioBillete -= precioBillete * 0.3;
            return precioBillete;
        } else {
            precioBillete = distancia * 0.6;
        }
        return precioBillete;
    }
}
