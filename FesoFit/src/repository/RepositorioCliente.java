
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import model.CaracteristicaAluno;
import model.Cliente;
import model.Pessoa;
import model.Treinador;

public class RepositorioCliente {
     
    private Connection conexao;

    public RepositorioCliente(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvarCliente(Cliente cliente) throws SQLException {

        String textoDoComando = "INSERT INTO cliente(matricula, mensalidade, data_matricula, status_matricula) VALUES (?, ?, ?, ?); ";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setInt(1, cliente.getMatricula());
        comando.setFloat(2, cliente.getMensalidade());
        comando.setString(3, cliente.getDataMatricula());
        comando.setInt(4, cliente.getStatusMatricula());

        comando.execute();
    }
    
    public List<Cliente> listarCliente(String dado) throws SQLException {

        List<Cliente> clientes = new LinkedList<>();

        String textoDoComando = "SELECT mensalidade, data_matricula, status_matricula FROM cliente WHERE matricula = ?";
        
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.setString(1, dado);
        
        ResultSet resultSet = comando.executeQuery();

        while(resultSet.next()) {

            Cliente cliente = new Cliente();

            cliente.setMensalidade(resultSet.getFloat(1));
            cliente.setDataMatricula(resultSet.getString(2));
            cliente.setStatusMatricula(resultSet.getInt(3));

            clientes.add(cliente);
        }

        return clientes;
    }
    
    public void atualizarCliente(Cliente cliente) throws SQLException {

        String textoDoComando = "UPDATE cliente SET nome = ?, estado = ? WHERE id = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setInt(1, cliente.getMatricula());
        comando.setFloat(2, cliente.getMensalidade());
        comando.setString(3, cliente.getDataMatricula());
        comando.setInt(4, cliente.getStatusMatricula());

        comando.execute();
    }
    
    public void excluirCliente(String dado) throws SQLException {

        String textoDoComando = "DELETE FROM cliente WHERE id = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.execute();
    }
    
}
