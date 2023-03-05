/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.u5hoja9ej1;


/**
 *
 * @author DAW122
 */
public class U5Hoja9Ej1 {

    public static void main(String[] args) {
        
        try{            
            throw new Exception("Este es el argumento String 1");
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("fin del programa");
        }
    }
}
