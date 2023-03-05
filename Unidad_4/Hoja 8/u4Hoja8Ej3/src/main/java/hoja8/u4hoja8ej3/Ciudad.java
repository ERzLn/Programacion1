/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.u4hoja8ej3;

/**
 *
 * @author Eloy
 */
public class Ciudad {
    private String nomCiudad;
    private double latitud,longitud;
    private long habitantes;

    public Ciudad(String nomCiudad, double latitud, double longitud, long habitantes) {
        this.nomCiudad = nomCiudad;
        this.latitud = latitud;
        this.longitud = longitud;
        this.habitantes = habitantes;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public long getHabitantes() {
        return habitantes;
    }
    @Override
    public String toString(){
        String datos=nomCiudad+" tiene "+habitantes+" habitantes. Su latitud es "+latitud+"º y su longitud "+longitud+"º";
        return datos;
    }
}
