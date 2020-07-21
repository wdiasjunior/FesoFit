
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import model.Cliente;
import model.Pessoa;

public class RepositorioPessoa {
     
    private Connection conexao;

    public RepositorioPessoa(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvarPessoa(Pessoa pessoa) throws SQLException {

        String textoDoComando = "INSERT INTO pessoa(cpf, nome, endereco, telefone, sexo, data_nascimento) VALUES (?, ?, ?, ?, ?, ?); ";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setString(1, pessoa.getCPF());
        comando.setString(2, pessoa.getNome());
        comando.setString(3, pessoa.getEndereco());
        comando.setString(4, pessoa.getTelefone());
        comando.setString(5, pessoa.getSexo());
        comando.setString(6, pessoa.getDataNascimento());

        comando.execute();
    }
    
    public List<Pessoa> listarPessoa(String dado) throws SQLException {

  
        List<Pessoa> pessoas = new LinkedList<>();

        String textoDoComando = "SELECT nome, endereco, telefone, sexo, data_nascimento FROM pessoa where CPF = ?";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, dado);

        ResultSet resultSet = comando.executeQuery();

        while(resultSet.next()) {

            Pessoa pessoa = new Pessoa();

            pessoa.setNome(resultSet.getString(1));
            pessoa.setEndereco(resultSet.getString(2));
            pessoa.setTelefone(resultSet.getString(3));
            pessoa.setSexo(resultSet.getString(4));
            pessoa.setDataNascimento(resultSet.getString(5));

            pessoas.add(pessoa);
        }

        return pessoas;
    }
    
    public void atualizarPessoa(Pessoa pessoa, String cpf) throws SQLException {

        String textoDoComando = "UPDATE pessoa SET nome = ?, endereco= ?, telefone= ?, sexo= ? WHERE cpf = ?";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, pessoa.getNome());
        comando.setString(2, pessoa.getEndereco());
        comando.setString(3, pessoa.getTelefone());
        comando.setString(4, pessoa.getSexo());
        
        comando.setString(5, cpf);

        comando.execute();
    }
    
    public void excluirPessoa(String dado) throws SQLException {

        String textoDoComando = "DELETE FROM pessoa WHERE cpf = ? ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, dado);
        
        comando.execute();
    }
}
