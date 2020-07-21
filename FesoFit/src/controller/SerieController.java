
package controller;

import java.util.List;
import model.Aparelhos;
import model.Cliente;
import model.Serie;
import repository.RepositorioSerie;


public class SerieController {
    
    private RepositorioSerie repositorio;

    public SerieController(RepositorioSerie repositorio) {
        this.repositorio = repositorio;
    }

    public boolean salvarSerie(Serie serie) {
        try {
            repositorio.salvarSerie(serie);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean atualizarSerie(String serie, String aluno) {
        try {
            repositorio.atualizarSerie(serie, aluno);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Serie> listarSerie(String aluno) {
        try {
            return repositorio.listarSerie(aluno);
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean excluirSerie(String aluno) {
        try {
            repositorio.excluirSerie(aluno);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
