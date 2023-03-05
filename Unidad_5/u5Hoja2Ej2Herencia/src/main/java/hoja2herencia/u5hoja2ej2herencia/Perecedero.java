/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2herencia.u5hoja2ej2herencia;


/**
 *
 * @author DAW122
 */
public class Perecedero extends Articulo {
    private int mes,anio;
    
    public Perecedero(){
        super();
    }
    public Perecedero (int mes, int anio, String codigo, String descripcion, double precio){
        this.mes=mes;
        this.anio=anio;
    }
    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
    this.mes=mes;
    }
    public int getAnio(){
        return anio;
    }
    
}

