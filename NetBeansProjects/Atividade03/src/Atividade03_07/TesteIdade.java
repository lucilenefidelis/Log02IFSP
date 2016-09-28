/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade03_07;

import javax.swing.JOptionPane;

/**
 *
 * @author a140234x
 */
public class TesteIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu nascimento"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu nascimento. Você deve utilizar somente o numero do mês"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento"));
        
        DiasIdade idade = new DiasIdade(dia,mes,ano);
    }
    
}
