
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import model.Aparelhos;
import model.Cliente;
import model.Pessoa;
import model.Serie;
import model.Treinador;

public class RepositorioSerie {
     
    private Connection conexao;

    public RepositorioSerie(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvarSerie(Serie aparelho) throws SQLException {

        String textoDoComando = "INSERT INTO serie(nome_aluno, cref) VALUES (?, ?); ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setString(1, aparelho.getCPFAluno());
        comando.setString(2, aparelho.getCREF());

        comando.execute();
    }
    
    public List<Serie> listarSerie(String aluno) throws SQLException {

        List<Serie> series = new LinkedList<>();

        String textoDoComando = "SELECT id, nome_aluno, cref FROM serie WHERE nome_aluno = ?; ";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, aluno);
        
        ResultSet resultSet = comando.executeQuery();

        while(resultSet.next()) {

            Serie serie = new Serie();

            serie.setId(resultSet.getInt(1));
            serie.setCPFAluno(resultSet.getString(2));
            serie.setCREF(resultSet.getString(3));

            series.add(serie);
        }

        return series;
    }
    
    public void atualizarSerie(String cref, String aluno) throws SQLException {

        String textoDoComando = "UPDATE serie SET cref = ? WHERE nome_aluno = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, cref);

        comando.setString(2, aluno);

        comando.execute();
    }
    
    public void excluirSerie(String aluno) throws SQLException {

        String textoDoComando = "DELETE FROM serie WHERE nome_aluno = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, aluno);
        
        comando.execute();
    }
    
}
