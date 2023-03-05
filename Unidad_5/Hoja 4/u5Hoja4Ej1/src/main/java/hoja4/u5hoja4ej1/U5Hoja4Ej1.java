/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja4.u5hoja4ej1;

import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class U5Hoja4Ej1 {

    public static void main(String[] args) {
        Publicacion[] publicaciones = new Publicacion[2];
        for (int i = 0; i < publicaciones.length; i++) {
            System.out.println("Que publicacion quieres insertar? \n -- 1)Libro \n -- 2)Disco ");
            int opcion = new Scanner(System.in).nextInt();
            if (opcion != 1 && opcion != 2) {
                System.out.println("Opcion invalida");

            } else if (opcion == 1) {
                System.out.println("Introduce el titulo del libro");
                String titulo = new Scanner(System.in).nextLine();
                System.out.println("Introduce el autor:");
                String autor = new Scanner(System.in).nextLine();
                System.out.println("Introduce dia de publicacion");
                int dia = new Scanner(System.in).nextInt();
                System.out.println("Introduce mes:");
                int mes = new Scanner(System.in).nextInt();
                System.out.println("Introduce el año:");
                int anio = new Scanner(System.in).nextInt();
                publicaciones[i] = new Libro(titulo, autor, dia, mes, anio);
            } else if (opcion == 2) {
                System.out.println("Introduce el titulo del Disco");
                String titulo = new Scanner(System.in).nextLine();
                System.out.println("Introduce el autor:");
                String autor = new Scanner(System.in).nextLine();
                System.out.println("Introduce dia de publicacion");
                int dia = new Scanner(System.in).nextInt();
                System.out.println("Introduce mes:");
                int mes = new Scanner(System.in).nextInt();
                System.out.println("Introduce el año:");
                int anio = new Scanner(System.in).nextInt();
                System.out.println("Duracion (en minutos):");
                int duracionMinutos = new Scanner(System.in).nextInt();
                publicaciones[i] = new Disco(duracionMinutos, titulo, autor, dia, mes, anio);
            }
        }
        String datos = "";
        for (int i = 0; i < publicaciones.length; i++) {
            datos += publicaciones[i].toString() + " ";
        }
        System.out.println("DATOS DE LAS PUBLICACIONES:\n" + datos);

        for (int i = 0; i < publicaciones.length ; i++) {
            if (publicaciones[i] instanceof Disco) {
                Disco duracionMayor =  (Disco) publicaciones[0];
                Disco aux2 = (Disco) publicaciones[i];
                if (duracionMayor.getDuracionMinutos() < aux2.getDuracionMinutos()) {
                    duracionMayor = aux2;

                }
                if (i == (publicaciones.length - 1)&&duracionMayor.titulo.length()>=3) {
                    System.out.println("El disco mas largo es:\n " + duracionMayor.toString());
                    System.out.println("3 primeras letra y autor: " + duracionMayor.titulo.substring(0, 3) + " " + duracionMayor.autor);
                }
            }

        }
    }
}
