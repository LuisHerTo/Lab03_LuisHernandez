/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author luis_
 */
public class ConLimpiezaVidrios extends ServicioAdicional {

    private static final double COSTO = 10.00;

    public ConLimpiezaVidrios(ServicioLimpieza servicioBase) {
        super(servicioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() + COSTO;
    }
}