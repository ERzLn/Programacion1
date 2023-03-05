/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.u5hoja5ej2;

/**
 *
 * @author DAW122
 */
public class Mamifero {
    protected String raza, alimento;
    protected int patas;


    public Mamifero(String raza, String alimento, int patas) {
        this.raza = raza;
        this.alimento = alimento;
        this.patas = patas;
    }
    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + ", alimento=" + alimento + ", patas=" + patas + '}';
    }
}
