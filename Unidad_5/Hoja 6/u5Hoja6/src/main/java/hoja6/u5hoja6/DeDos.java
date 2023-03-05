/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.u5hoja6;

/**
 *
 * @author Eloy
 */
public class DeDos implements Series {
    private int valor, anterior;

    public DeDos() {
        valor=Series.INICIO;
        if (valor>=2) {
            anterior=valor-2;   
}
        
    }
    
    @Override
    public void getSiguiente() {
        valor+=2;
        System.out.println("Valor siguiente: "+valor);
        anterior=valor-2;
    }

    
    @Override
    public void reiniciar() {
        valor=Series.INICIO;
        
        }

    @Override
    public void setComenzar(int x) {
        valor=x;
        anterior=valor-2;
    }
    public void getAnterior(){
        System.out.println("Anterior: "+anterior);
    }
}
    

