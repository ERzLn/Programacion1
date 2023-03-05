/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja1.u4hoja1ej2;

/**
 *
 * @author DAW122
 */
public class U4Hoja1Ej2 {

    public static void main(String[] args) {
        double tempAvg=0;
        int i=0;
        double []temp={10.5,22,14.5,24.2,12,6,29.5,17.4,13.3,7.5};
        for(i=0;i<temp.length;i++){
            tempAvg+=temp[i];
            
        }
        tempAvg=tempAvg/i;
        System.out.printf("La temperatura media es de: %,.2fºC",tempAvg);
    }
}
