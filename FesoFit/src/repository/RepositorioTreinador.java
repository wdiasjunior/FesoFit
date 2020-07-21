
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import model.Cliente;
import model.Pessoa;
import model.Treinador;

public class RepositorioTreinador {
     
    private Connection conexao;

    public RepositorioTreinador(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void salvarTreinador(Treinador treinador) throws SQLException {

        String textoDoComando = "INSERT INTO treinador(cref, data_matricula, status_matricula) VALUES (?, ?, ?); ";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, treinador.getCref());
        comando.setString(2, treinador.getDataMatricula());
        comando.setInt(3, treinador.getStatusMatricula());

        comando.execute();
    }

    public List<Treinador> listarTreinador(String dado) throws SQLException {

  
        List<Treinador> treinadores = new LinkedList<>();

        String textoDoComando = "SELECT cref, data_matricula, status_matricula FROM treinador WHERE id = ?";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, dado);

        ResultSet resultSet = comando.executeQuery();

        while(resultSet.next()) {

            Treinador treinador = new Treinador();

            treinador.setCref(resultSet.getString(1));
            treinador.setDataMatricula(resultSet.getString(2));
            treinador.setStatusMatricula(resultSet.getInt(3));

            treinadores.add(treinador);
        }

        return treinadores;
    }
    
    public void atualizarTreinador(Treinador treinador) throws SQLException {

        String textoDoComando = "UPDATE treinador SET cref = ?, data_matricula = ?, status_matricula = ? WHERE id = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setString(1, treinador.getCref());
        comando.setString(2, treinador.getDataMatricula());
        comando.setInt(3, treinador.getStatusMatricula());

        comando.execute();
    }
    
    public void excluirTreinador(String treinador) throws SQLException {

        String textoDoComando = "DELETE FROM treinador WHERE id = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.execute();
    }
}
