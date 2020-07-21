
package controller;

import java.util.List;
import model.Cliente;
import model.Treinador;
import repository.RepositorioTreinador;


public class TreinadorController {
    
    private RepositorioTreinador repositorio;

    public TreinadorController(RepositorioTreinador repositorio) {
        this.repositorio = repositorio;
    }

    public boolean salvarTreinador(Treinador treinador) {
        try {
            repositorio.salvarTreinador(treinador);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean atualizarTreinador(Treinador treinador) {
        try {
            repositorio.atualizarTreinador(treinador);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Treinador> listarTreinador(String dado) {
        try {
            return repositorio.listarTreinador(dado);
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean excluirTreinador(String treinador) {
        try {
            repositorio.excluirTreinador(treinador);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
