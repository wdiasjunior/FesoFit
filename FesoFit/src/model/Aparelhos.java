
package model;


public class Aparelhos {
    
    private int codigo;
    private String nome;
    private String estado;

    public int getCodigo() { return codigo; }
    public void setCodigo(int matricula) { this.codigo = matricula;     }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Aparelho{" + "codigo=" + codigo + 
                ", nome=" + nome + ", estado='" + estado + '\'' + '}';
    }
    
}
