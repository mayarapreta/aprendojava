/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herença;


public class alunosubclasse extends pessoa {  /* ela é sub classe que faz a ligação a pessoa, filhas */
    
     private String escolaridade;

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
}
