/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author luis_
 */
public class HogarFactory extends ServicioFactory {
    private final boolean esApartamento;

    public HogarFactory(String direccionCliente,
                        double duracionHoras,
                        double tarifaHora,
                        boolean incluyeMateriales,
                        String nombreCliente,
                        boolean esApartamento) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.esApartamento = esApartamento;
    }

    @Override
    public ServicioLimpieza darServicio() {
        return new ServicioHogar(esApartamento,
                                 direccionCliente,
                                 duracionHoras,
                                 tarifaHora,
                                 incluyeMateriales,
                                 nombreCliente);
    }
}
