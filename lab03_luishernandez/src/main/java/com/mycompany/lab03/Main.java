/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab03;

/**
 *
 * @author luis_
 */
import com.mycompany.lab03.Classes.*;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 01: Crear e imprimir el precio final de un ServicioHogar, ServicioOficina y ServicioIndustrial.
        ServicioLimpieza hogar = new ServicioHogar(
            false,
            "Av. Siempre Viva 123",
            2.0,
            50.0,
            true,
            "María"
        );
        System.out.println("ServicioHogar precio final: S/" + hogar.calcularPrecioFinal());

        ServicioLimpieza oficina = new ServicioOficina(
            5,
            "Jr. Principal 456",
            3.0,
            40.0,
            true,
            "OfiCorp"
        );
        System.out.println("ServicioOficina precio final: S/" + oficina.calcularPrecioFinal());

        ServicioLimpieza industrial = new ServicioIndustrial(
            1.5,
            "Zona Ind 789",
            4.0,
            60.0,
            true,
            "Indus S.A."
        );
        System.out.println("ServicioIndustrial precio final: S/" + industrial.calcularPrecioFinal());

        System.out.println();

        // Ejercicio 02: Aplicar e imprimir al menos dos descuentos (ClienteFrecuente, Campaña) sobre un servicio.
        double baseHogar = hogar.calcularPrecioFinal();
        Descuento descFrecuente = new DescuentoClienteFrecuente(0.10);
        System.out.println("Descuento ClienteFrecuente (10%) sobre Hogar: S/" +
            descFrecuente.aplicarDescuento(baseHogar));

        Descuento descCampania = new DescuentoCampania(20.0);
        System.out.println("Descuento Campaña (S/20) sobre Hogar: S/" +
            descCampania.aplicarDescuento(baseHogar));

    }
}