/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.u5hoja3ej1;

/**
 *
 * @author DAW122
 */
class Cono extends Figura {

    public Cono(double radio, double altura) {
        super(radio, altura);
    }

    @Override
    public double area() {
        return Math.PI * radio * (radio +(Math.sqrt(Math.pow(radio, 2)+ Math.pow(altura, 2))));
    }

    @Override
    public double volumen() {
        return (1.0 / 3.0) * Math.PI * radio * radio * altura;
    }
}
