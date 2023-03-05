                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.u5hoja10;

/**
 *
 * @author DAW122
 */
public abstract class Guerrero {

    private final String NOMBRE;
    private int edad, fuerza;
    private boolean herido, muerto;

    public Guerrero(String NOMBRE, int edad, int fuerza) {
        this.NOMBRE = NOMBRE;
        this.edad = edad;
        this.fuerza = fuerza;
    }

    public Guerrero() {
        this("guerreroX", 15, 1);
    }

    public Guerrero(Guerrero g, String nombre) {
        this.NOMBRE = nombre;
        this.edad = g.getEdad();
        this.fuerza = g.getFuerza();
        this.herido=g.isHerido();
        this.muerto=g.isMuerto();
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isHerido() {
        return herido;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    protected static boolean comprobarEdad(int e) {
        boolean enEdad = false;

        if (e >= 15 && e <= 60) {
            enEdad = true;
        }
        return enEdad;
    }

    protected static boolean comprobarFuerza(int f) {
        boolean fuerza = false;
        if (f <= 10 && f >= 1) {
            fuerza = true;
        }
        return fuerza;
    }
    public abstract boolean retirarse(); 
}
