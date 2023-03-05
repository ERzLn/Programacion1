/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

/**
 *
 * @author Víctor Sánchez Llada
 */
public class Troyano extends Guerrero {

    /**
     * Constructor que recibe por parámetro el nombre, edad y fuerza del troyano y hace una llamada con estos valores al constructor de la super clase.
     *
     * @param nombre Párametro de tipo String que será el nombre del troyano.
     * @param edad Parámetro de tipo int que será la edad del troyano.
     * @param fuerza Parámetro de tipo int que será la fuerza del troyano.
     */
    public Troyano(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }

    /**
     * Constructor que pide todos los datos por teclado validandolos.
     */
    public Troyano() {
        super(Teclado.introduceNombre(), Teclado.introduceEdadFuerza(0, 100, "edad"), Teclado.introduceEdadFuerza(0, 50, "fuerza"));
    }
    
    /**
     * Método retirarse que devuelve false ya que los troyanos no se pueden retirar.
     *
     * @return Devuelve un boolean.
     */
    @Override
    public boolean retirarse() {
        return false;
    }

}
