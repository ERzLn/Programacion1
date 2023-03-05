/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.u5hoja9ej2;

/**
 *
 * @author DAW122
 */
public class U5Hoja9Ej2 {

    public static void main(String[] args) {
        try {
            Prueba pru=new Prueba();
            pru=null;
            pru.getString();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("El objeto es nulo");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
