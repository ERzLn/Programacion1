/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main2;

import com.mycompany.main.Griego;
import com.mycompany.main.Guerrero;
import java.util.Arrays;

/**
 *
 * @author Eloy
 */
public class Caballo implements PuedeMontarse {

    public final int CAPACIDAD;
    public int ocupacion;
    public Guerrero[] ocupantes;

    public Caballo(Guerrero[] guerreros) {

        if (comprobarSonGriegos(guerreros)) {
            CAPACIDAD = guerreros.length;
            ocupantes = guerreros;
            ocupacion = ocupantes.length;
            System.out.println("Creado array de griegos. ocupacion=" + ocupacion);
        } else {
            CAPACIDAD = 100;
            ocupantes = new Guerrero[this.CAPACIDAD];
            ocupacion = ocupantes.length;
            System.out.println("No es posible crear array de griegos porque hay un troyano. ocupacion=" + ocupacion);
        }
    }

    public Caballo(Guerrero guerrero, int capacidad) {
        CAPACIDAD = capacidad;
        ocupacion = 0;
        ocupantes = new Guerrero[CAPACIDAD];
        if (comprobarGriego(guerrero)) {
            ocupantes[ocupacion] = guerrero;
            ocupacion++;

        }
    }

    public boolean comprobarSonGriegos(Guerrero[] g) {
        boolean sonGriegos = false;
        for (int i = 0; i < ocupantes.length; i++) {
            if (g[i] instanceof Griego) {
                sonGriegos = true;
            } else {
                sonGriegos = false;
            }
        }
        return sonGriegos;
    }

    public boolean comprobarGriego(Guerrero guerrero) {
        return guerrero instanceof Griego;
    }

    public void ordenar() {
        Arrays.sort(ocupantes, 0, ocupacion);
    }

    public int buscar(String nombre) {
        ordenar();
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < ocupacion && !encontrado; i++) {
            if (ocupantes[i].getNOMBRE().equalsIgnoreCase(nombre)) {
                posicion = i + 1;
                encontrado = true;
            }
        }
        return posicion;
    }

    @Override
    public int montar(Guerrero g) {
        int resulMontar = 0;
        if (ocupacion >= CAPACIDAD) {
            resulMontar = -1;
        } else {
            if (comprobarGriego(g)) {
                ocupantes[ocupacion] = g;
                ocupacion++;
                resulMontar = ocupacion;
            } else {
                resulMontar = -2;
            }
        }
        return resulMontar;

    }

    @Override
    public void desmontar() {
        ocupantes=new Guerrero [CAPACIDAD];
        ocupacion=0;
    }

}
