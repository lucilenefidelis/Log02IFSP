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
public class Aluno {
    private String nome;
    private double n1, n2;


    public Aluno(String nome, double n1, double n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public double media() {
    return (n1+n2)/2;
    }

    public String getNome() {
        return nome;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
