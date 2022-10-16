/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author karly
 */
public class Empleado {

    public String nombre;
    public double costoHora;
    public int yearIngreso;
    public int horasTrabajadas;

    public String mostrarInfo() {
        var retorno = "El empleado se llama " + this.nombre + ", ingreso en el año " + this.yearIngreso
                + ", el costo por hora es de: " + this.costoHora + "$, al mes a trabajado " + this.horasTrabajadas + " horas";
        return retorno;
    }

    public double getSueldoBasico() {
        var retorno = 0.0d;
        retorno = this.costoHora * this.horasTrabajadas;
        return retorno;
    }

    public double getBonoantiguedad(int anioActual) {
        var retorno = 0.0d;
        retorno = (anioActual - this.yearIngreso) * (0.2 * this.costoHora);
        return retorno;
    }

    public double getBonoHorasExtras() {
        var retorno = 0.0d;
        if (this.horasTrabajadas > 160) {
            retorno = (this.horasTrabajadas - 160) * (2 * this.costoHora);
        }
        return retorno;
    }

    public double getSueldo() {
        var retorno = 0.0d;
        retorno = this.getSueldoBasico() + this.getBonoHorasExtras() + this.getBonoantiguedad(2022);
        return retorno;
    }

    public double getSueldoTotal() {
        var retorno = 0.0d;
        retorno = this.getSueldo() - this.getCalcularImpuesto(100,200,300);
        return retorno;
    }

   

    public double getCalcularImpuesto(int limite1, int limite2, int limite3) {

        var retorno = 0.0d;
        if (this.getSueldoBasico() > 0 && this.getSueldoBasico() <= limite1) {
            retorno = 0;
        } else {
            if (this.getSueldoBasico() > limite1 && this.getSueldoBasico() <= limite2) {
                retorno = this.getSueldoBasico() * 0.05;
            } else {
                if (this.getSueldoBasico() > limite2 && this.getSueldoBasico() <= limite3) {
                    retorno = this.getSueldoBasico() * 0.12;
                } else {
                    if (this.getSueldoBasico() > limite3) {
                        retorno = this.getSueldoBasico() * 0.25;
                    }
                }
            }
        }
        return retorno;
    }

}
