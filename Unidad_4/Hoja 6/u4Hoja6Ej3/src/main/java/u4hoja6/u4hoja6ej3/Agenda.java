/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4hoja6.u4hoja6ej3;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Agenda {

    private Persona[] personas;
    public int contador;
    private int tamaño;

    public Agenda(int tamaño) {
        this.tamaño = tamaño;
        this.contador = 0;
        personas = new Persona[tamaño];

    }

    public void insertar() {
        Scanner entrada = new Scanner(System.in);

        if (contador < this.tamaño) {
            System.out.println("Introduzca el nombre de la persona:");
            String nombre = entrada.nextLine();
            System.out.println("Introduzca telefono: ");
            int telefono = new Scanner(System.in).nextInt();
            personas[contador] = new Persona(nombre, telefono);
            contador++;
        } else {
            System.out.println("Se ha alcanzado la capacidad maxima de la agenda.");
        }
    }

    public void mostrar() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Telefono: " + personas[i].getTelefono());
            System.out.println();
        }
    }

    public void buscar(String nombre) {
        System.out.println("Introduce el nombre a buscar: ");
        for (int i = 0; i < contador; i++) {
            if (personas[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Nombre: " + personas[i].getNombre());
                System.out.println("Telefono: " + personas[i].getTelefono());
            }
        }
    }

    public void modificar(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < contador && !encontrado; i++) {
            if (personas[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Este es el telefono encotrado: " + personas[i].getTelefono() + "\n" + " Ese es el numero que quieres combiar?(Si o No): ");
                String encontr = new Scanner(System.in).nextLine();
                if (encontr.equalsIgnoreCase("Si")) {
                    encontrado = true;
                    System.out.println("Introduce el nuevo telefono para " + personas[i].getNombre());
                    int newTelefono = new Scanner(System.in).nextInt();
                    personas[i].setTelefono(newTelefono);
                    System.out.println();
                    System.out.println("TELEFONO DE " + personas[i].getNombre() + " MODIFICADO");
                } else if (encontr.equalsIgnoreCase("No")) {
                    encontrado = false;
                } else {
                    System.out.println("Valor incorrecto");
                }
            }
        }
    }
}
