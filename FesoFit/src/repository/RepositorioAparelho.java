
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
import model.Treinador;

public class RepositorioAparelho {
     
    private Connection conexao;

    public RepositorioAparelho(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvarAparelho(Aparelhos aparelho) throws SQLException {

        String textoDoComando = "INSERT INTO aparelhos( nome, estado) VALUES (?, ?); ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setString(1, aparelho.getNome());
        comando.setString(2, aparelho.getEstado());

        comando.execute();
    }
    
    public List<Aparelhos> listarAparelhos(String dado) throws SQLException {

        List<Aparelhos> aparelhos = new LinkedList<>();

        String textoDoComando = "SELECT nome, estado FROM aparelhos WHERE nome = ?; ";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, dado);
        
        ResultSet resultSet = comando.executeQuery();

        while(resultSet.next()) {

            Aparelhos aparelho = new Aparelhos();

            aparelho.setNome(resultSet.getString(1));
            aparelho.setEstado(resultSet.getString(2));

            aparelhos.add(aparelho);
        }

        return aparelhos;
    }
    
    public void atualizarAparelho(Aparelhos aparelho, String nome) throws SQLException {

        String textoDoComando = "UPDATE aparelhos SET estado = ? WHERE nome = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setString(1, aparelho.getEstado());
        comando.setString(2, nome);

        comando.execute();
    }
    
    public void excluirAparelho(String aparelho) throws SQLException {

        String textoDoComando = "DELETE FROM aparelhos WHERE nome = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, aparelho);
        
        comando.execute();
    }
    
}
