/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade03_07;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author a140234x
 */
public class DiasIdade {
    private int dia, mes, ano;

    public DiasIdade(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.calculaIdade();
    }
    private void calculaIdade(){
        GregorianCalendar nascimento = new GregorianCalendar(ano,(mes-1),dia);
        GregorianCalendar hoje = new GregorianCalendar();
        
        SimpleDateFormat simdafor = new SimpleDateFormat("dd/mm/aaaa");
        
        long data1 = nascimento.getTimeInMillis();
        long data2 = hoje.getTimeInMillis();
        
        System.out.println("Hoje é dia" + simdafor.format(hoje.getTime()));
        System.out.println("Digite a data de nascimento"+simdafor.format(nascimento.getTime()));
        System.out.println("Desde de que você nasceu, passou-se "+(int)(((data2-data1)/(1000*60*60*24)))+" dias.");
    }
}
