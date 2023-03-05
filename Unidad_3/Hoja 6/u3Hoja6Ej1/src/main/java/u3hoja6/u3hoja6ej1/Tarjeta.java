/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3hoja6.u3hoja6ej1;

/**
 *
 * @author DAW122
 */
public class Tarjeta {

    private String nombre, numeroCuenta,descripcion;
    private int clave;    
    boolean tarjeta;    
    private double propinaImp, importe, totCompra, saldo;
    
    public Tarjeta(String nombre, String numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.clave = 1 + (int) (Math.random() * 9999);
        this.tarjeta = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    public boolean desbloquea(int pin) {
        if (pin == clave) {
            tarjeta = true;
        } else {
            tarjeta = false;
        }
        return tarjeta;
    }

    public void pagar(double importe, int pin, String descripcion, boolean propina) {
        this.importe = importe;
        this.descripcion = descripcion;
        if (tarjeta = false) {
            System.out.println("Tarjeta bloqueada");
        } else if (tarjeta = true) {
            if (pin == clave) {
                if (propina && importe * 0.05 <= saldo) {
                    totCompra = importe + (importe * 0.05);                    
                    propinaImp = (double) (importe * 0.05);
                    saldo -= totCompra;
                    System.out.println("Compra con propina realizada.\n Su saldo es de :" + saldo+"€");
                    this.imprimirTicket();
                    
                } else if (!propina && importe <= saldo) {
                    saldo -= importe;
                    System.out.println("Compra sin propina realizada (tacaño). Su saldo actual es de: " + saldo+"€");
                    totCompra=importe;
                    this.imprimirTicket();

                }
            } else {
                System.out.println("El pin es incorrecto");
            }
        }

    }

    private void imprimirTicket() {
        String numAst="";
        for(int i=1;i<=numeroCuenta.length()-4;i++){
            numAst=numAst+"*";
        }

        System.out.println(" Nombre: " + nombre + 
                "\n Numero cuenta: " + numeroCuenta.substring(0, 4) + numAst+
                "\n Descripcion: " + descripcion.substring(0, 9) + 
                "\n Precio compra: " + importe + 
                "€\n Propina: " + propinaImp + 
                "€\n Total cobrado: " + totCompra + "€");

    }
}
