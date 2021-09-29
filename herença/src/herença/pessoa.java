
package herença;
/* super classe mae */

public class pessoa  {
    private Int matricular; 
    private String  nome;
   private String  rg;
    private String cpf;
     private String logradouro;
    private Int numero;
   private String  bairro;
  private String  cidade;
  private String   cep;
  private String  uf;
   private String  email;
  private String  fone;

    public Int getMatricular() {
        return matricular;
    }

    public void setMatricular(Int matricular) {
        this.matricular = matricular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Int getNumero() {
        return numero;
    }

    public void setNumero(Int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    private static class Int {

        public Int() {
        }
    }
    
}
