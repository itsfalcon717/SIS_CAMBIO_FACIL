/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Service.sis_cambio_facil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://82.197.82.61:3306/u304302561_cambiofacil";
    private static final String USER = "u304302561_admin";
    private static final String PASSWORD = "7?WBov]iC";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa.");
        } catch (SQLException e) {
            System.out.println("Error de conexión: chan " + e.getMessage());
        }
        return connection;
    }

}
