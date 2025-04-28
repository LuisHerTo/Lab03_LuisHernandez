/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author luis_
 */
public class OficinaFactory extends ServicioFactory {
    private final int cantidadEmpleados;

    public OficinaFactory(String direccionCliente,
                          double duracionHoras,
                          double tarifaHora,
                          boolean incluyeMateriales,
                          String nombreCliente,
                          int cantidadEmpleados) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public ServicioLimpieza darServicio() {
        return new ServicioOficina(cantidadEmpleados,
                                   direccionCliente,
                                   duracionHoras,
                                   tarifaHora,
                                   incluyeMateriales,
                                   nombreCliente);
    }
}
