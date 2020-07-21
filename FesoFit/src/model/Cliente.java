
package model;


public class Cliente {
    
    private int matricula;
    private float mensalidade;
    private String data_matricula;
    private int status_matricula;

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula;     }

    public float getMensalidade() { return mensalidade; }
    public void setMensalidade(float mensalidade) { this.mensalidade = mensalidade; }

    public String getDataMatricula() { return data_matricula; }
    public void setDataMatricula(String data_matricula) { this.data_matricula = data_matricula; }

    public int getStatusMatricula() { return status_matricula; }
    public void setStatusMatricula(int status_matricula) { this.status_matricula = status_matricula; }

    @Override
    public String toString() {
        return "Cliente{" + "matricula=" + matricula + ", mensalidade=" + mensalidade +
                ", data matricula=" + data_matricula + ", status matricula='" + status_matricula + '\'' + '}';
    }
    
}
