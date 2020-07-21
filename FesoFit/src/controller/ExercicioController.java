
package controller;

import java.util.List;
import model.Cliente;
import model.Exercicio;
import repository.RepositorioExercicio;


public class ExercicioController {
    
    private RepositorioExercicio repositorio;

    public ExercicioController(RepositorioExercicio repositorio) {
        this.repositorio = repositorio;
    }

    public boolean salvarExercicio(Exercicio exercicio, String aluno, String cref) {
        try {
            repositorio.salvarExercicio(exercicio, aluno, cref);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean atualizarExercicio(Exercicio exercicio, String aluno) {
        try {
            repositorio.atualizarExercicio(exercicio, aluno);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Exercicio> listarExercicios(String aluno) {
        try {
            return repositorio.listarExercicios(aluno);
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean excluirExercicio(String aluno, String exercicio) {
        try {
            repositorio.excluirExercicio(aluno, exercicio);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean excluirExerciciosSerie(String aluno) {
        try {
            repositorio.excluirExerciciosdaSerie(aluno);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
