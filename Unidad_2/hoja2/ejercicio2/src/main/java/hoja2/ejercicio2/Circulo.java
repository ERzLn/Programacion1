/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

/**
 *
 * @author DAW122
 */
public class Circulo {
    private double radio; //es el atributo de la clase circulo
    //constructor por defecto
    public Circulo(){
    
}
    //Constructor con parámetro, inicializa el objeto con el valor del radio
    public Circulo(double radio) {
        this.radio=radio;
    }
    //método que nos devuelve el valor del radio
    public double getRadio() {
         return radio;
}
    //método que establece el valor del radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
    //Método que devuelve el área del circulo
    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }
    //Método que devuelvo la longitud del circulo
    public double longitud() {
        return 2*Math.PI*radio;
    }
}
