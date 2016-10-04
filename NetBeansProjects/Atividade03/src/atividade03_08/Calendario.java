/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03_08;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author a140234x
 */
public class Calendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Para visualizar o mês que deseja, é só digitar o número do mês. Ex: setembro=9!"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que deseja visualizar"));
        
        mes = mes -1;
        
        Calendar cal = new GregorianCalendar(ano,mes,1);
        
        Locale ptBr = new Locale("pt","BR");
        
        DateFormatSymbols dfs = DateFormatSymbols.getInstance(ptBr);
        String[] diasSemana = dfs.getShortWeekdays();
        String[] mesesAno = dfs.getMonths();
        
        System.out.println(mesesAno[mes]);
        System.out.println(" "+ano);
        
        for (int i=1; i<diasSemana.length; i++){
            System.out.print(diasSemana[i]+"  ");
        }
        System.out.println(" ");
        
        while (cal.get(Calendar.MONTH)==mes){
            for(int i=1; i<diasSemana.length; i++){
                if(cal.get(Calendar.DAY_OF_MONTH)==1&& i !=cal.get(Calendar.DAY_OF_WEEK)){
                        System.out.print("     ");
                }else{
                    System.out.print(cal.get(Calendar.DAY_OF_MONTH));
                    if (cal.get(Calendar.DAY_OF_MONTH) < 10){
                        System.out.print("    ");
                    }else{
                        System.out.print("   ");
                    }
                    cal.add(Calendar.DATE, 1);
                    
                    if(cal.get(Calendar.MONTH) != mes){
                        break;
                }
            }
        }
            System.out.println("");
    }
    
}
}
