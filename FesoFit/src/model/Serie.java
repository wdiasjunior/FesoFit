
package model;


public class Serie {
    
    private int id;
    private String nomeAluno;
    private String cref;

    public int getId() { return id; }
    public void setId(int id) { this.id = id;     }

    public String getCPFAluno() { return nomeAluno; }
    public void setCPFAluno(String nomeAluno) { this.nomeAluno = nomeAluno; }

    public String getCREF() { return cref; }
    public void setCREF(String cref) { this.cref = cref; }

    @Override
    public String toString() {
        return "Serie{" + "id=" + id + 
                ", nome aluno=" + nomeAluno + ", cref='" + cref + '\'' + '}';
    }
    
}
