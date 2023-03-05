/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2hoja3.u2hoja3ej2;

/**
 *
 * @author xboxr
 */
public class Numero {
    private int numero;
    
    public Numero(){ 
        
    }
    public Numero(int numero){
        this.numero=numero;
    }
    public int dameNumero(){
        return numero;
    }
    
    public int ponNumero(int numero){
        this.numero=numero;
        return numero;
    }
    public int suma(int numeroaSumar){
        numero+=numeroaSumar;    
        return numero;
    }
    public int resta(int numeroaRestar){
        numero+=numeroaRestar;     
        return numero;
    }
    public int numeroInterno(){
        return numero;
    }
    public int doble(){
        numero=numero*2;
        return numero;
    }
    public int triple(){
        numero=numero*3;
        return numero;
    }
    
        
   
        
    
    
}
