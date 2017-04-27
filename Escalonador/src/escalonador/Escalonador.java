/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;
import DAO.MinhaConexao;
import DAO.OperacaoSQL;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 *
 * @author Douglas abreu
 */
public class Escalonador {

    /**
     * @param args the command line arguments
     */
    
            
    public static void main(String[] args) throws SQLException, InterruptedException {
       
        // Colocando Todas operações disponivel em uma lista encadeada
        MinhaConexao con = new MinhaConexao();
        OperacaoSQL op = new OperacaoSQL();
        
        ListaOperacao ls = new ListaOperacao();
        ResultSet rs = op.select(op.getMax(),con.getConexao());
        ls.inserir(rs); // coloca na lista todas as tuplas do select
        op.setMax(ls.getLastId()); // define MAX O ULTIMO ID LIDO PELO SELECT
        // fim da inserção
        
        
        // fila de espera para W OU R
        FilaEspera filaespera = new FilaEspera();
        
        // inicia a lista do bloqueio
        ListaBloqueio lb = new ListaBloqueio();
        lb.inserir(ls);
        lb.print();
        
        InserirLISTA l = new InserirLISTA("a",3000);
       
       // Thread t = new Thread(l);
       // t.start();
         l.start();
        InserirLISTA l2 = new InserirLISTA("b",1000);
        
        l2.start();
        
        
        
        
        
        
        
        // começa a escalonar
        //escalona até a lista e a fila estiver vazia  
    }
    
}
