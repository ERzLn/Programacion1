/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.u2hoja6;

/**
 *
 * @author DAW122
 */
public class Taller {

    private int aceite, ruedas, contadorCambiosTotales, contadorCambiosParciales;

    public Taller(int aceite, int ruedas) {
        this.aceite = aceite * 5;
        this.ruedas = ruedas;
        contadorCambiosTotales = 0;
        contadorCambiosParciales = 0;
    }
    public Taller(Taller t) {
        this.aceite = t.aceite;
        this.ruedas = t.ruedas;
        contadorCambiosTotales = t.contadorCambiosParciales;
        contadorCambiosParciales = t.contadorCambiosTotales;
    }

    public void addAceite(int aceite) {
        this.aceite += aceite;
    }

    public void addRuedas(int ruedas) {
        this.ruedas += ruedas;
    }

    public int getCambiosCompletos() {
        int divAceite = aceite / 3;
        int divRuedas = ruedas / 4;
        int cambiosTotales = (divAceite <= divRuedas) ? divAceite : divRuedas;
        return cambiosTotales;
    }

    public int getCambiosParciales() {
        int divRuedas2 = ruedas / 2;
        int divAceite = aceite / 3;

        int CambiosParciales = (divAceite <= divRuedas2) ? divAceite : divRuedas2;
        return CambiosParciales;
    }

    public void cambioCompleto() {
        aceite -= 3;
        ruedas -= 4;
        contadorCambiosTotales += 1;
        /*       public boolean cambioCompleto(){
         boolean aux=(getCambiosTotales()>0);
         ruedas-=aux? 4:0;
         aceite-=aux? 3:0;
         contadorCambiosTotales+=aux?1:0;   ----ESTO NO LO PIDE----IMPORTANTE EXAMEN*/

 /*if (getCambiosCompletos()>0{
      ruedas-=4
      aceite-=3;
      contadorCambiosTotales++    ----ESTO SERIA LO CORRECTO----*/
    }

    public void cambioParcial() {
        aceite -= 3;
        ruedas -= 2;
        contadorCambiosParciales += 1;
        /*if (getCambiosParciales()>0{
      ruedas-=2;
      aceite-=3;
      contadorCambiosTotales++    ----ESTO SERIA LO CORRECTO----*/
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getAceite() {
        return aceite;
    }

    public String toString() {
        double precioAceite1 = 5;
        double precioRuedas1 = 60;
        double precioAceite2 = 4.5;
        double precioRuedas2 = 50;

        double ingresosParciales = (contadorCambiosParciales * precioAceite1) + (contadorCambiosParciales * precioRuedas1);
        double ingresosCompletos = (contadorCambiosTotales * precioAceite2) + (contadorCambiosTotales * precioRuedas2);
        double totalIngresos = ingresosParciales + ingresosCompletos;
        return String.format("TALLER:\n EXISTENCIAS:\n    Ruedas:%d unidades\n    Aceite:%d litros\nINGRESOS:TOTAL:%.2f€\n",
                ruedas, aceite, totalIngresos);

    }

    
    }

