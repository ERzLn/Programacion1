/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

/**
 *
 * @author Víctor Sánchez Llada
 */
public class Griego extends Guerrero {

    /**
     * Constructor que recibe por parámetro el nombre, edad y fuerza del griego y hace una llamada con estos valores al constructor de la super clase.
     *
     * @param nombre Párametro de tipo String que será el nombre del griego.
     * @param edad Parámetro de tipo int que será la edad del griego.
     * @param fuerza Parámetro de tipo int que será la fuerza del griego.
     */
    public Griego(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }
    
    /**
     * Constructor que pide todos los datos por teclado validandolos.
     */
    public Griego() {
        super(Teclado.introduceNombre(), Teclado.introduceEdadFuerza(0, 100, "edad"), Teclado.introduceEdadFuerza(0, 50, "fuerza"));
    }

    /**
     * Método retirarse que devuelve un boolean siempre que estén heridos y, evidentemente, no estén muertos.
     *
     * @return Devuelve un boolean.
     */
    @Override
    public boolean retirarse() {
        return super.isHerido() && !super.isMuerto();
    }

}
