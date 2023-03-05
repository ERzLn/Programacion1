/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.u4hoja8ej3;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Pais {

    private String pais;
    private Ciudad[] ciudades;
    private int numCiudades;

    public Pais(String pais) {
        this.pais = pais;
        ciudades = new Ciudad[25];
        numCiudades = 0;
    }

    public void añadirCiudad() {
        int contador = 0;
        if (numCiudades < ciudades.length) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce el nombre de la ciudad a añadir:");
            String ciudad = new Scanner(System.in).nextLine();
            System.out.println("Introduce latitud (de 0º a 90º) de " + ciudad);
            double latitud = new Scanner(System.in).nextDouble();
            System.out.println("Introduce longitud (de 0º a 90º) de " + ciudad);
            double longitud = entrada.nextDouble();
            System.out.println("Introduce el numero de habitantes de " + ciudad);
            long habitantes = entrada.nextLong();

            ciudades[numCiudades] = new Ciudad(ciudad, latitud, longitud, habitantes);
            numCiudades++;
        } else {
            System.out.println("No caben mas ciudades");
        }

    }

    public Ciudad ciudadMasPoblada() {
        Ciudad ciudadMasPoblada = ciudades[0];
        for (int i = 0; i < numCiudades; i++) {

            if (ciudades[i].getHabitantes() > ciudadMasPoblada.getHabitantes()) {
                ciudadMasPoblada = ciudades[i];
            }
        }
        return ciudadMasPoblada;
    }

    public void existeCiudad(String ciudad) {
        boolean existe = false;
        for (int i = 0; i < numCiudades; i++) {
            if (ciudades[i].getNomCiudad().equalsIgnoreCase(ciudad)) {
                System.out.println("La ciudad ya existe.");
                existe = true;
            }
            
        }
        if (!existe) {
            System.out.println("La ciudad no existe.");

        }
    }

    public long poblacionMedia() {
        long suma = 0;        
        for (int i = 0; i < numCiudades; i++) {
            suma += ciudades[i].getHabitantes();            
        }
        return (suma / numCiudades);
    }

    @Override
    public String toString() {
        String datosPais = "";
        for (int i = 0; i < numCiudades; i++) {
            datosPais = "Ciudades de " + pais + ": \n  " +
                    ciudades[i].getNomCiudad()+":\n  Población: "+
                    ciudades[i].getHabitantes()+"\n  Latitud: "+
                    ciudades[i].getLatitud()+" Longitud: "+
                    ciudades[i].getLongitud()+"\n ";
        }
        return datosPais;
    }
}
