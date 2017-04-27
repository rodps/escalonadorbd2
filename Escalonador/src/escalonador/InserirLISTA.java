/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas abreu
 */
public class InserirLISTA extends Thread {

    public String a;
    public long time;
    public InserirLISTA(String a,long time) {
        this.a = a;
        this.time = time;
    }
    
    
    @Override
    public void run(){
            while(true){
                System.out.println(a);
                try {
                    this.sleep(time);
                } catch (InterruptedException ex) {
                    Logger.getLogger(InserirLISTA.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
                
                
                
            
            
            
        
    }
    
}
