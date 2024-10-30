/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model.sis_cambio_facil;

/**
 *
 * @author INTEL
 */
public class MonedaModel {
    private int id; // Nuevo campo para el ID
    private String moneda;
    private String abreviatura;
    private boolean activo;
    private boolean es_default;
    private String imagen;

    public MonedaModel(int id, String moneda, String abreviatura, boolean activo, boolean es_default, String imagen) {
        this.id = id;
        this.moneda = moneda;
        this.abreviatura = abreviatura;
        this.activo = activo;
        this.es_default = es_default;
        this.imagen = imagen;
    }
  public MonedaModel(String moneda, String abreviatura, boolean activo, boolean es_default) {
        this.moneda = moneda;
        this.abreviatura = abreviatura;
        this.activo = activo;
        this.es_default = es_default;
       // this.imagen = imagen;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isEs_default() {
        return es_default;
    }

    public void setEs_default(boolean es_default) {
        this.es_default = es_default;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
