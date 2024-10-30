/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Service.sis_cambio_facil;

import com.DAO.Interface.sis_cambio_facil.IMonedas;
import com.model.sis_cambio_facil.MonedaModel;
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
public class MonedaService implements IMonedas {

    @Override
    public List<MonedaModel> listarMoneda() {
        List<MonedaModel> listaMonedas = new ArrayList<>();
        ConexionBD con = new ConexionBD();
        Statement stmt;
        try {
            stmt = con.getConnection().createStatement();
            String sql = "SELECT * FROM monedas";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) { // Itera sobre el ResultSet
                int monedaId = rs.getInt("id");               // Obtén el ID de la moneda
                String moneda = rs.getString("moneda");       // Obtén el nombre de la moneda
                String abreviatura = rs.getString("abreviatura"); // Obtén la abreviatura
                boolean activo = rs.getBoolean("activo");     // Obtén el valor booleano para "activo"
                boolean es_default = rs.getBoolean("es_default"); // Obtén el valor booleano para "es_default"
                String imagen = rs.getString("imagen");       // Obtén la imagen (ruta o URL)

                // Crea un nuevo MonedaModel y añádelo a la lista
                MonedaModel monedaModel = new MonedaModel(monedaId, moneda, abreviatura, activo, es_default, imagen);
                listaMonedas.add(monedaModel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return listaMonedas; // Retorna la lista de usuarios
    }

    @Override
    public boolean agregarMoneda(MonedaModel u) {
        ConexionBD con = new ConexionBD();
        PreparedStatement preSta;
        try {

            String sql = "INSERT INTO monedas(moneda,abreviatura,activo,es_default,imagen) values(?,?,?,?,?)";
            preSta = con.getConnection().prepareStatement(sql);
            preSta.setString(1, u.getMoneda());
            preSta.setString(2, u.getAbreviatura());
            preSta.setBoolean(3, u.isActivo());
            preSta.setBoolean(4, u.isEs_default());
            preSta.setString(5, u.getImagen());
            preSta.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return false;
    }

}
