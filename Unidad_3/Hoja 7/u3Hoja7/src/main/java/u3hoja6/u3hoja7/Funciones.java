/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja6.u3hoja7;

/**
 *
 * @author DAW122
 */
public class Funciones {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else return n*factorial(n-1);
        
    }
    public static int sumaSusnumeros(int n){
        if(n==1)return 1;
        else return n+(sumaSusnumeros(n-1));
    }
    public static void imprimeNumeros(int n){
    if(n>0){
        
        imprimeNumeros(n-1);
        System.out.println(n);}
            
        
    }
    public static int numeroDigitos(int numero){
        if(numero<= 0){
            return 0;   
        }
        return 1+ numeroDigitos(numero/10);
    }
    public static int potencia(int base, int exp) {
        if(exp==0) {
            return 1;
        }else if (exp==1) {
            return base;
        }else{
            return base * potencia(base,exp -1);
        }
    }
    
}
