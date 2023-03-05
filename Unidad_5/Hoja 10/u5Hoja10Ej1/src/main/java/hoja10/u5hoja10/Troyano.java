/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.u5hoja10;

import hoja10.u5hoja10.Teclado;

/**
 *
 * @author DAW122
 */
public class Troyano extends Guerrero {

    public Troyano(String NOMBRE, int edad, int fuerza) {
        super(NOMBRE, edad, fuerza);
    }
    public Troyano(){
        Teclado.tecladoGuerrero();
    }

    @Override
    public boolean retirarse() {
        return false;
        }

    
    
}
