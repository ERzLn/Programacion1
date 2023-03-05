/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.u4hoja6ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Banco {
    private Cliente[]banco;
    private int contador, numUsuarios;

    public Banco(int numUsuarios) {
        this.banco=new Cliente[numUsuarios];
        this.contador=0;
        
    }
    public void ingresar(int numIngresos){    
        for(int i=0;i<numIngresos;i++){
        banco[contador]=new Cliente();
        banco[contador].setCodigo(contador++);
        }
        
    }
    public void buscar(){
        String busqueda;
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce el nombre y los apellidos del cliente a buscar: ");    
        busqueda=entrada.nextLine();
        for(int i=0;i<contador;i++){
            if(banco[i].getNombre().equalsIgnoreCase(busqueda)){
                System.out.println(
                     "Numero cliente: "
                     +(banco[i].getCodigo()+1)+
                    "\n"+banco[i].getNombre()+
                    "\n"+banco[i].getTelefono()+
                    "\n"+banco[i].getSaldo()+"€");
            }
        }
    }
    public void eliminar(int idCliente){
        int id=idCliente-1;
        for(int i=id;i<contador-1;i++){
            banco[i]=banco[i+1];
            banco[i].setCodigo(i+1);
        }
        this.contador--;
    }
    public void mostrar(int idCliente){
        
        for(int i=0;i<contador;i++){
            if ((idCliente-1)==i){
            System.out.println("Numero cliente: "
                     +(banco[i].getCodigo()+1)+
                    "\n"+banco[i].getNombre()+
                    "\n"+banco[i].getTelefono()+
                    "\n"+banco[i].getSaldo()+"€");
        }}
    }
    
}
