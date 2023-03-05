/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

/**
 *
 * @author Víctor Sánchez Llada
 */
public abstract class Guerrero implements Comparable<Guerrero>{

    private final String NOMBRE;
    private int edad;
    private int fuerza;
    private boolean herido;
    private boolean muerto;

    /**
     * Constructor que recibe como parámetros todos los valores que tendrán los atributos excepto herido y muerto que serán por defecto false. Se comprobará que la edad y la fuerza sean correctas, de lo contrario edad = 25 y fuerza = 5.
     *
     * @param nombre Párametro de tipo String que será el nombre del guerrero.
     * @param edad Parámetro de tipo int que será la edad del guerrero.
     * @param fuerza Parámetro de tipo int que será la fuerza del guerrero.
     */
    public Guerrero(String nombre, int edad, int fuerza) {
        this.NOMBRE = nombre;
        this.edad = comprobarEdad(edad) ? edad : 25;
        this.fuerza = comprobarFuerza(fuerza) ? fuerza : 5;
        this.herido = false;
        this.muerto = false;
    }

    /**
     * Constructor que utiliza el constructor Guerrero(String nombre, int edad, int fuerza) pero estableciendo por defecto el guerrero a ("guerreroX", 15, 1).
     */
    public Guerrero() {
        this("guerreroX", 15, 1);
    }

    /**
     * Constructor que recibe un objeto de tipo Guerrero, un nombre y creará una copia del guerrero pasado con el nuevo nombre.
     *
     * @param guerrero Parámetro de tipo Guerrero que será el guerrero a copiar.
     * @param nombre Parámetro de tipo String que será el nombre del guerrero.
     */
    public Guerrero(Guerrero guerrero, String nombre) {
        this.NOMBRE = nombre;
        this.edad = comprobarEdad(guerrero.edad) ? guerrero.edad : 25;
        this.fuerza = comprobarFuerza(guerrero.fuerza) ? guerrero.fuerza : 5;
        this.herido = false;
        this.muerto = false;
    }

    /**
     * Método estático comprobarEdad que devuelve true si la edad está entre 15-60 (ambos inclusive) y false si no lo está.
     *
     * @param e Parámetro de tipo int que será la edad del guerrero.
     * @return Devuelve un boolean.
     */
    protected static boolean comprobarEdad(int e) {
        return e >= 15 && e <= 60;
    }

    /**
     * Método estático comprobarFuerza que devuelve un true si la fuerza está entre 1-10 (ambos inclusive) y false si no lo está.
     *
     * @param f Parámetro de tipo int que será la fuerza del guerrero.
     * @return Devuelve un boolean.
     */
    protected static boolean comprobarFuerza(int f) {
        return f >= 1 && f <= 10;
    }

    /**
     * Método abstracto retirarse que deberá desarrollarse en las subclases según criterios.
     *
     * @return Devuelve un boolean.
     */
    public abstract boolean retirarse();
    
    /**
     * Método compareTo que establece el criterio de ordenación con la fuerza del guerrero. Por parámetro le llega un objeto de tipo Guerrero.
     * 
     * @param o
     * @return Devuelve un int.
     */
    @Override
    public int compareTo(Guerrero o) {
        return fuerza - o.fuerza;
    }
    
    /**
     * Método getNombre que devuelve el nombre del guerrero.
     *
     * @return Devuelve un String.
     */
    public String getNombre() {
        return NOMBRE;
    }

    /**
     * Método getEdad que devuelve la edad del guerrero.
     *
     * @return Devuelve un int.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método getFuerza que devuelve la fuerza del guerrero.
     *
     * @return Devuelve un int.
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * Método isHerido que devuelve true si el guerrero está herido o false si no lo está.
     *
     * @return Devuelve un boolean.
     */
    public boolean isHerido() {
        return herido;
    }

    /**
     * Método isMuerto que devuelve un true si el guerrero está muerto o false si no lo está.
     *
     * @return Devuelve un boolean.
     */
    public boolean isMuerto() {
        return muerto;
    }

    /**
     * Método setEdad que establece el atributo edad con el valor pasado como parámetro.
     *
     * @param edad Parámetro de tipo int que será la edad del guerrero.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método setFuerza que establece el atributo fuerza con el valor pasado como parámetro.
     *
     * @param fuerza Parámetro de tipo int que será la fuerza del guerrero.
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * Método setHerido que establece el atributo herido con el valor pasado como parámetro.
     *
     * @param herido Parámetro de tipo boolean que será si el guerrero está herido (true) o si no lo está (false).
     */
    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    /**
     * Método setMuerto que establece el atributo muerto con el valor pasado como parámetro.
     *
     * @param muerto Parámetro de tipo boolean que será si el guerrero está muerto (true) o si no lo está (false).
     */
    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    /**
     * Método toString que devuelve una cadena con la información del guerrero.
     * 
     * @return Devuelve un String.
     */
    @Override
    public String toString() {
        return "Guerrero{" + "NOMBRE=" + NOMBRE + ", edad=" + edad + ", fuerza=" + fuerza + ", herido=" + herido + ", muerto=" + muerto + '}';
    }
    
}
