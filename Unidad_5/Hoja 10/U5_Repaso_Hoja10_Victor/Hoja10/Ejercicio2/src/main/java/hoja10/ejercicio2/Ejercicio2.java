/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

Este problema creará la clase para representar al Caballo de Troya.
a) Crear la clase Caballo que tendrá como atributos públicos:
• capacidad, de tipo int, representa el número de guerreros griegos que puede haber dentro del caballo. No se podrá cambiar una vez le hemos dado valor.
• ocupacion, de tipo int, representa el número actual de griegos en el caballo.
• ocupantes, array de objetos de la clase Guerrero.
b) Crear dos constructores para la clase Caballo:
• el primero recibirá un array de Guerreros, deberá comprobar que todos los ocupantes son Griegos, en caso contrario se creará un Caballo sin ocupantes con capacidad 100 (en caso positivo, suponer que la capacidad es la del número de Guerreros que se ha pasado como parámetro)
• el segundo recibirá un único Guerrero y la capacidad. También deberá comprobar que el Guerrero es Griego, en caso contrario se creará un Caballo sin ocupantes.
c) Crear el método void ordenar() que ordene el array de ocupantes según su fuerza.
d) Crear un método int buscar (String nombre) que busque por su nombre un guerrero dentro del array ocupantes ordenado según el método anterior y devuelva la posición en que está ó -1 si no está.
e) Definir la interfaz PuedeMontarse que especifica que se puede montar en los objetos de tipo Caballo. Tendrá dos métodos:
• int montar (Guerrero g) que monta un Guerrero en el Caballo y devuelve el número de ocupantes que hay actualmente ó -1 si el Caballo ya está lleno. Deberá comprobar que sólo los griegos puedan montar en el Caballo (si se intenta montar un Troyano devolverá -2).
• void desmontar () que desmonta todos los Guerreros del Caballo.
f) Realizar los cambios oportunos en la clase Caballo para que implemente la interfaz PuedeMontarse.
i) Crear una clase, que en su método main cree un Troyano, un Caballo y un Griego, y monte al soldado Griego en el Caballo.
Intenta montar un troyano en el Caballo y que nos indique por pantalla si ha podido montarle o no.
Modifica los constructores de Griegos y Troyanos para realizar la entrada de datos por teclado. Para ello, se utilizará una clase Teclado, con métodos estáticos para la introducción de todos los datos, controlando las posibles excepciones.
Prueba en el programa principal a crear un griego y un troyano con el constructor por defecto.
 */

package hoja10.ejercicio2;

import hoja10.ejercicio1.*;

/**
 *
 * @author Víctor Sánchez Llada
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        System.out.println("### CREAR TROYANOS ###");
        Troyano troyano1 = new Troyano("Troyano Juan", 27, 7);
        //Troyano troyano2 = new Troyano();
        System.out.println("\n### CREAR GRIEGOS ###");
        Griego griego1 = new Griego("Griego Pepe", 40, 8);
        Griego griego2 = new Griego("Griego Paco", 30, 6);
        //Griego griego2 = new Griego();
        System.out.println("\n### CREAR CABALLO 10 Y AGREGAR GRIEGO1 ###");
        Caballo miCaballo = new Caballo(griego1, 10);
        
        System.out.println("\n### MONTAR GRIEGO1 EN CABALLO ###");
        montarGriego(miCaballo.montar(griego1));
        System.out.println("\n### MONTAR TROYANO EN CABALLO ###"); //Error
        montarGriego(miCaballo.montar(troyano1));
        
        System.out.println("\n### CREAR ARRAY DE GUERREROS Y CREAR CABALLO ###");
        Guerrero[] guerreros = {griego1, griego2};
        Caballo miCaballo2 = new Caballo(guerreros);
        
        System.out.println("\n### BÚSQUEDA DE GUERRERO ###");
        int posicionBusqueda = miCaballo2.buscar(Teclado.introduceNombre());
        if (posicionBusqueda >= 0) {
            System.out.println(guerreros[posicionBusqueda].toString());
        } else {
            System.out.println("El guerrero no se encuentra.");
        }
        
    }
    
    /**
     * Método privado monstarGriego que formatea la salida del método montar.
     * 
     * @param montar Parámetro de tipo int que será la salida del método montar.
     */
    private static void montarGriego(int montar) {
        switch (montar) {
            case -1 -> System.out.println("Caballo lleno, no es posible montar el guerrero.");
            case -2 -> System.out.println("El guerrero es un troyano, no se puede montar.");
            default -> System.out.println("Griego montado en el caballo, ocupantes " + montar + ".");
        }
    }
    
}
