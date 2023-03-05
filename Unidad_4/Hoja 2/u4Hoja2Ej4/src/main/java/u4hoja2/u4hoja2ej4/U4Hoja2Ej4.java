/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u4hoja2.u4hoja2ej4;

/**
 *
 * @author Eloy
 */
public class U4Hoja2Ej4 {

    public static void main(String[] args) {
        Alumno al=new Alumno("Jose Luis");
        System.out.printf("La mayor nota es: %,.2f\n",al.mayor());
        System.out.printf("La menor nota es: %,.2f\n",al.menor());
        System.out.println(al.mostrar());
                
    }
}
