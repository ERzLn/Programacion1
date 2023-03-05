/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2hoja4.u2hoja4ej2;

/**
 *
 * @author Eloy
 */
public class Coche {
    private String matricula;
    private int velocidad;    

public Coche (String matricula, int velocidad){
        this.matricula=matricula;
        this.velocidad=velocidad;
}
public Coche (String matricula){
    this.matricula=matricula;
    velocidad=0;
}
public void acelera(int aceleracion){
    velocidad=velocidad<=120? (velocidad+aceleracion):0;
    
}
public void frena(int frenada){
    velocidad=velocidad>0? (velocidad-frenada):0;
}
public String dameLetrasMatricula(){
    matricula=matricula.substring(4);
    return matricula;
}
public void dameMatriculayVelocidad(){
     System.out.println("La matricula es: "+matricula+" y la velocidad es: "+ velocidad);
    
}
}
