/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2herencia.u5hoja2ej2herencia;

/**
 *
 * @author DAW122
 */
public class EnPromocion extends Articulo {
    private int descuento;
    
    public EnPromocion(){   
    super();    
}
    public EnPromocion (int descuento, String codigo, String descripcion, double precio){
        super(codigo, descripcion, precio);
        this.descuento=descuento;
        this.precio=this.precio-this.precio*descuento/100;
    }
}
