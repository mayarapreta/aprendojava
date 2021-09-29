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
public class testepolimorfismo {
    public static void main (String[] args){
        
        pessoas  p,p2;
        
        p = new pessoas ("Alex silva", "alexsilva@email.com");
        p2 =new funcionario ("Lea Souza" ,"lea@email.com",2000) ;
        
        p.mostrainfor();
        p2.mostrainfor();
        
    }
    
}
