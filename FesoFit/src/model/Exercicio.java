
package model;


public class Exercicio {

    private int codigo;
    private String nome;
    private String qtd_repeticoes;
    private String carga;
    private String duracao;
    
    public int getCodigo() { return codigo; }
    public void setCodigo(int id) { this.codigo = id; }

    public String getNome() { return nome; }
    public void setNome(String peso) { this.nome = peso; }

    public String getQTDRepeticoes() { return qtd_repeticoes; }
    public void setQTDRepeticoes(String qtd_repeticoes) { this.qtd_repeticoes = qtd_repeticoes; }
    
    public String getCarga() { return carga; }
    public void setCarga(String carga) { this.carga = carga; }

    public String getDuracao() { return duracao; }
    public void setDuracao(String duracao) { this.duracao = duracao; }
    

    @Override
    public String toString() {
        return "Exercicio{" + "codigo=" + codigo + ", nome=" + nome +
                ", qtd. repeticoes=" + qtd_repeticoes + ", carga='" + carga + ", duracao=" + duracao + '\'' + '}';
    }
    
}
