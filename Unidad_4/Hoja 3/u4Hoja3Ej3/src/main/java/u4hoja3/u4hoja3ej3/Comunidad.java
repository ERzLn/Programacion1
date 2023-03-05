/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4hoja3.u4hoja3ej3;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Comunidad {

    private String nombreComunidad;
    private String[] provincias;

    public Comunidad(String nombreComunidad, int numProvincias) {
        this.nombreComunidad = nombreComunidad;
        provincias = new String[numProvincias];
        for (int i = 0; i < provincias.length; i++) {
            System.out.println("Introduce la provincia " + (i + 1));
            Scanner entrada = new Scanner(System.in);
            provincias[i] = entrada.next();
        }
    }

    public void mostrar() {
        System.out.println(nombreComunidad.toUpperCase());
        for (int i = provincias.length - 1; i >= 0; i--) {
            if (provincias[i].length() >= 4) {
                String provCad = provincias[i].substring(0, 4);
                System.out.println(provCad + " ");
            } else {
                System.out.println("Provincia con solo " + String.valueOf(provincias[i].length()) + " letras");
            }
        }
    }
    public String sorteo(){
        int numAzar=(int)(Math.floor(Math.random()*provincias.length)+1);
        String sorteo=provincias[numAzar];
        return sorteo;
    }
    public int buscar(String nomProvincia) {
        int posProvincia = -1;
        for (int i = 0; i < provincias.length ; i++) {
            if ((provincias[i].toUpperCase()).contains(nomProvincia.toUpperCase())) {
                posProvincia = i;
            }           
        }
        return posProvincia;

    }

}
