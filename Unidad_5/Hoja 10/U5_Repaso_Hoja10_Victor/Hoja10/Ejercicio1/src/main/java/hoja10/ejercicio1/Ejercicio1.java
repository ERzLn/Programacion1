/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

Nos encontramos en algún momento entre los años 1.100 y 1.300 a.C. El rapto de Helena de Esparta por Paris de Troya ha desencadenado la guerra. Para vengar la ofensa, los príncipes griegos se disponen a asaltar la ciudad de Troya. El objetivo de los problemas es crear los elementos que van a tomar parte en la batalla, incluyendo el famoso caballo de Troya.
1.- En este problema se crearán la clase Guerrero y las clases derivadas Troyano y Griego.
a) Crear la clase abstracta Guerrero, que deberá poder ordenarse por la fuerza. Deberá contar con los siguientes atributos, no accesibles por ninguna otra clase:
• nombre, de tipo String, que no podrá cambiar una vez le hemos dado valor.
• edad, fuerza, de tipo int.
• herido, muerto de tipo boolean.
b) Crear dos métodos públicos, uno para acceder al atributo edad y otro para darle valor. Suponer que existen métodos equivalentes para el resto de los atributos.
c) Crear dos métodos, accesibles solamente por sus clases derivadas, static boolean comprobarEdad (int e) y static boolean comprobarFuerza (int f) que calculen si edad y fuerza están dentro de los siguientes rangos: edad entre 15 y 60 (ambos inclusive), fuerza entre 1 y 10 (ambos inclusive). Devolverán true si son correctos y false en caso contrario.
d) Crear tres constructores para la clase Guerrero:
• El primero recibirá valores para todos los atributos, excepto herido y muerto, que obviamente serán falsos. Deberá comprobar que los valores dados son válidos y en caso contrario poner como edad 25 y como fuerza 5.
• El segundo, que deberá utilizar el primero, no recibirá ningún valor y creará un guerrero cuyo nombre sea guerreroX y edad y fuerza valgan 15 y 1 respectivamente.
• El tercero, recibirá un objeto de tipo Guerrero y un nombre y creará una copia del guerrero pasado con el nuevo nombre.
e) Crear el siguiente método público y abstracto:
• boolean retirarse ()
f) Crear la clase Troyano, que hereda de Guerrero y que no tiene ningún nuevo atributo. Crear un constructor para esta clase que reciba el nombre, edad y fuerza del Troyano y utilice alguno de los constructores de la clase Guerrero.
g) Implementar los métodos necesarios para que la clase Troyano no sea abstracta, teniendo en cuenta que:
• Los troyanos no pueden retirarse.
h) Crear la clase Griego, que hereda de Guerrero y que no tiene ningún nuevo atributo. Los métodos y constructores de esta clase serán similares a los de Troyano (no hace falta repetirlos), salvo el método retirarse, ya que los griegos sí lo pueden hacer, siempre que estén heridos y, evidentemente, no estén muertos. Implementar este método.
Creamos una librería con este conjunto de clases que importaremos para hacer el ejercicio 2.
 */

package hoja10.ejercicio1;

/**
 *
 * @author Víctor Sánchez Llada
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        
        
    }
    
}
