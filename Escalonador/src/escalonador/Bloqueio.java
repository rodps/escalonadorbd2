/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

import java.util.ArrayList;

/**
 *
 * @author Douglas abreu
 */
public class Bloqueio {
	private int aa;
  private String itemdado;
  private String tipobloqueio;
  private ArrayList<Integer> idtran = new ArrayList<Integer>();

    public Bloqueio() {
       
    }

    public void setItemdado(String itemdado) {
        this.itemdado = itemdado;
    }

    public void setTipobloqueio(String tipobloqueio) {
        this.tipobloqueio = tipobloqueio;
    }

    public String getItemdado() {
        return itemdado;
    }

    public String getTipobloqueio() {
        return tipobloqueio;
    }

    public ArrayList<Integer> getIdtran() {
        return idtran;
    }

    public void setIdtran(ArrayList<Integer> idtran) {
        this.idtran = idtran;
    }

    
}
