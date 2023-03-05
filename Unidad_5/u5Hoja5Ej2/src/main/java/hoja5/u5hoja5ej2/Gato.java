/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.u5hoja5ej2;

/**
 *
 * @author DAW122
 */
public class Gato extends Mamifero implements Felino, Domestico {

    public Gato(String raza, String alimento, int patas) {
        super(raza, alimento, patas);
    }
    @Override
    public String araniar(){
        return "El felino araña";
    }
    @Override
    public String obedecer(){
        return "El felino obedece";
    }
    
}
