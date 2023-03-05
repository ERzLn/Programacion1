/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hoja6.u5hoja6;

/**
 *
 * @author Eloy
 */
public interface Series {
    int INICIO=0;
    public abstract void getSiguiente();
    public abstract void reiniciar();
    public abstract void setComenzar(int x);
    default void mostrarInicio(){
        System.out.println("El valor de inicio es: "+INICIO);
    }
    public static void nombreInterfaz(){
        System.out.println("El nombre de la interfaz es: Series.");
    }
}
