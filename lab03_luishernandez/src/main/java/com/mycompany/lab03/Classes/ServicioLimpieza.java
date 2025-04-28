/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03.Classes;

/**
 *
 * @author luis_
 */
public abstract class ServicioLimpieza {
    private String direccionCliente;
    double duracionHoras;
    double tarifaHora;
    boolean incluyeMateriales;
    private String nombreCliente;
    
    public ServicioLimpieza(String direccionCliente,
                            double duracionHoras,
                            double tarifaHora,
                            boolean incluyeMateriales,
                            String nombreCliente) {
        this.direccionCliente   = direccionCliente;
        this.duracionHoras      = duracionHoras;
        this.tarifaHora         = tarifaHora;
        this.incluyeMateriales  = incluyeMateriales;
        this.nombreCliente      = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }
    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }
    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public boolean isIncluyeMateriales() {
        return incluyeMateriales;
    }
    public void setIncluyeMateriales(boolean incluyeMateriales) {
        this.incluyeMateriales = incluyeMateriales;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public double calcularPrecioBase() {
        return duracionHoras * tarifaHora;
    }

    public abstract double calcularPrecioFinal();

    String getDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}