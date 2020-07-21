
package controller;

import java.util.List;
import model.Aparelhos;
import model.Cliente;
import repository.RepositorioAparelho;


public class AparelhosController {
    
    private RepositorioAparelho repositorio;

    public AparelhosController(RepositorioAparelho repositorio) {
        this.repositorio = repositorio;
    }

    public boolean salvarAparelho(Aparelhos aparelho) {
        try {
            repositorio.salvarAparelho(aparelho);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean atualizarAparelho(Aparelhos aparelho, String dado) {
        try {
            repositorio.atualizarAparelho(aparelho, dado);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Aparelhos> listarAparelhos(String aparelho) {
        try {
            return repositorio.listarAparelhos(aparelho);
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean excluirAparelho(String aparelho) {
        try {
            repositorio.excluirAparelho(aparelho);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
