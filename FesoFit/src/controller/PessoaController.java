
package controller;

import java.util.List;
import model.Cliente;
import model.Pessoa;
import repository.RepositorioPessoa;


public class PessoaController {
    
    private RepositorioPessoa repositorio;

    public PessoaController(RepositorioPessoa repositorio) {
        this.repositorio = repositorio;
    }

    public boolean salvarPessoa(Pessoa pessoa) {
        try {
            repositorio.salvarPessoa(pessoa);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean atualizarPessoa(Pessoa cliente, String cpf) {
        try {
            repositorio.atualizarPessoa(cliente, cpf);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Pessoa> listarPessoa(String dado) {
        try {
            return repositorio.listarPessoa(dado);
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean excluirPessoa(String cliente) {
        try {
            repositorio.excluirPessoa(cliente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
