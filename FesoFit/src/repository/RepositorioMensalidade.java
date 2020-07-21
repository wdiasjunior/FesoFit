
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import model.CaracteristicaAluno;
import model.Mensalidade;
import model.Pessoa;
import model.Treinador;

public class RepositorioMensalidade {
     
    private Connection conexao;

    public RepositorioMensalidade(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvarMensalidade(Mensalidade mensalidade) throws SQLException {

        String textoDoComando = "INSERT INTO mensalidade(valor_pago, data_vencimento, data_pagamento) VALUES (?, ?, ?); ";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setFloat(1, mensalidade.getValorPago());
        comando.setString(2, mensalidade.getDataVencimento());
        comando.setString(3, mensalidade.getDataPagamento());

        comando.execute();
    }
    
    public List<Mensalidade> listarMensalidades() throws SQLException {

        List<Mensalidade> mensalidades = new LinkedList<>();

        String textoDoComando = "SELECT valor_pago, data_vencimento, data_pagamento FROM mensalidade; ";

        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        ResultSet resultSet = comando.executeQuery();

        while(resultSet.next()) {

            Mensalidade mensalidade = new Mensalidade();

            mensalidade.setValorPago(resultSet.getFloat(1));
            mensalidade.setDataVencimento(resultSet.getString(2));
            mensalidade.setDataPagamento(resultSet.getString(3));

            mensalidades.add(mensalidade);
        }

        return mensalidades;
    }
    
    public void atualizarMensalidade(Mensalidade mensalidade) throws SQLException {

        String textoDoComando = "UPDATE mensalidade SET nome = ?, estado = ? WHERE id = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);

        comando.setFloat(1, mensalidade.getValorPago());
        comando.setString(2, mensalidade.getDataVencimento());
        comando.setString(3, mensalidade.getDataPagamento());

        comando.execute();
    }
    
    public void excluirMensalidade(Mensalidade mensalidade) throws SQLException {

        String textoDoComando = "DELETE FROM mensalidade WHERE id = ?; ";
        PreparedStatement comando = conexao.prepareStatement(textoDoComando);
        
        comando.execute();
    }
    
}
