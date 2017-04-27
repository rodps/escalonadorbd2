/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import escalonador.Operacao;
import java.sql.ResultSet;
import java.sql.* ; 
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas abreu
 */
public class OperacaoSQL {
    
    private MinhaConexao conexao;
    private int max;

    public OperacaoSQL() {
 
        this.max = 0 ;
    }
    public void setMax (int max) {
    this.max = max;
    }
    public int getMax(){
    return max;
    }
    
    public ResultSet select(int max , Connection conn){
        
        try {
            Statement smt = conn.createStatement();
            String select = "Select * From schedule where idoperacao > " + max +" "; 
            ResultSet rs = smt.executeQuery(select);
            conn.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(OperacaoSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
        
    }
}