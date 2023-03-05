/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja1.u4hoja1ej1;

/**
 *
 * @author DAW122
 */
public class U4Hoja1Ej1 {

    public static void main(String[] args) {
        int[] ar={-2,-2,-2,-2,-2,-2,-2,-2,-2,-2};
        for(int i=0;i<ar.length;i++){
          ar[i]+=1;          
            System.out.println("Para la posicion "+i+ " el valor es "+ar[i]);
        }
        for(int i=0;i<ar.length;i++){
            int n=-100;
            int m=100;
            ar[i]=(int)Math.floor(Math.random()*(m-n+1))+n;
            System.out.println("Para la posicion "+i+ " el valor es "+ar[i]);
        }
        
        
    }
}
