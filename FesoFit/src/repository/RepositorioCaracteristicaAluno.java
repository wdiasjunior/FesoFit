
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import model.CaracteristicaAluno;

public class RepositorioCaracteristicaAluno {
     
    private Connection conexao;

    public RepositorioCaracteristicaAluno(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvarCaracterisica(CaracteristicaAluno caracteristica) throws SQLException {

        String textoDoComando = "INSERT INTO caracteristica(peso, altura, percentual_gordura, data_medicao) VALUES (?, ?, ?, ?); ";
        
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setString(1, caracteristica.getPeso());
        comando.setString(2, caracteristica.getAltura());
        comando.setString(3, caracteristica.getPercentualGordura());
        comando.setString(4, caracteristica.getDataMedicao());

        comando.execute();
    }
    
    public List<CaracteristicaAluno> listarCaracterisicas(String dado) throws SQLException {

        List<CaracteristicaAluno> caracteristicas = new LinkedList<>();

        String textoDoComando = "SELECT peso, altura, percentual_gordura, data_medicao FROM caracteristica where id = ? ";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, dado);
        
        ResultSet resultSet = comando.executeQuery();

        while(resultSet.next()) {

            CaracteristicaAluno caracteristica = new CaracteristicaAluno();

            caracteristica.setPeso(resultSet.getString(1));
            caracteristica.setAltura(resultSet.getString(2));
            caracteristica.setPercentualGordura(resultSet.getString(3));
            caracteristica.setDataMedicao(resultSet.getString(4));

            caracteristicas.add(caracteristica);
        }

        return caracteristicas;
    }
    
    public void atualizarCaracterisica(CaracteristicaAluno aparelho) throws SQLException {

        String textoDoComando = "UPDATE caracteristica SET nome = ?, estado = ? WHERE id = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setString(1, aparelho.getPeso());
        comando.setString(2, aparelho.getAltura());
        comando.setString(3, aparelho.getPercentualGordura());
        comando.setString(4, aparelho.getDataMedicao());

        comando.execute();
    }
    
    public void excluirCaracterisica(String dado) throws SQLException {

        String textoDoComando = "DELETE FROM caracteristica WHERE id = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.execute();
    }
    
}
