/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2hoja9.u2hoja9ej1;

/**
 *
 * @author Eloy
 */
public class Alarma {

    private double temperatura;
    private boolean timbre;

    public Alarma(double temperatura) {
        this.temperatura = temperatura;
        
        timbre = false;
    }
    public boolean isTimbre() {
        return timbre;
    }

    public void setTimbre(boolean timbre) {
        this.timbre = timbre;
    }

    public void comprueba() {
        if (temperatura >= 35 || temperatura <= 10) {
            timbre = true;
        }
    }

    
    public void normaliza(){
        temperatura=25;
        timbre=false;
    }
    public void estado(){
        System.out.println("La temperatura actual es: "+temperatura+"ºC Y la alarma esta puesta?: "+timbre);
    }
}
