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
public class Empleado {

    protected String nombre, departamento;
    protected int edad;
    protected boolean casado;
    protected double salario;

    public Empleado() {
        System.out.println("Introduce el nombre del empleado:");
        nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce el departamento: ");
        departamento = new Scanner(System.in).nextLine();
        System.out.println("Introduce edad:(18-65 años:");
        edad = new Scanner(System.in).nextInt();
        while (edad < 18 || edad > 65) {
            System.out.println("Introduce edad comprendida entre 18 y 65 años:");
            edad = new Scanner(System.in).nextInt();
        }
        System.out.println("Introduce si está casado (S/N):");
        String casad = new Scanner(System.in).next();
        if (casad.equalsIgnoreCase("S")) {
            casado = true;
        }else casado=false;
        System.out.println("Introduce el salario:");
        salario=new Scanner(System.in).nextDouble();
    }

    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    public String clasificacionEdad(){
        String clasificacionEdad="";
        if(edad<=21){
            clasificacionEdad="Principiante";
        }
        else if(edad>=25&&edad<=35){
            clasificacionEdad="Intermedio";
        }
        else clasificacionEdad="Senior";
        return clasificacionEdad;
    }
    public String imprimir(){
        String imprimir=("DATOS DEL EMPLEADO: "+
                 "\n NOMBRE: "+nombre+
                " \n DEPARTAMENTO: "+departamento+
                " \n EDAD: "+edad+
                " \n CASADO: "+casado+
                " \n SALARIO: "+salario);
        return imprimir;
    }
    public void aumentarSalario(double porcentaje){
        porcentaje=(salario/100)*porcentaje;
        salario+=porcentaje;
    }
            

}
