/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2hoja5.u2hoja5;

/**
 *
 * @author Eloy
 */
public class Restaurante {
    private int docenas;
    private double kgChorizo;    
    private int huevos;
   public Restaurante (int docenas, double kgChorizo){
       this.docenas=docenas;
       this.kgChorizo=kgChorizo;
   }
   public void addDocenas (int addDocenas){
        docenas+=addDocenas;
        huevos=docenas*12;
        
   }
   public void addChorizos (double addChorizos){
       kgChorizo+=addChorizos;
   }
   public int getNumPlatos(){
       double platos = 0;
       int div1=huevos/2;
       double div2=kgChorizo/0.2;
       if (div1>=div2){
           platos=div2;
       }
       if  (div1<=div2){
       platos=div1;     
   }
       return (int)platos;
       
   }
   public void sirvePlato(){
       kgChorizo -=0.2;
       huevos -=2;
   }
   public void getHuevos(){
      
       System.out.println("La cantidad de huevos disponibles es de: "+ huevos);
   }
   public void getChorizo(){
       System.out.println("Los KG disponibles de chorizo son: "+kgChorizo);
   }
}






