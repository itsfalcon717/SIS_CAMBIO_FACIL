/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Service.sis_cambio_facil;

import com.DAO.Interface.sis_cambio_facil.IUsuario;
import com.model.sis_cambio_facil.UsuarioModel;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INTEL
 */
public class UsuarioService implements IUsuario {

    @Override
    public boolean agregarUsuario(UsuarioModel u) {
        ConexionBD con = new ConexionBD();
        PreparedStatement preSta;
        try {

            String sql = "INSERT INTO usuarios(nombre,email,password,rol) values(?,?,?,?)";
            preSta = con.getConnection().prepareStatement(sql);
            preSta.setString(1, u.getNombre());
            preSta.setString(2, u.getEmail());
            preSta.setString(3, u.getPassword());
            preSta.setString(4, u.getRol());
            preSta.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return false;
    }

    @Override
    public String eliminarUsuario(int id) {
        ConexionBD con = new ConexionBD();
        PreparedStatement preSta;
        try {
            String sql = "DELETE FROM usuarios where id=?";
            preSta = con.getConnection().prepareStatement(sql);
            preSta.setInt(1, id);
            preSta.executeUpdate();
            return "Eliminado";
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return "No fue Eliminado el usuario con Id: " + id;
    }

    @Override
    public boolean actualizarUsuario(int id, UsuarioModel u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<UsuarioModel> listarUsuario() {
        List<UsuarioModel> listaUsuarios = new ArrayList<>();
        ConexionBD con = new ConexionBD();
        Statement stmt;
        try {
            stmt = con.getConnection().createStatement();
            String sql = "SELECT * FROM usuarios";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) { // Itera sobre el ResultSet
                int usuarioId = rs.getInt("id"); // Obtén el ID del usuario
                String nombre = rs.getString("nombre"); // Obtén el nombre
                String email = rs.getString("email"); // Obtén el nombre
                String password = rs.getString("password"); // Obtén el password
                String rol = rs.getString("rol"); // Obtén el password
                // Crea un nuevo UsuarioModel y añádelo a la lista
                UsuarioModel usuario = new UsuarioModel(usuarioId, nombre, email, password, rol);
                listaUsuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return listaUsuarios; // Retorna la lista de usuarios
    }

    @Override
    public boolean validarUsuario(String nombre, String pass) {
        ConexionBD con = new ConexionBD();
        try {
            Statement stmt = con.getConnection().createStatement();
            String sql = "SELECT * FROM usuarios where nombre='" + nombre + "' and password='" + pass + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

}
