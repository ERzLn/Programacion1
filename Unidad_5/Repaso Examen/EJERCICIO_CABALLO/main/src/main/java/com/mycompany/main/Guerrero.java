/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Eloy
 */
public abstract class Guerrero implements Comparable<Guerrero> {

    private final String NOMBRE;
    private int fuerza, edad;
    private boolean herido, muerto;

    public boolean isMuerto() {
        return muerto;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isHerido() {
        return herido;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    protected static boolean comprobarEdad(int e) {
        boolean edadCorrecta = false;
        if (e >= 15 || e <= 60) {
            edadCorrecta = true;
        }
        return edadCorrecta;
    }

    protected static boolean comprobarFuerza(int f) {
        boolean fuerzaCorrecta = false;
        if (f >= 1 || f <= 10) {
            fuerzaCorrecta = true;
        }
        return fuerzaCorrecta;
    }

    public Guerrero(String NOMBRE, int fuerza, int edad) {
        this.NOMBRE = NOMBRE;
        this.herido=false;
        this.muerto=false;

        if (Guerrero.comprobarFuerza(fuerza)) {
            this.fuerza = fuerza;
        } else {
            this.fuerza = 5;
        }
        if (Guerrero.comprobarEdad(edad)) {
            this.edad = edad;
        } else {
            this.edad = 25;
        }
    }

    public Guerrero() {
        this("Guerrerox",1,15);
    }

    public Guerrero(Guerrero g, String nombre) {
        this.NOMBRE = nombre;
        this.edad = Guerrero.comprobarEdad(g.getEdad()) ? edad:15;
        this.fuerza = Guerrero.comprobarFuerza(g.getFuerza()) ? fuerza:1;
    }
    public abstract boolean retirarse();
    
    @Override
    public int compareTo(Guerrero o){
        return fuerza - o.fuerza;
    }
    

}
