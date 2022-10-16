/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author karly
 */
public class Principal {

    public static void main(String[] args) {

        var empleado1 = new Empleado();
        var empleado2 = new Empleado();
        var empleado3 = new Empleado();

        empleado1.nombre = "Fabian Salto";
        empleado1.costoHora = 30;
        empleado1.horasTrabajadas = 161;
        empleado1.yearIngreso = 2012;
        
        empleado2.nombre = "Fernanda Carpio";
        empleado2.costoHora = 25;
        empleado2.horasTrabajadas = 170;
        empleado2.yearIngreso = 2018;
        
        empleado3.nombre = "Erick Gonzalez";
        empleado3.costoHora = 40;
        empleado3.horasTrabajadas = 150;
        empleado3.yearIngreso = 2020;

        System.out.println(empleado1.mostrarInfo());
        System.out.println("El sueldo basico es:" + empleado1.getSueldoBasico() + "$, el bono por antiguedad es:"
                + empleado1.getBonoantiguedad(2022) + "$, y el bono de horas extras es:" + empleado1.getBonoHorasExtras()+"$");
        System.out.println("La suma del sueldo basico y de los bonos es: " + empleado1.getSueldo());
        System.out.println("Los impuestos que debe pagar son: " + empleado1.getCalcularImpuesto(100,200,300));
        System.out.println("Por la tanto el sueldo final es " + empleado1.getSueldoTotal());
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(empleado2.mostrarInfo());
        System.out.println("El sueldo basico es:" + empleado2.getSueldoBasico() + "$, el bono por antiguedad es:"
                + empleado2.getBonoantiguedad(2022) + "$, y el bono de horas extras es:" + empleado2.getBonoHorasExtras()+"$");
        System.out.println("La suma del sueldo basico y de los bonos es: " + empleado2.getSueldo());
        System.out.println("Los impuestos que debe pagar son: " + empleado2.getCalcularImpuesto(200,300,500));
        System.out.println("Por la tanto el sueldo final es " + empleado2.getSueldoTotal());
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(empleado3.mostrarInfo());
        System.out.println("El sueldo basico es:" + empleado3.getSueldoBasico() + "$, el bono por antiguedad es:"
                + empleado3.getBonoantiguedad(2022) + "$, y el bono de horas extras es:" + empleado3.getBonoHorasExtras()+"$");
        System.out.println("La suma del sueldo basico y de los bonos es: " + empleado3.getSueldo());
        System.out.println("Los impuestos que debe pagar son: " + empleado3.getCalcularImpuesto(400,500,700));
        System.out.println("Por la tanto el sueldo final es " + empleado3.getSueldoTotal());
        
    }
}
