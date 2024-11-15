/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

      private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "bd_parqueadero";
    private static Integer portnumber = 3306;
    private static String password = "12345678";

    public static Connection getConnection() {

        Connection cnx = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setUseSSL(false);  // Desactiva SSL

        try {
            cnx = datasource.getConnection();
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error de conexión", ex);
        }

        return cnx;
    }
}

