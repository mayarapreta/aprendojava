/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.escola;


public class pessoas {
    
   String nome;
   String email;
  
   public pessoas (String nome , String email ) {
   
      this.nome = nome;
      this. email= email;
}
   public void  mostrainfor() {
     
       System.out.printf("Nome:" + this.nome);
       System.out.println("email" + this.email);
      
   }}
