/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03_01;

/**
 *
 * @author a140234x
 */
public class ContaCorrente extends Conta {
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;
    }
    
}
