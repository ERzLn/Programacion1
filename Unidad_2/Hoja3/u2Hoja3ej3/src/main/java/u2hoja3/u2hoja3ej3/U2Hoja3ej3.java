/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u2hoja3.u2hoja3ej3;

import java.util.Scanner;

/**
 *
 * @author xboxr
 */
public class U2Hoja3ej3 {

    public static void main(String[] args) {
        Satelite s1=new Satelite();
        Satelite s2=new Satelite(170, 160, 19000);
        
        s2.printPosicion();
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca la altura positiva o negativa que quiera aplicar al Satelite 2: ");
        int x=entrada.nextInt();
    
        System.out.println("LA distancia actual despues del cambios es: "+s2.variarDist(x));
        
        System.out.println("Introduzca la posicion positiva o negativa que quiera cambiar al Satelite 2: (paralelo y meridiano) ");
        int y,z;
        y=entrada.nextInt();
        z=entrada.nextInt();
        s2.variarPos(y, z);
        s2.printPosicion();
        System.out.println("¿EL satelite está en orbita(true) o en la tierra(false)"+s2.enOrbita());
        
    }
}
