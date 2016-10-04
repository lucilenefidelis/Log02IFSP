/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03_03;

/**
 *
 * @author a140234x
 */
public class Funcionario {
    private String nome;
    private String salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, String salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
