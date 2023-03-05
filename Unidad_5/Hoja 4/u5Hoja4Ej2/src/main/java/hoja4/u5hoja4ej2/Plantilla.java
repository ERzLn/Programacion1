/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.u5hoja4ej2;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Plantilla {

    private Empleado[] empleados;
    private int contador;

    public Plantilla() {
        contador = 0;
        System.out.println("Introduce el numero de empleados de la plantilla: ");
        int numEmpleados = new Scanner(System.in).nextInt();
        empleados = new Empleado[numEmpleados];
    }

    public void insertar(Empleado empleado) {
        empleados[contador] = empleado;
        contador++;
        
    }

    public String infoEmpleados() {
        String info = "";
        for (int i = 0; i < contador; i++) {
            info += empleados[i].imprimir() + " ";
        }
        return info;
    }

    public Programador progMasLineas() {
        Programador progMasLineas = null;
        for (int i = 0; i < contador; i++) {
            if (empleados[i] instanceof Programador) {
                progMasLineas = (Programador) empleados[0];
                Programador aux = (Programador) empleados[i];
                if (progMasLineas.lineasDeCodigoPorHora < aux.lineasDeCodigoPorHora) {
                    progMasLineas = aux;
                }
            }
        }
        return progMasLineas;
    }
    public String esSenior(){
        String esSenior="";        
        for (int i = 0; i < contador; i++) {
            if (empleados[i] instanceof Programador) {
                if(empleados[i].clasificacionEdad().equalsIgnoreCase("SENIOR")){
                    esSenior+=empleados[i].imprimir()+"\n";
                }
            }
        }
        return esSenior;
    }
    public void masSueldo(){
        for (int i = 0; i < contador; i++) {
                    Programador prog=(Programador)empleados[i];
            if (empleados[i] instanceof Programador) {
                if(empleados[i].clasificacionEdad().equalsIgnoreCase("INTERMEDIOS")
                        &&prog.lenguajeDominante.equalsIgnoreCase("JAVA")){
                    prog.aumentarSalario(20);
                }
                }
                    
                }
    }
    
}
