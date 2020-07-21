
package view;


import controller.AparelhosController;
import controller.CaracteristicaAlunoController;
import controller.ClienteController;
import controller.ExercicioController;
import controller.PessoaController;
import controller.SerieController;

import controller.TreinadorController;
import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.CaracteristicaAluno;
import model.Cliente;
import model.Pessoa;
import model.Treinador;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import model.Aparelhos;
import model.Exercicio;
import model.Serie;
import repository.RepositorioCaracteristicaAluno;
import repository.RepositorioCliente;
import repository.RepositorioPessoa;
import repository.RepositorioTreinador;

public class ViewCadastroGeral extends javax.swing.JFrame {

    private PessoaController                controller;
    private CaracteristicaAlunoController   controllerCA;
    private ClienteController               controllerCliente;
    private TreinadorController             controllerTreinador;
    private AparelhosController             controllerAparelho;
    private ExercicioController             controllerExercicio;
    private SerieController                 controllerSerie;
    
    public ViewCadastroGeral(PessoaController controller, ClienteController controllerCliente, 
            TreinadorController controllerTreinador, CaracteristicaAlunoController  controllerCA,
            AparelhosController controllerAparelho, ExercicioController controllerExercicio, SerieController controllerSerie) throws IOException {
        
        this.controller = controller;
        this.controllerCliente = controllerCliente;
        this.controllerCA = controllerCA;
        this.controllerTreinador = controllerTreinador;
        
        this.controllerAparelho = controllerAparelho;
        this.controllerExercicio = controllerExercicio;
        this.controllerSerie = controllerSerie;
        
        initComponents();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        
        txtDataMatricula.setText(formatter.format(date));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        PnlCadastro = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnSalvarAluno = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtGordura = new javax.swing.JTextField();
        txtDataMedicao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMensalidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        radioButtonMasculino = new javax.swing.JRadioButton();
        radioButtonFeminino = new javax.swing.JRadioButton();
        txtDataMatricula = new javax.swing.JTextField();
        txtStatusMatricula = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCREF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelConsulta = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtMensalidade1 = new javax.swing.JTextField();
        txtPeso1 = new javax.swing.JTextField();
        txtAltura1 = new javax.swing.JTextField();
        txtGordura1 = new javax.swing.JTextField();
        txtDataMedicao1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtNome1 = new javax.swing.JTextField();
        txtEndereco1 = new javax.swing.JTextField();
        txtTelefone1 = new javax.swing.JTextField();
        txtDataNascimento1 = new javax.swing.JTextField();
        radioButtonMasculino1 = new javax.swing.JRadioButton();
        radioButtonFeminino1 = new javax.swing.JRadioButton();
        txtDataMatricula1 = new javax.swing.JTextField();
        txtStatusMatricula1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtCref1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        txtBuscarMatricula = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtBuscarCPF = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimparBusca = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        btnTreino = new javax.swing.JButton();
        btnEquipamento = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelSerie = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        txtSerieCarga = new javax.swing.JTextField();
        txtSerieExercicio = new javax.swing.JTextField();
        txtSerieRepeticoes = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txtSerieDuracao = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        btnSalvarExercicio = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        txtSerieNomeAluno = new javax.swing.JTextField();
        txtSerieNomeTreinador = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        btnSalvarSerie = new javax.swing.JButton();
        PanelConsulta1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        txtSerieNomeTreinadorAlterar = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        btnAlterarSerie = new javax.swing.JButton();
        btnDeletarSerie = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        txtSerieCargaAlterar = new javax.swing.JTextField();
        txtSerieExercicioAlterar = new javax.swing.JTextField();
        txtSerieRepeticoesAlterar = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtSerieDuracaoAlterar = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        btnAtualizarExercicio = new javax.swing.JButton();
        btnDeletarExercicio = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        txtBuscarCPFSerie = new javax.swing.JTextField();
        btnBuscarSerie = new javax.swing.JButton();
        btnLimparBuscaSerie = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        panelAparelho = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        txtNomeAparelho = new javax.swing.JTextField();
        txtEstadoAparelho = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        btnSalvarAparelho = new javax.swing.JButton();
        PanelConsulta2 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        txtNomeAparelhoAlterar = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txtEstadoAparelhoAlterar = new javax.swing.JTextField();
        btnAlterarAparelho = new javax.swing.JButton();
        btnDeletarAparelho = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        txtBuscarAparelho = new javax.swing.JTextField();
        btnBuscarAparelho = new javax.swing.JButton();
        btnLimparBuscaAparelho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Pessoa");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        PnlCadastro.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu de Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnSalvarAluno.setBackground(new java.awt.Color(0, 204, 0));
        btnSalvarAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalvarAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAluno.setText("Salvar Cadastro ");
        btnSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlunoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtPeso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtAltura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtGordura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtDataMedicao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel12.setText("Data Medição");

        jLabel13.setText("Altura (cm)");

        jLabel14.setText("Peso (kg)");

        jLabel15.setText("Percent. Gordura");

        txtMensalidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel16.setText("Mensalidade");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMensalidade)
                    .addComponent(txtAltura))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtGordura, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel15))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataMedicao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGordura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataMedicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtDataNascimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        buttonGroup2.add(radioButtonMasculino);
        radioButtonMasculino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioButtonMasculino.setText("Masculino");

        buttonGroup2.add(radioButtonFeminino);
        radioButtonFeminino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioButtonFeminino.setText("Feminino");

        txtDataMatricula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtStatusMatricula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtStatusMatricula.setText("1");

        txtCPF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setText("Logradouro");

        jLabel5.setText("CPF");

        jLabel6.setText("Nome Completo");

        jLabel7.setText("Telefone / Celular");

        jLabel8.setText("Status (1 ativo / 2  inativo / 3 trancado)");

        jLabel9.setText("Data da Matrícula");

        jLabel10.setText("Data de Nascimento");

        jLabel11.setText("Sexo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(radioButtonMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(radioButtonFeminino))
                            .addComponent(jLabel11))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(47, 47, 47))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(67, 67, 67)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(txtDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtStatusMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone)
                                    .addComponent(jLabel7))
                                .addGap(19, 19, 19))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioButtonMasculino)
                        .addComponent(radioButtonFeminino))
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatusMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Treinador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtCREF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Para cadastrar um treinador");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("preencha os dados acima e o cref.");

        jLabel18.setText("CREF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCREF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(4, 4, 4)
                .addComponent(txtCREF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnSalvarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("FesoFit");

        PanelConsulta.setBackground(new java.awt.Color(255, 255, 255));
        PanelConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualização de Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtMensalidade1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtPeso1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtAltura1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtGordura1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtDataMedicao1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel19.setText("Data Medição");

        jLabel20.setText("Altura (cm)");

        jLabel21.setText("Peso (kg)");

        jLabel22.setText("Percent. Gordura");

        jLabel23.setText("Mensalidade");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataMedicao1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAltura1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMensalidade1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtGordura1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGordura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMensalidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAltura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPeso1))
                    .addComponent(txtDataMedicao1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtNome1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome1.setEnabled(false);

        txtEndereco1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtTelefone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtDataNascimento1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDataNascimento1.setEnabled(false);

        buttonGroup1.add(radioButtonMasculino1);
        radioButtonMasculino1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioButtonMasculino1.setText("Masculino");

        buttonGroup1.add(radioButtonFeminino1);
        radioButtonFeminino1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioButtonFeminino1.setText("Feminino");

        txtDataMatricula1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDataMatricula1.setEnabled(false);

        txtStatusMatricula1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel25.setText("Logradouro");

        jLabel27.setText("Nome Completo");

        jLabel28.setText("Telefone / Celular");

        jLabel29.setText("Status (1 ativo / 2  inativo / 3 trancado)");

        jLabel30.setText("Data da Matrícula");

        jLabel31.setText("Data de Nascimento");

        jLabel32.setText("Sexo");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(radioButtonMasculino1)
                                .addGap(18, 18, 18)
                                .addComponent(radioButtonFeminino1))
                            .addComponent(jLabel32)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28)
                                .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(txtStatusMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(152, 152, 152)
                                    .addComponent(txtDataNascimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addGap(41, 41, 41)
                                    .addComponent(jLabel31)))
                            .addGap(46, 46, 46)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDataMatricula1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(22, 22, 22))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioButtonMasculino1)
                        .addComponent(radioButtonFeminino1))
                    .addComponent(txtNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataNascimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatusMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Treinador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtCref1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCref1.setEnabled(false);

        jLabel33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel33.setText("Para cadastrar um treinador, basta");

        jLabel34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel34.setText("preencher os dados acima e o cref.");

        jLabel35.setText("CREF");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCref1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCref1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAtualizar.setBackground(new java.awt.Color(255, 153, 102));
        btnAtualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar Cadastro");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(204, 51, 0));
        btnDeletar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Excluir Cadastro");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelConsultaLayout = new javax.swing.GroupLayout(PanelConsulta);
        PanelConsulta.setLayout(PanelConsultaLayout);
        PanelConsultaLayout.setHorizontalGroup(
            PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConsultaLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(PanelConsultaLayout.createSequentialGroup()
                        .addGroup(PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelConsultaLayout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(PanelConsultaLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        PanelConsultaLayout.setVerticalGroup(
            PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        txtBuscarMatricula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel24.setText("Nº matrícula");

        jLabel26.setText("CPF");

        txtBuscarCPF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(102, 153, 255));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimparBusca.setBackground(new java.awt.Color(255, 102, 102));
        btnLimparBusca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimparBusca.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparBusca.setText("limpar");
        btnLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimparBusca)
                .addGap(18, 18, 18))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)
                        .addComponent(btnLimparBusca))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)))
                .addContainerGap())
        );

        btnTreino.setBackground(new java.awt.Color(0, 153, 204));
        btnTreino.setForeground(new java.awt.Color(255, 255, 255));
        btnTreino.setText("Treinos");
        btnTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinoActionPerformed(evt);
            }
        });

        btnEquipamento.setBackground(new java.awt.Color(0, 204, 0));
        btnEquipamento.setForeground(new java.awt.Color(255, 255, 255));
        btnEquipamento.setText("Equipamentos");
        btnEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipamentoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair do Programa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(btnTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnEquipamento)
                .addGap(250, 250, 250)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout PnlCadastroLayout = new javax.swing.GroupLayout(PnlCadastro);
        PnlCadastro.setLayout(PnlCadastroLayout);
        PnlCadastroLayout.setHorizontalGroup(
            PnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCadastroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlCadastroLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(PnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PnlCadastroLayout.setVerticalGroup(
            PnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCadastroLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(PnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCadastroLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSerie.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu de Cadastro Série", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Exercício", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtSerieCarga.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtSerieExercicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtSerieRepeticoes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel55.setText("Repetições");

        jLabel56.setText("Descrição");

        jLabel57.setText("carga (kg)");

        txtSerieDuracao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel59.setText("Duração (minutos)");

        btnSalvarExercicio.setBackground(new java.awt.Color(0, 204, 0));
        btnSalvarExercicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalvarExercicio.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarExercicio.setText("Adicionar Exercício");
        btnSalvarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarExercicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarExercicio)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSerieExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(txtSerieRepeticoes))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel57))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSerieDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(txtSerieCarga))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(txtSerieExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(txtSerieDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerieRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(txtSerieCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addComponent(btnSalvarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Série", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtSerieNomeAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtSerieNomeTreinador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel62.setText("CPF do Aluno");

        jLabel65.setText("CREF Treinador");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addComponent(txtSerieNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSerieNomeTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(txtSerieNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerieNomeTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvarSerie.setBackground(new java.awt.Color(0, 204, 0));
        btnSalvarSerie.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalvarSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarSerie.setText("Salvar Série ");
        btnSalvarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 526, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(btnSalvarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelConsulta1.setBackground(new java.awt.Color(255, 255, 255));
        PanelConsulta1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualização de Cadastro Série", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Série", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtSerieNomeTreinadorAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel66.setText("CREF Treinador");

        btnAlterarSerie.setBackground(new java.awt.Color(0, 204, 0));
        btnAlterarSerie.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAlterarSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarSerie.setText("Atualizar Série");
        btnAlterarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSerieActionPerformed(evt);
            }
        });

        btnDeletarSerie.setBackground(new java.awt.Color(204, 51, 0));
        btnDeletarSerie.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeletarSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarSerie.setText("Excluir Série");
        btnDeletarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSerieNomeTreinadorAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAlterarSerie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletarSerie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(txtSerieNomeTreinadorAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Exercício", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtSerieCargaAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtSerieExercicioAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtSerieRepeticoesAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel58.setText("Repetições");

        jLabel60.setText("Descrição");

        jLabel61.setText("carga (kg)");

        txtSerieDuracaoAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel64.setText("Duração (minutos)");

        btnAtualizarExercicio.setBackground(new java.awt.Color(255, 153, 102));
        btnAtualizarExercicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAtualizarExercicio.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarExercicio.setText("Atualizar Exercício");
        btnAtualizarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarExercicioActionPerformed(evt);
            }
        });

        btnDeletarExercicio.setBackground(new java.awt.Color(204, 51, 0));
        btnDeletarExercicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeletarExercicio.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarExercicio.setText("Excluir Exercício");
        btnDeletarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarExercicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSerieExercicioAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(txtSerieRepeticoesAlterar))
                .addGap(41, 41, 41)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSerieDuracaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(txtSerieCargaAlterar))
                .addContainerGap())
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnAtualizarExercicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(btnDeletarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtSerieExercicioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(txtSerieDuracaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerieRepeticoesAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(txtSerieCargaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelConsulta1Layout = new javax.swing.GroupLayout(PanelConsulta1);
        PanelConsulta1.setLayout(PanelConsulta1Layout);
        PanelConsulta1Layout.setHorizontalGroup(
            PanelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsulta1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PanelConsulta1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelConsulta1Layout.setVerticalGroup(
            PanelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConsulta1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta Série", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel87.setText("CPF");

        txtBuscarCPFSerie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnBuscarSerie.setBackground(new java.awt.Color(102, 153, 255));
        btnBuscarSerie.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscarSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarSerie.setText("Buscar");
        btnBuscarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSerieActionPerformed(evt);
            }
        });

        btnLimparBuscaSerie.setBackground(new java.awt.Color(255, 102, 102));
        btnLimparBuscaSerie.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimparBuscaSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparBuscaSerie.setText("limpar");
        btnLimparBuscaSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel87)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarCPFSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarSerie)
                .addGap(33, 33, 33)
                .addComponent(btnLimparBuscaSerie)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCPFSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparBuscaSerie))
                .addContainerGap())
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercício", "Repetições", "Carga", "Duração"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelSerieLayout = new javax.swing.GroupLayout(panelSerie);
        panelSerie.setLayout(panelSerieLayout);
        panelSerieLayout.setHorizontalGroup(
            panelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSerieLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(panelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelConsulta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSerieLayout.setVerticalGroup(
            panelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSerieLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSerieLayout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        panelAparelho.setBackground(new java.awt.Color(255, 255, 255));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu de Cadastro Aparelho", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Série", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtNomeAparelho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtEstadoAparelho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel70.setText("Nome");

        jLabel71.setText("Estado");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addComponent(txtNomeAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(txtEstadoAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(txtNomeAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvarAparelho.setBackground(new java.awt.Color(0, 204, 0));
        btnSalvarAparelho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalvarAparelho.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAparelho.setText("Salvar Aparelho ");
        btnSalvarAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAparelhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvarAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelConsulta2.setBackground(new java.awt.Color(255, 255, 255));
        PanelConsulta2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualização de Cadastro Aparelho", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Série", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtNomeAparelhoAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNomeAparelhoAlterar.setEnabled(false);

        jLabel73.setText("Nome");

        jLabel74.setText("Estado");

        txtEstadoAparelhoAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addComponent(txtNomeAparelhoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel74)
                .addGap(18, 18, 18)
                .addComponent(txtEstadoAparelhoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(txtNomeAparelhoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoAparelhoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnAlterarAparelho.setBackground(new java.awt.Color(0, 204, 0));
        btnAlterarAparelho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAlterarAparelho.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarAparelho.setText("Atualizar Aparelho");
        btnAlterarAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAparelhoActionPerformed(evt);
            }
        });

        btnDeletarAparelho.setBackground(new java.awt.Color(204, 51, 0));
        btnDeletarAparelho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeletarAparelho.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarAparelho.setText("Excluir Aparelho");
        btnDeletarAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarAparelhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelConsulta2Layout = new javax.swing.GroupLayout(PanelConsulta2);
        PanelConsulta2.setLayout(PanelConsulta2Layout);
        PanelConsulta2Layout.setHorizontalGroup(
            PanelConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsulta2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnAlterarAparelho)
                .addGap(51, 51, 51)
                .addComponent(btnDeletarAparelho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConsulta2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelConsulta2Layout.setVerticalGroup(
            PanelConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsulta2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta Aparelho", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel88.setText("Nome");

        txtBuscarAparelho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnBuscarAparelho.setBackground(new java.awt.Color(102, 153, 255));
        btnBuscarAparelho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscarAparelho.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAparelho.setText("Buscar");
        btnBuscarAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAparelhoActionPerformed(evt);
            }
        });

        btnLimparBuscaAparelho.setBackground(new java.awt.Color(255, 102, 102));
        btnLimparBuscaAparelho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimparBuscaAparelho.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparBuscaAparelho.setText("limpar");
        btnLimparBuscaAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaAparelhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel88)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnBuscarAparelho)
                .addGap(33, 33, 33)
                .addComponent(btnLimparBuscaAparelho)
                .addGap(26, 26, 26))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAparelho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparBuscaAparelho))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAparelhoLayout = new javax.swing.GroupLayout(panelAparelho);
        panelAparelho.setLayout(panelAparelhoLayout);
        panelAparelhoLayout.setHorizontalGroup(
            panelAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAparelhoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(panelAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelConsulta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        panelAparelhoLayout.setVerticalGroup(
            panelAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAparelhoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAparelhoLayout.createSequentialGroup()
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelAparelho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelSerie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelAparelho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlunoActionPerformed
        
        if(ValidarCampos() && ValidarCamposAluno()){
           salvarAluno();
        }
        
        if(ValidarCampos() && ValidarCamposTreinador()) {
            salvarTreinador();
        }
        
    }//GEN-LAST:event_btnSalvarAlunoActionPerformed
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        
        if(ValidarParaBuscar()) {
            
            String buscarCPF = txtBuscarCPF.getText();
            String buscarMatricula = txtBuscarMatricula.getText();

            List<Pessoa> listaPessoa = this.controller.listarPessoa(buscarCPF);
            List<Cliente> listaMatriculado = this.controllerCliente.listarCliente(buscarMatricula);
            List<CaracteristicaAluno> listaCaracteristica = this.controllerCA.listarCaracterisica(buscarMatricula);
            List<Treinador> listaCoach = this.controllerTreinador.listarTreinador(buscarMatricula);


            //lista pessoa
            for(int i=0; i< listaPessoa.size(); i++) {      
                txtNome1.setText(listaPessoa.get(i).getNome());
                txtEndereco1.setText(listaPessoa.get(i).getEndereco());
                txtTelefone1.setText(listaPessoa.get(i).getTelefone());

                if(listaPessoa.get(i).getSexo() != null && listaPessoa.get(i).getSexo() == "Feminino") { radioButtonFeminino1.setSelected(true); }
                else{ radioButtonMasculino1.setSelected(true); }
                txtDataNascimento1.setText(listaPessoa.get(i).getDataNascimento());
            };


            //lista aluno
            for(int i=0; i< listaMatriculado.size(); i++) {
                txtMensalidade1.setText(String.valueOf(listaMatriculado.get(i).getMensalidade()));
                txtDataMatricula1.setText(listaMatriculado.get(i).getDataMatricula());
                txtStatusMatricula1.setText(String.valueOf(listaMatriculado.get(i).getStatusMatricula()));
            }

            //lista treinador
            for(int i=0; i< listaCoach.size(); i++) {
                txtCref1.setText(listaCoach.get(i).getCref());
                txtDataMatricula1.setText(listaCoach.get(i).getDataMatricula());
                txtStatusMatricula1.setText(String.valueOf(listaCoach.get(i).getStatusMatricula()));

            }


            //verifica se é aluno
            if(!txtMensalidade1.getText().isEmpty() && txtCref1.getText().isEmpty()) {

                for(int i=0; i< listaCaracteristica.size(); i++) {      
                    txtPeso1.setText(listaCaracteristica.get(i).getPeso());
                    txtGordura1.setText(listaCaracteristica.get(i).getPercentualGordura());
                    txtAltura1.setText(listaCaracteristica.get(i).getAltura());
                    txtDataMedicao1.setText(listaCaracteristica.get(i).getDataMedicao());
                };

            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        
        
        //atualiza pessoa
        this.controller.atualizarPessoa(atualizar(), txtBuscarCPF.getText());
        
        //atualiza treinador
        if(!txtCref1.getText().isEmpty() ) {
            this.controllerTreinador.atualizarTreinador(atualizarTreinador());
            limparCamposEdicao();
            JOptionPane.showMessageDialog(null, "Treinador alterado com êxito."); 
        }
        
        //atualiza aluno
        if(txtCref1.getText().isEmpty() ) {
            this.controllerCA.atualizarCaracterisica(atualizarCaracteristicasAluno());
            this.controllerCliente.atualizarCliente(atualizarAluno());
            limparCamposEdicao();
            JOptionPane.showMessageDialog(null, "Aluno alterado com êxito."); 
        }
       
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        
        
        if(ValidarParaBuscar()){
            
            
            int input = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir o CPF desejado ?");
        
            if(input == 0 ) {
                // 0=sim, 1=não, 2=cancelar

                String buscarCPF = txtBuscarCPF.getText();
                String buscarMatricula = txtBuscarMatricula.getText();
                this.controller.excluirPessoa(buscarCPF);

                //se true, aluno
                if(txtCref1.getText().isEmpty()){
                    this.controllerCliente.excluirCliente(buscarMatricula);
                    this.controllerCA.excluirCaracterisica(buscarMatricula);
                }
                else {  //se false, treinador
                    this.controllerTreinador.excluirTreinador(buscarMatricula);
                }

                JOptionPane.showMessageDialog(null, "Deletado com êxito.");
            }
        }

    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaActionPerformed
        limparCamposEdicao();
    }//GEN-LAST:event_btnLimparBuscaActionPerformed

    private void btnTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinoActionPerformed

        
        try {
            JFrame frame = new JFrame();
            frame.setContentPane(new ViewCadastroGeral(controller, controllerCliente, controllerTreinador, 
                controllerCA, controllerAparelho, controllerExercicio, controllerSerie).getPanelSerie());
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            frame.pack();

            frame.setLocationRelativeTo(null);

            frame.setSize(1320, 650);
            frame.setTitle("Série FesoFit");

            frame.setVisible(true); 
            frame.setResizable(false);
            
        } catch (IOException ex) {
            Logger.getLogger(ViewCadastroGeral.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnTreinoActionPerformed

    private void btnEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipamentoActionPerformed
        
        try {
            JFrame frame = new JFrame();
            frame.setContentPane(new ViewCadastroGeral(controller, controllerCliente, controllerTreinador, 
                controllerCA, controllerAparelho, controllerExercicio, controllerSerie).getPanelAparelho());
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            frame.pack();

            frame.setLocationRelativeTo(null);

            frame.setSize(1230, 350);
            frame.setTitle("Equipamentos - FesoFit");

            frame.setVisible(true); 
            frame.setResizable(false);
            
        } catch (IOException ex) {
            Logger.getLogger(ViewCadastroGeral.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEquipamentoActionPerformed

    private void btnAtualizarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarExercicioActionPerformed
       
        if(!txtBuscarCPFSerie.getText().isEmpty() && !txtSerieNomeTreinadorAlterar.getText().isEmpty() &&
           !txtSerieExercicioAlterar.getText().isEmpty() && !txtSerieRepeticoesAlterar.getText().isEmpty() &&
           !txtSerieCargaAlterar.getText().isEmpty() && !txtSerieDuracaoAlterar.getText().isEmpty()   ) {
            
            this.controllerExercicio.atualizarExercicio(atualizarExercicio(), txtBuscarCPFSerie.getText());
            limparCamposEdicao();
            JOptionPane.showMessageDialog(null, "Exercício alterado com êxito."); 
        }
        
    }//GEN-LAST:event_btnAtualizarExercicioActionPerformed

    private void btnDeletarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarExercicioActionPerformed
       
        int input = JOptionPane.showConfirmDialog(null, "Você tem que deseja excluir o exercício?");
        
        if(input == 0 ) {
            // 0=sim, 1=não, 2=cancelar

            String buscarCPF = txtBuscarCPFSerie.getText();
            String buscarNomeExercicio = txtSerieExercicioAlterar.getText();

            this.controllerExercicio.excluirExercicio(buscarCPF, buscarNomeExercicio);

            JOptionPane.showMessageDialog(null, "Deletado com êxito.");
            
            DefaultTableModel tableModel = (DefaultTableModel)jTable.getModel();

            tableModel.removeRow(jTable.getSelectedRow());
        }
        
    }//GEN-LAST:event_btnDeletarExercicioActionPerformed

    private void btnBuscarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSerieActionPerformed
        
        String buscarCPF = txtBuscarCPFSerie.getText();

        List<Serie> listaSerie = this.controllerSerie.listarSerie(buscarCPF);

        for(int i=0; i< listaSerie.size(); i++) {      
            txtSerieNomeTreinadorAlterar.setText(listaSerie.get(i).getCREF());
        };
        
        
        List<Exercicio> listaExercicio = this.controllerExercicio.listarExercicios(buscarCPF);
        
        DefaultTableModel tableModel = (DefaultTableModel)jTable.getModel();
        
        Object[] row = new Object[4];
        
        for(int i=0; i< listaExercicio.size(); i++){
            
            row[0] = listaExercicio.get(i).getNome();
            row[1] = listaExercicio.get(i).getQTDRepeticoes();
            row[2] = listaExercicio.get(i).getCarga();
            row[3] = listaExercicio.get(i).getDuracao();
            
            tableModel.addRow(row);
        }
        
        jTable.setModel(tableModel); // place model into JTable
        
    }//GEN-LAST:event_btnBuscarSerieActionPerformed

    private void btnLimparBuscaSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaSerieActionPerformed
      
        limparCamposSerie();
      
    }//GEN-LAST:event_btnLimparBuscaSerieActionPerformed

    private void btnSalvarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarExercicioActionPerformed
        
        if(!txtSerieNomeAluno.getText().isEmpty() && !txtSerieNomeTreinador.getText().isEmpty() ) {
            
            salvarExercicio();
        }
        
    }//GEN-LAST:event_btnSalvarExercicioActionPerformed

    private void btnSalvarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSerieActionPerformed
        
        if(!txtSerieNomeAluno.getText().isEmpty() && !txtSerieNomeTreinador.getText().isEmpty() ) {
            this.controllerSerie.salvarSerie(criarSerie());
            limparCamposEdicao();
            JOptionPane.showMessageDialog(null, "Série cadastrada com êxito."); 
        }
                
    }//GEN-LAST:event_btnSalvarSerieActionPerformed

    private void btnAlterarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSerieActionPerformed
        
        if(!txtBuscarCPFSerie.getText().isEmpty() && !txtSerieNomeTreinadorAlterar.getText().isEmpty() ) {
            this.controllerSerie.atualizarSerie(txtSerieNomeTreinadorAlterar.getText(), txtBuscarCPFSerie.getText());
            limparCamposSerie();
            JOptionPane.showMessageDialog(null, "Série alterada com êxito."); 
        }
    }//GEN-LAST:event_btnAlterarSerieActionPerformed

    private void btnDeletarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarSerieActionPerformed
        
        int input = JOptionPane.showConfirmDialog(null, "Você tem que deseja excluir a série ?");
        
        if(input == 0 ) {
            // 0=sim, 1=não, 2=cancelar

            String buscarCPF = txtBuscarCPFSerie.getText();

            this.controllerSerie.excluirSerie(buscarCPF);
            this.controllerExercicio.excluirExerciciosSerie(buscarCPF);

            JOptionPane.showMessageDialog(null, "Deletado com êxito.");
            limparCamposSerie();

            DefaultTableModel tableModel = (DefaultTableModel)jTable.getModel();
            tableModel.setRowCount(0);
        }
        
    }//GEN-LAST:event_btnDeletarSerieActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        
        
        //BANCO
        String buscarCPF = txtBuscarCPFSerie.getText();
        List<Exercicio> listaExercicio = this.controllerExercicio.listarExercicios(buscarCPF);
        Object[] row = new Object[4];
        
        
        //TABELA
        DefaultTableModel tableModel = (DefaultTableModel)jTable.getModel();
        jTable.getSelectedRow();
        
        String selectedData = null;
        int[] selectedRow = jTable.getSelectedRows();
        int[] selectedColumns = jTable.getSelectedColumns();

        for (int i = 0; i < selectedRow.length; i++) {
          
            for (int j = 0; j < selectedColumns.length; j++) {
              selectedData = (String) jTable.getValueAt(selectedRow[i], selectedColumns[j]);
            }
          
            for(int k = 0; k < listaExercicio.size(); k++){
            
                txtSerieExercicioAlterar.setText(listaExercicio.get(k).getNome());
                txtSerieRepeticoesAlterar.setText(listaExercicio.get(k).getQTDRepeticoes());
                txtSerieCargaAlterar.setText(listaExercicio.get(k).getCarga());
                txtSerieDuracaoAlterar.setText(listaExercicio.get(k).getDuracao());

               
            }          
        }
        
        
        
    }//GEN-LAST:event_jTableMouseClicked

    private void btnSalvarAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAparelhoActionPerformed
        
        if(!txtNomeAparelho.getText().isEmpty() && !txtEstadoAparelho.getText().isEmpty() ) {
            salvarAparelho();
        }
        
    }//GEN-LAST:event_btnSalvarAparelhoActionPerformed

    private void btnAlterarAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAparelhoActionPerformed
       
        if(!txtBuscarAparelho.getText().isEmpty() ) {
            
            this.controllerAparelho.atualizarAparelho(atualizarAparelho(), txtBuscarAparelho.getText());
            
            txtNomeAparelhoAlterar.setText(""); 
            txtEstadoAparelhoAlterar.setText("");
            
            JOptionPane.showMessageDialog(null, "Aparelho alterado com êxito."); 
        }
        
    }//GEN-LAST:event_btnAlterarAparelhoActionPerformed

    private void btnDeletarAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarAparelhoActionPerformed
        
        int input = JOptionPane.showConfirmDialog(null, "Você tem que deseja excluir o aparelho ?");
        
        if(input == 0 ) {
            // 0=sim, 1=não, 2=cancelar

            String buscarAparelho = txtBuscarAparelho.getText();

            this.controllerAparelho.excluirAparelho(buscarAparelho);

            JOptionPane.showMessageDialog(null, "Deletado com êxito.");
            
        }
        
        
    }//GEN-LAST:event_btnDeletarAparelhoActionPerformed

    private void btnBuscarAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAparelhoActionPerformed
        
        String buscarAparelho = txtBuscarAparelho.getText();

        List<Aparelhos> listaAparelho = this.controllerAparelho.listarAparelhos(buscarAparelho);

        for(int i=0; i< listaAparelho.size(); i++) {      
            txtNomeAparelhoAlterar.setText(listaAparelho.get(i).getNome());
            txtEstadoAparelhoAlterar.setText(listaAparelho.get(i).getEstado());
        };
        
    }//GEN-LAST:event_btnBuscarAparelhoActionPerformed

    private void btnLimparBuscaAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaAparelhoActionPerformed
        
        txtNomeAparelhoAlterar.setText("");
        txtEstadoAparelhoAlterar.setText("");
    }//GEN-LAST:event_btnLimparBuscaAparelhoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public  void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Native".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        this.setVisible(true);
    }
    
    
    //VALIDAR CAMPOS CADASTRO
    private boolean ValidarCampos(){
        
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Nome.");
            return false;
        }
        if(txtEndereco.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Endereço.");
            return false;
        }
        if(txtTelefone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Telefone.");
            return false;
        }
        if(radioButtonMasculino.isSelected() == false && radioButtonFeminino.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Por favor Selecione o Sexo.");
            return false;
        }
        if(txtDataNascimento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha a Data de Nascimento.");
            return false;
        }
        if(txtDataMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha a Data de Matrícula.");
            return false;
        }
        if(txtStatusMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Status da Matrícula.");
            return false;
        }
        if(txtCPF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o CPF.");
            return false;
        }
     
        return true;
    }
    private boolean ValidarCamposAluno(){
        

        if(txtMensalidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Valor da Mensalidade.");
            return false;
        }
        if(txtPeso.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor preencha o Peso.");
                return false;
        }
        if(txtAltura.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha a Altura.");
            return false;
        }
        if(txtGordura.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Percentual de Gordura.");
            return false;
        }
        if(txtDataMedicao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha a Data da Medição.");
            return false;
        }

        return true;
    }
    private boolean ValidarCamposTreinador(){
        
        if(txtCREF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o CREF.");
            return false;
        }
        return true;
    }
    
    //VALIDAR CAMPOS ALTERAÇÃO
    private boolean ValidarCamposAlterar(){
        
        if(txtNome1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Nome.");
            return false;
        }
        if(txtEndereco1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Endereço.");
            return false;
        }
        if(txtTelefone1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Telefone.");
            return false;
        }
        if(radioButtonMasculino1.isSelected() == false && radioButtonFeminino1.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Por favor Selecione o Sexo.");
            return false;
        }
        if(txtDataNascimento1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha a Data de Nascimento.");
            return false;
        }
        if(txtDataMatricula1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha a Data de Matrícula.");
            return false;
        }
        if(txtStatusMatricula1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Status da Matrícula.");
            return false;
        }
        if(txtBuscarCPF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o CPF.");
            return false;
        }
     
        return true;
    }
    private boolean ValidarCamposAlunoAlterar(){
        

        if(txtMensalidade1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Valor da Mensalidade.");
            return false;
        }
        if(txtPeso1.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor preencha o Peso.");
                return false;
        }
        if(txtAltura1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha a Altura.");
            return false;
        }
        if(txtGordura1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Percentual de Gordura.");
            return false;
        }
        if(txtDataMedicao1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha a Data da Medição.");
            return false;
        }

        return true;
    }
    private boolean ValidarCamposTreinadorAlterar(){
        
        if(txtCref1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o CREF.");
            return false;
        }
        return true;
    }
    private boolean ValidarParaBuscar(){
        
        if(txtBuscarCPF.getText().isEmpty() && txtBuscarMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha os campos para buscar.");
            return false;
        }
        if(txtBuscarCPF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o CPF para buscar.");
            return false;
        }
        if(txtBuscarMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha o Número de matrícula para buscar.");
            return false;
        }
        
        return true;
    }
    
    //CRIAR
    private Pessoa criar() {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setCPF(txtCPF.getText());
        pessoa.setNome(txtNome.getText());
        pessoa.setEndereco(txtEndereco.getText());
        pessoa.setTelefone(txtTelefone.getText());
                
        if(radioButtonMasculino.isSelected()){
            pessoa.setSexo(radioButtonMasculino.getText());
        }else {
            pessoa.setSexo(radioButtonFeminino.getText());
        }

        pessoa.setDataNascimento(txtDataNascimento.getText());
        return pessoa;
    }
    private Cliente criarAluno() {
        
        Cliente cliente = new Cliente();
        
        cliente.setMensalidade(Float.parseFloat(txtMensalidade.getText()));
        cliente.setDataMatricula(txtDataMatricula.getText());
        cliente.setStatusMatricula( Integer.parseInt(txtStatusMatricula.getText()) );
        return cliente;
    }
    private CaracteristicaAluno criarCaracteristicasAluno() {
        
        CaracteristicaAluno caracteristica = new CaracteristicaAluno();
        caracteristica.setPeso(txtPeso.getText());
        caracteristica.setAltura(txtAltura.getText());
        caracteristica.setPercentualGordura(txtGordura.getText());
        caracteristica.setDataMedicao(txtDataMedicao.getText());
        return caracteristica;
    }
    private Treinador criarTreinador() {
        
        Treinador treinador = new Treinador();
        
        treinador.setCref(txtCREF.getText());
        treinador.setDataMatricula(txtDataMatricula.getText());
        treinador.setStatusMatricula( Integer.parseInt(txtStatusMatricula.getText()) );
        return treinador;
    }
    private Serie criarSerie() {
        
        Serie serie = new Serie();
        
        serie.setCPFAluno(txtSerieNomeAluno.getText());
        serie.setCREF(txtSerieNomeTreinador.getText());
        return serie;
    }
    private Exercicio criarExercicio() {
        
        Exercicio exercicio = new Exercicio();
        
        exercicio.setNome(txtSerieExercicio.getText());
        exercicio.setQTDRepeticoes(txtSerieRepeticoes.getText());
        exercicio.setCarga(txtSerieCarga.getText());
        exercicio.setDuracao(txtSerieDuracao.getText());
        return exercicio;
    }
    private Aparelhos criarAparelho() {
        Aparelhos aparelho = new Aparelhos();
        aparelho.setNome(txtNomeAparelho.getText());
        aparelho.setEstado(txtEstadoAparelho.getText());
        return aparelho;
    }
    
    //ATUALIZAR
    private Pessoa atualizar() {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setCPF(txtCPF.getText());
        pessoa.setNome(txtNome1.getText());
        pessoa.setEndereco(txtEndereco1.getText());
        pessoa.setTelefone(txtTelefone1.getText());
                
        if(radioButtonMasculino1.isSelected()){
            pessoa.setSexo(radioButtonMasculino1.getText());
        }else {
            pessoa.setSexo(radioButtonFeminino1.getText());
        }

        pessoa.setDataNascimento(txtDataNascimento1.getText());
        return pessoa;
    }
    private Cliente atualizarAluno() {
        
        Cliente cliente = new Cliente();
        
        cliente.setMensalidade(Float.parseFloat(txtMensalidade1.getText()));
        cliente.setDataMatricula(txtDataMatricula1.getText());
        cliente.setStatusMatricula( Integer.parseInt(txtStatusMatricula1.getText()) );
        return cliente;
    }
    private CaracteristicaAluno atualizarCaracteristicasAluno() {
        
        CaracteristicaAluno caracteristica = new CaracteristicaAluno();
        caracteristica.setPeso(txtPeso1.getText());
        caracteristica.setAltura(txtAltura1.getText());
        caracteristica.setPercentualGordura(txtGordura1.getText());
        caracteristica.setDataMedicao(txtDataMedicao1.getText());
        return caracteristica;
    }
    private Treinador atualizarTreinador() {
        
        Treinador treinador = new Treinador();
        
        treinador.setCref(txtCref1.getText());
        treinador.setDataMatricula(txtDataMatricula1.getText());
        treinador.setStatusMatricula(Integer.parseInt(txtStatusMatricula1.getText()));
        return treinador;
    }
    private Serie atualizarSerie() {
        
        Serie serie = new Serie();  
        serie.setCPFAluno(txtSerieNomeAluno.getText());
        serie.setCREF(txtSerieNomeTreinador.getText());
        return serie;
    }
    private Exercicio atualizarExercicio() {
        
        Exercicio exercicio = new Exercicio();
        
        exercicio.setNome(txtSerieExercicioAlterar.getText());
        exercicio.setQTDRepeticoes(txtSerieRepeticoesAlterar.getText());
        exercicio.setCarga(txtSerieCargaAlterar.getText());
        exercicio.setDuracao(txtSerieDuracaoAlterar.getText());
        return exercicio;
    }
    private Aparelhos atualizarAparelho() {
        
        Aparelhos aparelho = new Aparelhos();
        aparelho.setNome(txtSerieExercicioAlterar.getText());
        aparelho.setEstado(txtEstadoAparelhoAlterar.getText());
        return aparelho;
    }
 
    //CADASTRAR
    private void salvarAluno() {
       
        if(this.controller.salvarPessoa(criar()) ){

           if(this.controllerCliente.salvarCliente(criarAluno()) ){

               salvarCaracteristicas();

           } else { JOptionPane.showMessageDialog(null, "Erro. Aluno já cadastrado."); }  

       } else { JOptionPane.showMessageDialog(null, "Erro. Pessoa (Aluno) já cadastrada."); }

        
    }
    private void salvarCaracteristicas(){
        
        if(this.controllerCA.salvarCaracteristica(criarCaracteristicasAluno()) ){
            
            JOptionPane.showMessageDialog(null, "Aluno registrado com êxito");
            
            limparCamposCadastro();
        }
        else { JOptionPane.showMessageDialog(null, "Erro ao registrar."); limparCamposCadastro(); }
    }
    private void salvarTreinador() {
   
        if(this.controller.salvarPessoa(criar())){

            if(this.controllerTreinador.salvarTreinador(criarTreinador()) ) {

                limparCamposCadastro();
                JOptionPane.showMessageDialog(null, "Treinador registrado com êxito");

            } else { JOptionPane.showMessageDialog(null, "Erro. Treinador já cadastrado."); }  

        } else { JOptionPane.showMessageDialog(null, "Erro. Pessoa (Treinador) já cadastrada."); }

        
    }
    private void salvarSerie() {
   
        if(this.controllerSerie.salvarSerie(criarSerie())){

            limparCamposCadastro();
            JOptionPane.showMessageDialog(null, "Série registrada com êxito");

        } else { JOptionPane.showMessageDialog(null, "Erro. (Série) já cadastrada."); }

    }
    private void salvarExercicio() {
   
        if(this.controllerExercicio.salvarExercicio(criarExercicio(), txtSerieNomeAluno.getText(), txtSerieNomeTreinador.getText()) ){

            txtSerieExercicio.setText("");
            txtSerieDuracao.setText("");
            txtSerieRepeticoes.setText("");
            txtSerieCarga.setText("");
            JOptionPane.showMessageDialog(null, "Exercício registrado com êxito");

        } else { JOptionPane.showMessageDialog(null, "Erro. (Exercício) já cadastrado."); }

    }
    private void salvarAparelho() {
        
        if(this.controllerAparelho.salvarAparelho(criarAparelho()) ){

            txtNomeAparelhoAlterar.setText("");
            txtEstadoAparelhoAlterar.setText("");
            JOptionPane.showMessageDialog(null, "Aparelho registrado com êxito");

        } else { JOptionPane.showMessageDialog(null, "Erro. (Aparelho) já cadastrado."); }
    }

    //LIMPAR
    private void limparCamposCadastro(){
        
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtDataNascimento.setText("");
        txtDataMatricula.setText("");
        txtCPF.setText("");
        txtStatusMatricula.setText("");
        buttonGroup2.clearSelection();
        radioButtonFeminino.setSelected(false);
        radioButtonMasculino.setSelected(false);
        txtAltura.setText("");
        txtPeso.setText("");
        txtGordura.setText("");
        txtMensalidade.setText("");
        txtDataMedicao.setText("");
    }
    private void limparCamposEdicao(){
        txtNome1.setText("");
        txtEndereco1.setText("");
        txtTelefone1.setText("");
        txtDataNascimento1.setText("");
        txtDataMatricula1.setText("");
        txtBuscarCPF.setText("");
        txtStatusMatricula1.setText("");
        buttonGroup1.clearSelection();
        radioButtonFeminino1.setSelected(false);
        radioButtonMasculino1.setSelected(false);
        txtAltura1.setText("");
        txtPeso1.setText("");
        txtGordura1.setText("");
        txtMensalidade1.setText("");
        txtDataMedicao1.setText("");
        txtBuscarMatricula.setText("");
    }
    private void limparCamposSerie() {
        
        txtBuscarCPFSerie.setText("");
        txtSerieExercicioAlterar.setText("");
        txtSerieRepeticoesAlterar.setText("");
        txtSerieCargaAlterar.setText("");
        txtSerieDuracaoAlterar.setText("");
    }
    
    
    //EXIBIR PAINEL
    public JPanel getPanelCadastro() {
        return PnlCadastro;
    }
    public JPanel getPanelSerie(){
        return panelSerie;
    }
    public JPanel getPanelAparelho(){
        return panelAparelho;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelConsulta;
    private javax.swing.JPanel PanelConsulta1;
    private javax.swing.JPanel PanelConsulta2;
    private javax.swing.JPanel PnlCadastro;
    private javax.swing.JButton btnAlterarAparelho;
    private javax.swing.JButton btnAlterarSerie;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnAtualizarExercicio;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarAparelho;
    private javax.swing.JButton btnBuscarSerie;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletarAparelho;
    private javax.swing.JButton btnDeletarExercicio;
    private javax.swing.JButton btnDeletarSerie;
    private javax.swing.JButton btnEquipamento;
    private javax.swing.JButton btnLimparBusca;
    private javax.swing.JButton btnLimparBuscaAparelho;
    private javax.swing.JButton btnLimparBuscaSerie;
    private javax.swing.JButton btnSalvarAluno;
    private javax.swing.JButton btnSalvarAparelho;
    private javax.swing.JButton btnSalvarExercicio;
    private javax.swing.JButton btnSalvarSerie;
    private javax.swing.JButton btnTreino;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable;
    private javax.swing.JPanel panelAparelho;
    private javax.swing.JPanel panelSerie;
    private javax.swing.JRadioButton radioButtonFeminino;
    public javax.swing.JRadioButton radioButtonFeminino1;
    private javax.swing.JRadioButton radioButtonMasculino;
    public javax.swing.JRadioButton radioButtonMasculino1;
    private javax.swing.JTextField txtAltura;
    public javax.swing.JTextField txtAltura1;
    private javax.swing.JTextField txtBuscarAparelho;
    private javax.swing.JTextField txtBuscarCPF;
    private javax.swing.JTextField txtBuscarCPFSerie;
    private javax.swing.JTextField txtBuscarMatricula;
    private javax.swing.JTextField txtCPF;
    public javax.swing.JTextField txtCREF;
    public javax.swing.JTextField txtCref1;
    private javax.swing.JTextField txtDataMatricula;
    public javax.swing.JTextField txtDataMatricula1;
    private javax.swing.JTextField txtDataMedicao;
    public javax.swing.JTextField txtDataMedicao1;
    private javax.swing.JTextField txtDataNascimento;
    public javax.swing.JTextField txtDataNascimento1;
    private javax.swing.JTextField txtEndereco;
    public javax.swing.JTextField txtEndereco1;
    private javax.swing.JTextField txtEstadoAparelho;
    private javax.swing.JTextField txtEstadoAparelhoAlterar;
    private javax.swing.JTextField txtGordura;
    public javax.swing.JTextField txtGordura1;
    private javax.swing.JTextField txtMensalidade;
    public javax.swing.JTextField txtMensalidade1;
    private javax.swing.JTextField txtNome;
    public javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNomeAparelho;
    private javax.swing.JTextField txtNomeAparelhoAlterar;
    private javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtPeso1;
    private javax.swing.JTextField txtSerieCarga;
    private javax.swing.JTextField txtSerieCargaAlterar;
    private javax.swing.JTextField txtSerieDuracao;
    private javax.swing.JTextField txtSerieDuracaoAlterar;
    private javax.swing.JTextField txtSerieExercicio;
    private javax.swing.JTextField txtSerieExercicioAlterar;
    private javax.swing.JTextField txtSerieNomeAluno;
    private javax.swing.JTextField txtSerieNomeTreinador;
    private javax.swing.JTextField txtSerieNomeTreinadorAlterar;
    private javax.swing.JTextField txtSerieRepeticoes;
    private javax.swing.JTextField txtSerieRepeticoesAlterar;
    private javax.swing.JTextField txtStatusMatricula;
    public javax.swing.JTextField txtStatusMatricula1;
    private javax.swing.JTextField txtTelefone;
    public javax.swing.JTextField txtTelefone1;
    // End of variables declaration//GEN-END:variables
}
