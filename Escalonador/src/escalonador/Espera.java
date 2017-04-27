/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

/**
 *
 * @author Douglas abreu
 */
public class Espera {

    private String dadoEspera;
    private int idtransacao;
    private String operacao;

    public void setDadoEspera(String dadoEspera) {
        this.dadoEspera = dadoEspera;
    }

    public void setIdtransacao(int idtransacao) {
        this.idtransacao = idtransacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getDadoEspera() {
        return dadoEspera;
    }

    public int getIdtransacao() {
        return idtransacao;
    }

    public String getOperacao() {
        return operacao;
    }
    
    
}
