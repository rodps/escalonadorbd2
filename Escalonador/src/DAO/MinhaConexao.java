/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas abreu
 */
public class MinhaConexao {
    static String host = "localhost";
    static String port = "5432";
    static String nomeBancoDados = "jensen2";
    String urlConnection;
    private static String user = "postgres";
    private static String password = "1234";

        public MinhaConexao() {
            this.urlConnection = "jdbc:postgresql://" + host + ":" + port + "/" + nomeBancoDados;
        }
        
        public Connection getConexao() {
            try {
                return DriverManager.getConnection(urlConnection, user, password);
            }catch (SQLException ex) {
                Logger.getLogger(MinhaConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
           return null;
        }
        
        public void releaseAll(ResultSet rs, Statement stmt, Connection conn) {
            try {
                stmt.close();
                rs.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }   


