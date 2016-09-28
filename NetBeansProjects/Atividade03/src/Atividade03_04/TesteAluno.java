/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade03_04;

/**
 *
 * @author a140234x
 */
public class TesteAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno ("Ana",10,9);
        Aluno a2 = new Aluno ("Beto",9,10);
        System.out.println(a1.media());
        System.out.println(a2.media());
    }
    
}
