/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.DAO.Interface.sis_cambio_facil;

import com.model.sis_cambio_facil.UsuarioModel;
import java.util.List;

/**
 *
 * @author INTEL
 */
public interface IUsuario {
    public boolean agregarUsuario(UsuarioModel u);

    public String eliminarUsuario(int id);

    public boolean actualizarUsuario(int id, UsuarioModel u);

    public List<UsuarioModel>  listarUsuario();

    public boolean validarUsuario(String email,String pass);
    
}
