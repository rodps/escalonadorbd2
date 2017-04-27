/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Douglas abreu
 */
public class Operacao {
    private int idoperacao;
    private int indicetransacao;
    private String operacao;

    public Operacao(int idoperacao, int indicetransacao, String operacao, String itemdado, String timestampj) {
        this.idoperacao = idoperacao;
        this.indicetransacao = indicetransacao;
        this.operacao = operacao;
        this.itemdado = itemdado;
        this.timestampj = timestampj;
    }
    private String itemdado;
    private String timestampj;
    
    public void setIdoperacao(int idoperacao) {
        this.idoperacao = idoperacao;
    }

    public void setIndicetransacao(int indicetransacao) {
        this.indicetransacao = indicetransacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setItemdado(String itemdado) {
        this.itemdado = itemdado;
    }

    public void setTimestampj(String timestampj) {
        this.timestampj = timestampj;
    }

    
    public int getIdoperacao() {
        return idoperacao;
    }

    public int getIndicetransacao() {
        return indicetransacao;
    }

    public String getOperacao() {
        return operacao;
    }

    public String getItemdado() {
        return itemdado;
    }

    public String getTimestampj() {
        return timestampj;
    }

    
    
    
}
