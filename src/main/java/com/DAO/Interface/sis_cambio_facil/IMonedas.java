/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.DAO.Interface.sis_cambio_facil;

import com.model.sis_cambio_facil.MonedaModel;
import java.util.List;

/**
 *
 * @author INTEL
 */
public interface IMonedas {
    public boolean agregarMoneda(MonedaModel u);
     public List<MonedaModel>  listarUsuario();
    
}
