
import controller.AparelhosController;
import controller.CaracteristicaAlunoController;
import controller.ClienteController;
import controller.ExercicioController;
import controller.PessoaController;
import controller.SerieController;
import controller.TreinadorController;
import java.awt.Image;
import java.awt.MenuBar;
import java.io.IOException;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import model.Pessoa;
import repository.RepositorioAparelho;
import repository.RepositorioCaracteristicaAluno;
import repository.RepositorioCliente;
import repository.RepositorioExercicio;
import repository.RepositorioPessoa;
import repository.RepositorioSerie;
import repository.RepositorioTreinador;
import view.ViewCadastroGeral;


public class Main {
    
    public static Connection Conectar() throws ClassNotFoundException, SQLException { 
        String user = "root";
        String pass = "";        
        String db = "dbfesofit";
        String stringDeConexao = "jdbc:mysql://localhost:3306/"+db;
        
        return DriverManager.getConnection(stringDeConexao, "root", "");
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
                
        RepositorioPessoa repositorioPessoa = new RepositorioPessoa(Conectar());
        PessoaController pessoaController = new PessoaController(repositorioPessoa);
        
        RepositorioCliente repositorioCliente = new RepositorioCliente(Conectar());
        ClienteController clienteController = new ClienteController(repositorioCliente);
        
        RepositorioTreinador repositorioTreinador = new RepositorioTreinador(Conectar());
        TreinadorController treinadorController = new TreinadorController(repositorioTreinador);
        
        RepositorioCaracteristicaAluno repositorioCaracteristicas = new RepositorioCaracteristicaAluno(Conectar());
        CaracteristicaAlunoController caracteristicasController = new CaracteristicaAlunoController(repositorioCaracteristicas);
        
        RepositorioAparelho repositorioAparelho = new RepositorioAparelho(Conectar());
        AparelhosController controllerAparelho = new AparelhosController(repositorioAparelho);
        
        RepositorioExercicio repositorioExercicio = new RepositorioExercicio(Conectar());
        ExercicioController controllerExercicio = new ExercicioController(repositorioExercicio);
        
        RepositorioSerie repositorioSerie = new RepositorioSerie(Conectar());
        SerieController controllerSerie = new SerieController(repositorioSerie);


        JFrame frame = new JFrame();
        frame.setContentPane(new ViewCadastroGeral(pessoaController, clienteController, treinadorController, 
                caracteristicasController, controllerAparelho, controllerExercicio, controllerSerie).getPanelCadastro() );
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.pack();
        
        frame.setLocationRelativeTo(null);
        
        frame.setSize(1320, 650);
        frame.setTitle("Sistema FesoFit");
        
        Image i = ImageIO.read(ViewCadastroGeral.class.getResource("icon.png"));
        frame.setIconImage(i);
        
        frame.setVisible(true); 
        frame.setResizable(false);
        
    }    

}
