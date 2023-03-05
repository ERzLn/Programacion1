/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas.fechashoja1ej1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Eloy
 */
public class Letra {
    // Atributos de la clase

    private int numLetra;
    private String titular;
    private double importe;
    private LocalDate fechaVencimiento;

    // Constructor
    public Letra() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de la letra: ");
        this.numLetra = entrada.nextInt();
        System.out.print("Ingrese el titular de la letra: ");
        this.titular = entrada.next();
        System.out.print("Ingrese el importe de la letra: ");
        this.importe = entrada.nextDouble();
        System.out.print("Ingrese el año de vencimiento: ");
        int anio = entrada.nextInt();
        System.out.println("Introduce el mes de vencimiento: ");
        int mes = entrada.nextInt();
        System.out.println("Introduce dia de vencimiento: ");
        int dia = entrada.nextInt();
        this.fechaVencimiento = LocalDate.of(anio, mes, dia);
    }

    // Método que devuelve verdadero si la letra ha vencido y falso en caso contrario
    public boolean vencida() {
        LocalDate hoy = LocalDate.now();
        return this.fechaVencimiento.isBefore(hoy);
    }
    // Método que alarga en x días la fecha de una letra

    public void demora(int dias) {
        this.fechaVencimiento = this.fechaVencimiento.plusDays(dias);
    }
    // Método que devuelve el número de días que faltan para que una letra venza

    public int diasFaltan() {
        LocalDate hoy = LocalDate.now();
        int diasFaltan = (int) ChronoUnit.DAYS.between(hoy, fechaVencimiento);
        return diasFaltan;
    }
    // Método que visualiza los datos de una letra

    public void mostrar() {
        System.out.println("Número de letra: " + this.numLetra);
        System.out.println("Titular: " + this.titular);
        System.out.println("Importe: " + this.importe);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Fecha de vencimiento: " + fechaVencimiento.format(f));
        if (!vencida()) {
            System.out.println("Dias para que venza: " + diasFaltan());
        }
    }
    // Método que devuelve el mes de la letra

    public String devuelveMes() {
        DateTimeFormatter formatoMes = DateTimeFormatter.ofPattern("MMMM");
        formatoMes.withLocale(new Locale("es", "ES"));
        return fechaVencimiento.format(formatoMes);
    }

    public String getTitular() {
        return this.titular;
    }
}
