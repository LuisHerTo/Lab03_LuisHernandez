/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author luis_
 */
public class IndustrialFactory extends ServicioFactory {
    private final double multiplicadorRiesgo;

    public IndustrialFactory(String direccionCliente,
                             double duracionHoras,
                             double tarifaHora,
                             boolean incluyeMateriales,
                             String nombreCliente,
                             double multiplicadorRiesgo) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.multiplicadorRiesgo = multiplicadorRiesgo;
    }

    @Override
    public ServicioLimpieza darServicio() {
        return new ServicioIndustrial(multiplicadorRiesgo,
                                      direccionCliente,
                                      duracionHoras,
                                      tarifaHora,
                                      incluyeMateriales,
                                      nombreCliente);
    }
}
