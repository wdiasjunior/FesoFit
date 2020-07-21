
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import model.CaracteristicaAluno;
import model.Cliente;
import model.Exercicio;
import model.Pessoa;
import model.Treinador;

public class RepositorioExercicio {
     
    private Connection conexao;

    public RepositorioExercicio(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvarExercicio(Exercicio exercicio, String aluno, String cref) throws SQLException {

        String textoDoComando = "INSERT INTO exercicio( nome, qtd_repeticoes, carga, duracao, aluno, cref) VALUES (?, ?, ?, ?, ?, ?); ";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setString(1, exercicio.getNome());
        comando.setString(2, exercicio.getQTDRepeticoes());
        comando.setString(3, exercicio.getCarga());
        comando.setString(4, exercicio.getDuracao());
        comando.setString(5, aluno);
        comando.setString(6, cref);

        comando.execute();
    }
    
    public List<Exercicio> listarExercicios(String aluno) throws SQLException {

        List<Exercicio> exercicios = new LinkedList<>();

        String textoDoComando = "SELECT nome, qtd_repeticoes, carga, duracao FROM exercicio WHERE aluno = ?; ";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, aluno);
        
        ResultSet resultSet = comando.executeQuery();

        while(resultSet.next()) {

            Exercicio exercicio = new Exercicio();

            exercicio.setNome(resultSet.getString(1));
            exercicio.setQTDRepeticoes(resultSet.getString(2));
            exercicio.setCarga(resultSet.getString(3));
            exercicio.setDuracao(resultSet.getString(4));

            exercicios.add(exercicio);
        }

        return exercicios;
    }
    
    public void atualizarExercicio(Exercicio exercicio, String aluno) throws SQLException {

        String textoDoComando = "UPDATE exercicio SET nome = ?, qtd_repeticoes = ?, carga= ?, duracao = ? WHERE aluno = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setString(1, exercicio.getNome());
        comando.setString(2, exercicio.getQTDRepeticoes());
        comando.setString(3, exercicio.getCarga());
        comando.setString(4, exercicio.getDuracao());
        comando.setString(5, aluno);

        comando.execute();
    }
    
    public void excluirExercicio(String aluno, String nome) throws SQLException {

        String textoDoComando = "DELETE FROM exercicio WHERE aluno = ? AND nome = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, aluno);
        comando.setString(2, nome);
        
        comando.execute();
    }
    
    
    public void excluirExerciciosdaSerie(String aluno) throws SQLException {

        String textoDoComando = "DELETE FROM exercicio WHERE aluno = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, aluno);
        
        comando.execute();
    }
}
