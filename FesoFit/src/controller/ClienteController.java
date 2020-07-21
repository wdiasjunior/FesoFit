
package controller;

import java.util.List;
import model.Aparelhos;
import model.Cliente;
import repository.RepositorioCliente;


public class ClienteController {
    
    private RepositorioCliente repositorio;

    public ClienteController(RepositorioCliente repositorio) {
        this.repositorio = repositorio;
    }

    public boolean salvarCliente(Cliente cliente) {
        try {
            repositorio.salvarCliente(cliente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean atualizarCliente(Cliente cliente) {
        try {
            repositorio.atualizarCliente(cliente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Cliente> listarCliente(String dado) {
        try {
            return repositorio.listarCliente(dado);
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean excluirCliente(String dado) {
        try {
            repositorio.excluirCliente(dado);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
