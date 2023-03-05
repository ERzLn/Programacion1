/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojamain.u4hojamainej4;

/**
 *
 * @author Eloy
 */
public class Operaciones {
    public int a,b;

    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int suma(){
        return a+b;
    }
    public int resta(){
        return a-b;
    }
    public int multiplicacion(){
        return a*b;
    }
    public double division(){
        return (double)a/(double)b;
    }
}
