/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja2.repaso1;

import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Repaso1 {

    public static void main(String[] args) {
        int numAleatorio=(int)(Math.floor(Math.random()*100+1));
        for(int i=1;i<=10;i++){
            System.out.println("Introduce el numero que crees que es:");
            Scanner entrada=new Scanner(System.in);
            int escogido=entrada.nextInt();
            if(escogido==numAleatorio){
                System.out.println("Enhorabuena, has acertado!! en "+i+" intentos");
                i=10;
            }
            else if (i==10)System.out.println("Te has quedado sin intentos. El numero era: "+numAleatorio);
            else if(escogido<numAleatorio){
                System.out.println(escogido+" es menor que el numero a adivinar. Te quedan "+ (10-i)+" intentos");
                            }
            else if(escogido>numAleatorio){
                System.out.println(escogido+" es mayor que el numero a adivinar. Te quedan "+ (10-i)+" intentos");
            }
            
        }
    }
}
