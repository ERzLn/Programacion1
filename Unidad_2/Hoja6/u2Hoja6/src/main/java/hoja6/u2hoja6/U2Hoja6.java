/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja6.u2hoja6;

/**
 *
 * @author DAW122
 */
public class U2Hoja6 {

    public static void main(String[] args) {
        Taller taller1 = new Taller(230, 100);
        Taller t = new Taller(taller1);
        
        taller1.addAceite(0);
        taller1.addRuedas(0);
        
        System.out.println("Ruedas disponibles: "+taller1.getRuedas());
        System.out.println("Aceite disponible: "+taller1.getAceite());
        
        System.out.println("Cambios completos: "+taller1.getCambiosCompletos());
        System.out.println("Cambios parciales: "+taller1.getCambiosParciales());
        
        taller1.cambioCompleto();
        taller1.cambioParcial();
        
        System.out.println("Ruedas disponibles: "+taller1.getRuedas());
        System.out.println("Aceite disponible: "+taller1.getAceite());
        System.out.println("Cambios completos: "+taller1.getCambiosCompletos());
       System.out.println("Cambios parciales: "+taller1.getCambiosParciales());

        System.out.println("\n" + taller1.toString());
        System.out.println("Taller 2: "+t.getCambiosCompletos());
        
                   
        }
    }

