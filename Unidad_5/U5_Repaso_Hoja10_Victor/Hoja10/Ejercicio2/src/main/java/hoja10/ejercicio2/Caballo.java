/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio2;

import hoja10.ejercicio1.*;
import java.util.Arrays;

/**
 *
 * @author Víctor Sánchez Llada
 */
public class Caballo implements PuedeMontarse {
    
    public final int CAPACIDAD; //Número de guerreros griegos que puede haber dentro del caballo.
    public int ocupacion; //Número actual de griegos dentro del caballo.
    public Guerrero[] ocupantes; //Array de guerreros griegos.
    
    /**
     * Constructor que recibe un array de Guerreros, deberá comprobar que todos los ocupantes son Griegos, en caso contrario se creará un Caballo sin ocupantes con capacidad 100 (en caso positivo, suponer que la capacidad es la del número de Guerreros que se ha pasado como parámetro)
     * 
     * @param guerreros Parámetro de tipo Guerrero[] que será un array de guerreros.
     */
    public Caballo(Guerrero[] guerreros) {
        
        if (comprobarSiEsGriego(guerreros)) {
            CAPACIDAD = guerreros.length;
            ocupantes = guerreros;
            ocupacion = ocupantes.length;
            System.out.println("Creado array de griegos. ocupacion=" + ocupacion);
        } else {
            CAPACIDAD = 100;
            ocupantes = new Guerrero[CAPACIDAD];
            ocupacion = 0;
            System.out.println("No es posible crear array de griegos porque hay un troyano. ocupacion=" + ocupacion);
        }
        
    }
    
    /**
     * Constructor que recibe un único Guerrero y la capacidad. También deberá comprobar que el Guerrero es Griego, en caso contrario se creará un Caballo sin ocupantes.
     * 
     * @param guerrero Parámetro de tipo Guerrero que será el guerrero a guardar en el array de ocupantes.
     * @param capacidad Parámetro de tipo int que será la capacidad del caballo.
     */
    public Caballo(Guerrero guerrero, int capacidad) {
        
        ocupacion = 0;
        CAPACIDAD = capacidad;
        ocupantes = new Guerrero[CAPACIDAD];
        
        if (comprobarSiEsGriego(guerrero)) {
            ocupantes[ocupacion] = guerrero;
            ocupacion++;
        }
        
    }
    
    /**
     * Método privado que devuelve true si los guerreros de un array pasado como parámetro son todos griegos y false en caso contrario.
     * 
     * @param guerreros Parámetro de tipo Guerrero[] que será un array de guerreros.
     * @return Devuelve un boolean.
     */
    private boolean comprobarSiEsGriego(Guerrero[] guerreros) {
        
        boolean ocupanteValido = true;
        
        for (int i = 0; i < guerreros.length && ocupanteValido; i++) {
            if (guerreros[i] instanceof Troyano) {
                ocupanteValido = false;
            }
        }
        
        return ocupanteValido;
        
    }
    
    /**
     * Método privado que devuelve true si el guerrero es griego y false en caso contrario.
     * 
     * @param guerrero Parámetro de tipo Guerrero que será el guerrero.
     * @return Devuelve un boolean.
     */
    private boolean comprobarSiEsGriego(Guerrero guerrero) {
        return guerrero instanceof Griego;
    }
    
    /**
     * Método ordenar que ordena el array de ocupantes según su fuerza (criterio de ordenación definido en la clase Guerrero compareTo()).
     */
    public void ordenar() {
        Arrays.sort(ocupantes, 0, ocupacion);
    }
    
    /**
     * Método buscar que busca por su nombre un guerrero dentro del array ocupantes ordenado según el método anterior y devuelva la posición en que está ó -1 si no está.
     * 
     * @param nombre Parámetro de tipo String que será el nombre del guerrero a buscar.
     * @return Devuelve un int.
     */
    public int buscar(String nombre) {
        
        boolean encontrado = false;
        int posicion = -1;
        ordenar();
        
        for (int i = 0; i < ocupacion && !encontrado; i++) {
            if (ocupantes[i].getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                posicion = i;
            }
        }
        
        return posicion;
        
    }

    /**
     * Método montar que monta un Guerrero en el Caballo y devuelve el número de ocupantes que hay actualmente ó -1 si el Caballo ya está lleno. Deberá comprobar que sólo los griegos puedan montar en el Caballo (si se intenta montar un Troyano devolverá -2).
     * 
     * @param g Parámetro de tipo Guerrero que será el guerrero a montar en el caballo.
     * @return Devuelve un int.
     */
    @Override
    public int montar(Guerrero g) {
        
        int resultMontar;
        
        if (ocupacion >= CAPACIDAD) {
            resultMontar = -1;
        } else {
            
            if (comprobarSiEsGriego(g)) {
                ocupantes[ocupacion] = g;
                ocupacion++;
                resultMontar = ocupacion;
            } else {
                resultMontar = -2;
            }
            
        }
        
        return resultMontar;
        
    }

    /**
     * Método desmontar que desmonta todos los Guerreros del Caballo.
     */
    @Override
    public void desmontar() {
        ocupantes = new Guerrero[CAPACIDAD];
        //ocupantes = null;
        //Arrays.fill(ocupantes, null);
        ocupacion = 0;
    }
    
}
