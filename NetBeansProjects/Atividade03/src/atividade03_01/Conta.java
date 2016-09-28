/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03_01;

import java.util.Scanner;

/**
 *
 * @author a140234x
 */
public class Conta {
   
    double saldo;
    
    
   

    public double getSaldo() {
        return this.saldo;
    }

        
    void deposita(double valor) {  
        this.saldo += valor; //ou this.saldo = saldo + valor;  
        System.out.println("Deposito:" +valor);
        System.out.println("Saldo:"+valor);
    }   
    
    public void saca(double valor) {            
            this.saldo -= valor;
                      
    }
    
    public void atualizar(double taxa){
        this.saldo+=this.saldo*taxa;
       
    }
    
}
