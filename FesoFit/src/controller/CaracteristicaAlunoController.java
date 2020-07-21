
package controller;

import java.util.List;
import model.CaracteristicaAluno;
import repository.RepositorioCaracteristicaAluno;


public class CaracteristicaAlunoController {
    
    private RepositorioCaracteristicaAluno repositorio;

    public CaracteristicaAlunoController(RepositorioCaracteristicaAluno repositorio) {
        this.repositorio = repositorio;
    }

    public boolean salvarCaracteristica(CaracteristicaAluno caracteristica) {
        try {
            repositorio.salvarCaracterisica(caracteristica);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean atualizarCaracterisica(CaracteristicaAluno caracteristica) {
        try {
            repositorio.atualizarCaracterisica(caracteristica);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<CaracteristicaAluno> listarCaracterisica(String dado) {
        try {
            return repositorio.listarCaracterisicas(dado);
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean excluirCaracterisica(String dado) {
        try {
            repositorio.excluirCaracterisica(dado);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
