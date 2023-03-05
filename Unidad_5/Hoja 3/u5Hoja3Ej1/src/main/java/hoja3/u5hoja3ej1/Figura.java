/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.u5hoja3ej1;

/**
 *
 * @author DAW122
 */
public abstract class Figura {
    protected double radio, altura;
    protected abstract double area();
    protected abstract double volumen();

    public Figura(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }   
    
    
}
