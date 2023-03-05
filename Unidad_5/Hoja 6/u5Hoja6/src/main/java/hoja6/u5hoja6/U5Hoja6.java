/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja6.u5hoja6;

/**
 *
 * @author Eloy
 */
public class U5Hoja6 {

    public static void main(String[] args) {
        DeDos prueba=new DeDos();
        System.out.println("Los 5 primeros elementos son: \n");
        for (int i = 0; i < 5; i++) {
            prueba.getSiguiente();   
}
        prueba.reiniciar();
        System.out.println("Los 5 primeros elementos despues de reiniciar son: \n");
        for (int i = 0; i < 5; i++) {
            prueba.getSiguiente();    
}
        prueba.setComenzar(100);
        System.out.println("Los 5 primeros valores DeDos empezando en 100 son: \n");
        for (int i = 0; i < 5; i++) {
            prueba.getSiguiente();    
}
        
    }
}
