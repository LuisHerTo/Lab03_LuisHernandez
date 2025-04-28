/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author luis_
 */
public class ServicioOficina extends ServicioLimpieza {
    
    private final int cantidadEmpleados;

    public ServicioOficina(int cantidadEmpleados, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public double calcularPrecioFinal() {
        
        double duracionTotal = duracionHoras + (cantidadEmpleados * 0.1);
        double base = duracionTotal * tarifaHora;
        return base *1.18;
        
    }
}
