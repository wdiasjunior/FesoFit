
package model;


public class Treinador {
    
    private int id;
    private String cref;
    private String data_matricula;
    private int status_matricula;

    public int getId() { return id; }
    public void setId(int matricula) { this.id = matricula;     }

    public String getCref() { return cref; }
    public void setCref(String cref) { this.cref = cref; }

    public String getDataMatricula() { return data_matricula; }
    public void setDataMatricula(String data_matricula) { this.data_matricula = data_matricula; }

    public int getStatusMatricula() { return status_matricula; }
    public void setStatusMatricula(int status_matricula) { this.status_matricula = status_matricula; }

    @Override
    public String toString() {
        return "Empregado{" + "id=" + id + ", cref=" + cref +
                ", data matricula=" + data_matricula + ", status matricula='" + status_matricula + '\'' + '}';
    }
    
}
