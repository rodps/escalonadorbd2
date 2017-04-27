/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

import java.util.LinkedList;

/**
 *
 * @author Douglas abreu
 */
public class ListaBloqueio {
    private LinkedList<Bloqueio> bloqueio;
    
    public ListaBloqueio(){
        this.bloqueio = new LinkedList<>();
    }
    
    public void inserir(ListaOperacao ls){
        LinkedList <Operacao> lista = ls.getList();
        for(int s = 0 ; s < lista.size(); s++){
            if(lista.get(s).getItemdado() != null){
                Bloqueio novo = new Bloqueio();
                novo.setItemdado(lista.get(s).getItemdado());
                novo.setTipobloqueio("U");
                bloqueio.addLast(novo);  
                
                //remove todos itemdado duplicados da lista
                for(int i = 0 ; i < bloqueio.size() ; i++){
                    for(int j = i + 1 ; j < bloqueio.size() ; j++){
                        if(bloqueio.get(i).getItemdado().equals(bloqueio.get(j).getItemdado())){
                            bloqueio.remove(j);
                          
                        }
                    }
                }
                     
            }
        }
    }
    
    public String check(String itemdado){
        for(int i = 0 ; i < bloqueio.size(); i++){
            if(bloqueio.get(i).getItemdado().equals(itemdado))
                return bloqueio.get(i).getTipobloqueio();
        } 
         return null;
    }
    
    public void print(){
        for (int k = 0 ; k < bloqueio.size() ; k++){
            System.out.println(bloqueio.get(k).getItemdado());
        }
    }
}
