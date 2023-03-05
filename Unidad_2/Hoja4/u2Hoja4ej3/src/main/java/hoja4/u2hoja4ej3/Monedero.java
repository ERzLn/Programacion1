/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.u2hoja4ej3;

/**
 *
 * @author DAW122
 */
public class Monedero {
private double saldo;
public Monedero(double saldo){ 
    this.saldo=saldo;
}

public void ingreso (double ingreso){
    saldo+=ingreso;
}
public void retirada (double retirada){
    if (saldo>retirada){
        saldo-=retirada;
        System.out.println("Has retirado: "+retirada+"€");
    }
    else if (saldo<retirada){
    System.out.println("No hay saldo suficiente");
}
}
public double getSaldo(){
       return saldo;
}
}
