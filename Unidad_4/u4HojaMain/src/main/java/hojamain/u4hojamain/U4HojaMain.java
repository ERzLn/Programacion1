/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hojamain.u4hojamain;

/**
 *
 * @author DAW122
 */
public class U4HojaMain {

    public static void main(String[] args) {
           String Snumero=args[0];
           int numero=Integer.parseInt(args[0]);
           String a=args[0].substring(0, 1);
           String b=args[0].substring(1, 2);
           String c=args[0].substring(2, 3);
           int numA=Integer.parseInt(a);
           int numB=Integer.parseInt(b);
           int numC=Integer.parseInt(c);
           int potencia= (int) (Math.pow(numA, Snumero.length())+Math.pow(numB, Snumero.length())+Math.pow(numC, Snumero.length()));
           if(potencia==numero)System.out.println("El numero "+ numero+ " es un numero Armstrong");
           else System.out.println("No es un numero Armstrong");
           
    }
   
}
