
package model;


public class CaracteristicaAluno {

    private int id;
    private String peso;
    private String altura;
    private String percentual;
    private String dataMedicao;
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPeso() { return peso; }
    public void setPeso(String peso) { this.peso = peso; }

    public String getAltura() { return altura; }
    public void setAltura(String altura) { this.altura = altura; }
    
    public String getPercentualGordura() { return percentual; }
    public void setPercentualGordura(String percentual) { this.percentual = percentual; }

    public String getDataMedicao() { return dataMedicao; }
    public void setDataMedicao(String dataMedicao) { this.dataMedicao = dataMedicao; }
    

    @Override
    public String toString() {
        return "Caracteristicas{" + "id=" + id + ", peso=" + peso +
                ", altura=" + altura + ", percentual_gordura='" + percentual + ", data_medicao=" + dataMedicao  + '\'' + '}';
    }
    
}
