/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio1;

/**
 *
 * @author DAW122
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        CajaAhorro cuenta1;
        cuenta1 = new CajaAhorro();
        cuenta1.depositar(100);
        
        
        System.out.println("El saldo actual es: "+ cuenta1.obtenerSaldo());
        
        cuenta1.girar(50);
        System.out.println("El saldo de su cuenta es: "+ cuenta1.obtenerSaldo()+ " Usted lleva: "+cuenta1.obtenerTransacciones()+" transacciones" );
        
        
        CajaAhorro cuenta2;
        cuenta2 =new CajaAhorro(200);
        
        System.out.println("El saldo de la Cuenta2 es: "+ cuenta2.obtenerSaldo()+" El numero de transacciones es: "+ cuenta2.obtenerTransacciones());
    }

    }

