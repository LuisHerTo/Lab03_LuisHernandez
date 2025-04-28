/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author luis_
 */
public abstract class ServicioAdicional extends ServicioLimpieza {
    protected final ServicioLimpieza servicioBase;

    public ServicioAdicional(ServicioLimpieza servicioBase) {
        super(
            servicioBase.getDireccionCliente(),
            servicioBase.getDuracionHoras(),
            servicioBase.getTarifaHora(),
            servicioBase.isIncluyeMateriales(),
            servicioBase.getNombreCliente()
        );
        this.servicioBase = servicioBase;
    }

    @Override
    public double calcularPrecioFinal() {
        // Por defecto delega al servicio base; las subclases sumarán su cargo
        return servicioBase.calcularPrecioFinal();
    }
}

