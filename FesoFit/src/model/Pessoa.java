
package model;


public class Pessoa {
    
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String sexo;
    private String data_nascimento;

    public String getCPF() { return cpf; }
    public void setCPF(String cpf) { this.cpf = cpf; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getDataNascimento() { return data_nascimento; }
    public void setDataNascimento(String data_nascimento) { this.data_nascimento = data_nascimento; }

    @Override
    public String toString() {
        return "Pessoa{" + 
                "cpf=" + cpf + ", nome='" + nome + '\'' + ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone + ", sexo=" + sexo + ", data nascimento='" + data_nascimento + '\'' + '}';
    }
    
    
}
