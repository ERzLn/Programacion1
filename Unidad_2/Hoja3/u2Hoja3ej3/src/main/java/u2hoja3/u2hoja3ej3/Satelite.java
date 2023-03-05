/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2hoja3.u2hoja3ej3;

/**
 *
 * @author xboxr
 */
public class Satelite {
    public int meridiano, paralelo, distTierra;
    public Satelite(){
        
    }
    public Satelite(int meridiano, int paralelo, int distTierra){
      this.meridiano=meridiano;
      this.paralelo=paralelo;
      this.distTierra=distTierra;
    

    }
    
    public void printPosicion(){
        System.out.println("Posicion meridiano: "+meridiano+" Posicion paralelo: " +paralelo);
             
    
}
    public int variarDist(int variaDist){
        distTierra+=variaDist;
        return distTierra;
    }
    public void variarPos(int paralelo, int meridiano){
        this.paralelo=paralelo;
        this.meridiano=meridiano;      
        
    }
    public boolean enOrbita(){
        boolean enOrbita=distTierra>=16000;
        
         return enOrbita;
    }
}