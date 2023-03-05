/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.u5hoja5ej3;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DAW122
 */
public class Contacto {
    private String nombre, apellidos, telefonoMovil, email;
    private LocalDate fechaNacimiento;

    public Contacto() {
        System.out.println("Introduce nombre del contacto: ");
        nombre=new Scanner(System.in).nextLine();
        System.out.println("Introduce apellidos: ");
        apellidos=new Scanner(System.in).nextLine();
        System.out.println("Numero de telefono:");
        telefonoMovil:new Scanner(System.in).nextLine();
        System.out.println("Email: ");
        email=new Scanner(System.in).nextLine();
        System.out.println("Introduce fecha nacimiento:(yyyy-MM-dddd) ");
        LocalDate fecha=LocalDate.of(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd' de' MMMM ' de ' yyyy").withLocale(new Locale("es", "ES"));
        fechaNacimiento=fecha.format(formato)
        
    }
}
