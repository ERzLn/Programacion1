/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.u5hoja6;

/**
 *
 * @author Eloy
 */
public class DeTres implements Series {
    private int valor;

    public DeTres() {
        valor=Series.INICIO;
    }

    @Override
    public void getSiguiente() {
        valor+=3;
        System.out.println("Valor siguiente: \n "+valor);
        }

    @Override
    public void reiniciar() {
    valor=Series.INICIO;
    }

    @Override
    public void setComenzar(int x) {
    valor=x;
    }
    
}
