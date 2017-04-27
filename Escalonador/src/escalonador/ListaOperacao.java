/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Douglas abreu
 */
public class ListaOperacao {

    private LinkedList<Operacao> lista;

    public ListaOperacao() {
        this.lista = new LinkedList<>();
    }    

    public void inserir (ResultSet rs) throws SQLException{
        
        try {
           
            while (rs.next()){ 
               
                Operacao m = new Operacao(rs.getInt(1),rs.getInt(2), rs.getString(3),
                        rs.getString(4),rs.getString(5));
                
                lista.addLast(m);
             
            }
        }catch(NullPointerException e){
            System.out.println("Nenhum dado no banco,fim do schedule");
        }
     }
     
    public int getLastId(){
        return lista.getLast().getIdoperacao();
    }
    public int getSize(){
        return lista.size();
    }
    public LinkedList<Operacao> getList(){
        return lista;
    }
}
