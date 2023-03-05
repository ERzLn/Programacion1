/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja4.u3hoja4ej7;

/**
 *
 * @author Eloy
 */
public class Operaciones {

    public int x;

    public Operaciones(int x) {
        this.x = x;
    }

    public void metodo1() {
        String xCadena = String.valueOf(x);
        int numCifras = xCadena.length();
        System.out.println("El numero " + x + " es un numero de " + numCifras + " cifras.");
    }

    public void metodo2() {

        for (int xVeces = 1; xVeces <= 10; xVeces++) {
            System.out.println(x + " X " + xVeces + " = " + (x * xVeces));
        }

    }

    public void metodo3() {
        int xVecesTot = 0;
        for (int xVeces = 1; xVeces < x; xVeces++) {
            if (x % xVeces == 0) {
                System.out.println("Divisor: " + xVeces);

                xVecesTot += xVeces;

                if (xVecesTot == x && xVeces >= (x / 2)) {
                    System.out.println(x + " Es un numero perfecto");
                }

            } else if (xVeces == x - 1 && xVecesTot != x) {
                System.out.println(x + " No es un numero perfecto");
            }

        }
        if (x == 1 || x == 2) {
            System.out.println(x + " No es un numero perfecto ");
        }

    }
}
