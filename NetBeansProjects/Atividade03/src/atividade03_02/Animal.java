/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03_02;

/**
 *
 * @author a140234x
 */
public class Animal {
    String nome;
    int comprimento;
    int patas;
    String cor;
    String ambiente;
    float velocidade;
    String dados;

    public Animal(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
        this.dados();
    }
    public void alteraNome(String nome){
        this.nome=nome;
    }
    public void alteraComprimento(int comprimento){
        this.comprimento=comprimento;
    }
    public void alteraPatas(int patas){
        this.patas=patas;
    }
    public void alteraCor(String cor){
        this.cor=cor;
    }
    public void alteraAmbiente(String Ambiente){
        this.ambiente=ambiente;
    }
    public void alteraVelocidade(float velocidade){
        this.velocidade=velocidade;
    }
    public void dados(){
        
    }

   
}
