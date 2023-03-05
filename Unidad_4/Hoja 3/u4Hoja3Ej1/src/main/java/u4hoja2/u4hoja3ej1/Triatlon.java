/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4hoja2.u4hoja3ej1;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Triatlon {

    private String dorsal, nombre;
    private int[] ar;

    public Triatlon(String dorsal, String nombre, int numPruebas) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        ar = new int[numPruebas];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Introduce la puntuación de la prueba " + (i + 1));
            Scanner entrada = new Scanner(System.in);
            ar[i] = entrada.nextInt();
        }
    }

    public Triatlon() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero de pruebas: ");
        int num=entrada.nextInt();
        ar=new int[num];
        System.out.println("Introduce dorsal: ");
        dorsal = entrada.next();
        System.out.println("Introduce nombre: ");
        nombre = entrada.next();
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Introduce la puntuación de la prueba " + (i + 1));
            ar[i] = entrada.nextInt();
        }
    }

    public double pMedia() {
        double pMedia = 0;

        for (int i = 0; i < ar.length; i++) {
            pMedia += ar[i];
        }
        pMedia/=ar.length;
        return pMedia;
    }
    public boolean esSeleccionado(){
        boolean esSeleccionado=false;
    for(int i=0;i<ar.length;i++){
        esSeleccionado = ar[i]>10;
    }
    return esSeleccionado;
}
    public String mostrar(){
        String puntuaciones="";
    
        for(int i=0;i<ar.length;i++){
            puntuaciones+=ar[i]+" ";
        }
        String strPMedia=String.format("%,.2f\n", pMedia());
        String mostrar="Dorsal: "+dorsal+" Nombre: "+nombre+" Puntos: "+puntuaciones+" Media: "+strPMedia;
        return mostrar;
    }
}



