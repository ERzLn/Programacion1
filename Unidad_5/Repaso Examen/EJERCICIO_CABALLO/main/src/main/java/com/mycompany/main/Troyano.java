/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Eloy
 */
public class Troyano extends Guerrero {

    public Troyano(String NOMBRE, int fuerza, int edad) {
        super(NOMBRE, fuerza, edad);
    }

    @Override
    public boolean retirarse() {
        return false;
    }

}
