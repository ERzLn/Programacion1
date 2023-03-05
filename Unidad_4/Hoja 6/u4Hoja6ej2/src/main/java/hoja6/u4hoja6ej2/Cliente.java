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
public class Cliente {
    private int codigo, telefono;
    private double saldo;
    private String nombre;
    public Cliente() {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el nombre y apellidos del cliente");
        nombre=entrada.nextLine();
        System.out.println("Introduce el telefono: ");
        telefono=new Scanner(System.in).nextInt();
        System.out.println("Introduce el saldo: ");
        saldo=new Scanner(System.in).nextDouble();
        this.codigo=codigo++;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
