/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author luis_
 */
public class ServicioIndustrial extends ServicioLimpieza{
    
    private final double multiplicadorRiesgo ; 

    public ServicioIndustrial(double multiplicadorRiesgo, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.multiplicadorRiesgo = multiplicadorRiesgo;
    }

    @Override
    public double calcularPrecioFinal() {
        if (!incluyeMateriales){
            throw new IllegalArgumentException("Los servicios industriales requieren materiales");
        }
        
        return calcularPrecioBase() * multiplicadorRiesgo ;
    }
    
    
} 
