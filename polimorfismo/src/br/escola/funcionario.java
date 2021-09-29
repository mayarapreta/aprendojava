/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.escola;

/**
 *
 * @author mayar
 */
public class funcionario extends pessoas { 
    private double salarios;
    
    public funcionario (String nome, String email, double salarios) {
   super (nome, email);
        this. salarios = salarios;
    }
    public void mostrainfor() {
         
         super.mostrainfor();
         System.out.println("Salarios:" +  this.salarios);
     }
    
}
