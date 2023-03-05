/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2hoja7.ej2u2hoja7;

/**
 *
 * @author Eloy
 */
public class Triangulo {

    private int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean esIsosceles() {
        boolean isosceles;
        /*
        boolean isosceles1 = lado1 == lado2;
        boolean isosceles2 = lado2 == lado3;
        
        boolean isosceles = !isosceles1 || !isosceles2;
        return isosceles; */
        if (lado1 == lado2) {
            isosceles = lado1 != lado3;
            return isosceles;
        } 
        else if (lado2 == lado3) {
            isosceles = lado3 != lado1;
            return isosceles;
        } 
        else if (lado1 == lado3) {
            isosceles = lado3 != lado2;
            return isosceles;
        } 
        else {
            isosceles = false;
            return isosceles;
        }

    }

    public boolean esEquilatero() {
        boolean equilatero1 = lado1 == lado2;
        boolean equilatero2 = lado1 == lado3;
        boolean equilatero = equilatero1 && equilatero2;
        return equilatero;
    }

    public double perimetro() {
        int perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
}
