/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.u5hoja5ej1;

/**
 *
 * @author DAW122
 */
public class AutoAnfibio implements TransporteTerrestre,TransporteMaritimo{
    private String marca, modelo;

    public AutoAnfibio(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    @Override
    public void andar(){
        System.out.println("Estoy andando");
    }
    @Override
    public void nadar(){
        System.out.println("Estoy nadando");
    }
}

