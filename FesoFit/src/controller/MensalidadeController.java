
package controller;

import java.util.List;
import model.Cliente;
import model.Mensalidade;
import repository.RepositorioMensalidade;


public class MensalidadeController {
    
    private RepositorioMensalidade repositorio;

    public MensalidadeController(RepositorioMensalidade repositorio) {
        this.repositorio = repositorio;
    }

    public boolean salvarMensalidade(Mensalidade mensalidade) {
        try {
            repositorio.salvarMensalidade(mensalidade);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean atualizarMensalidade(Mensalidade mensalidade) {
        try {
            repositorio.atualizarMensalidade(mensalidade);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Mensalidade> listarMensalidades() {
        try {
            return repositorio.listarMensalidades();
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean excluirMensalidade(Mensalidade mensalidade) {
        try {
            repositorio.excluirMensalidade(mensalidade);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
