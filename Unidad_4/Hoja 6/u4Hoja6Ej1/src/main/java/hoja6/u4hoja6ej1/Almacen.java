package hoja6.u4hoja6ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Almacen {

    private Articulo[] almacen;

    public Almacen(int tamano) {
        this.almacen = new Articulo[tamano];
    }

    public void llenar() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < almacen.length; i++) {
            System.out.println("Ingrese los datos del artículo " + (i + 1) + ":");
            almacen[i] = new Articulo();
        }
    }

    public void pedidos() {
        for (int i = 0; i < almacen.length; i++) {
            Articulo articulo = almacen[i];
            if (articulo.getExistencias() < 10) {
                System.out.println();
                System.out.println("Código: " + articulo.getCodigo());
                System.out.println("Descripción: " + articulo.getDescripcion());
                System.out.println("Existencias: " + articulo.getExistencias());
            }
        }
    }
}
