/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u2hoja4.u2hoja4ej2;

/**
 *
 * @author Eloy
 */
public class U2Hoja4ej2 {

    public static void main(String[] args) {
        Coche coche1=new Coche("1234RET",20 );
        Coche coche2=new Coche ("4567KKK");
        
        coche1.dameMatriculayVelocidad();
        coche2.frena(10);
        coche1.acelera(80);
        
        coche1.dameMatriculayVelocidad();
        coche2.dameMatriculayVelocidad();
        System.out.println("Las letras de la matricula son: "+coche2.dameLetrasMatricula());
        
        
    }
}
