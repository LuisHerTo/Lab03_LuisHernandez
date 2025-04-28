/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author luis_
 */
public class DescuentoCampania implements Descuento {
    private final double montoFijo;

    public DescuentoCampania(double montoFijo) {
        this.montoFijo = montoFijo;
    }
    @Override
    public double aplicarDescuento(double monto) {
        double resultado = monto - montoFijo;
        return (resultado < 0) ? 0 : resultado;
    }
}