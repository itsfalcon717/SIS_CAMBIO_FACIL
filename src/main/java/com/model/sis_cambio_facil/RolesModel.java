/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model.sis_cambio_facil;

/**
 *
 * @author INTEL
 */
public class RolesModel {
     private String nombre;
    private int valor;

    public RolesModel(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return nombre; // Mostrar solo el nombre en el JComboBox
    }
}
