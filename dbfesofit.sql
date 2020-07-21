-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21-Jul-2020 às 05:16
-- Versão do servidor: 10.4.13-MariaDB
-- versão do PHP: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dbfesofit`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aparelhos`
--

CREATE TABLE `aparelhos` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `estado` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `aparelhos`
--

INSERT INTO `aparelhos` (`codigo`, `nome`, `estado`) VALUES
(3, 'matar', 'vergonhoso');

-- --------------------------------------------------------

--
-- Estrutura da tabela `caracteristica`
--

CREATE TABLE `caracteristica` (
  `id` int(11) NOT NULL,
  `peso` varchar(250) NOT NULL,
  `altura` varchar(250) NOT NULL,
  `percentual_gordura` varchar(250) NOT NULL,
  `data_medicao` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `matricula` int(11) NOT NULL,
  `mensalidade` float(10,2) NOT NULL,
  `data_matricula` varchar(250) NOT NULL,
  `status_matricula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `exercicio`
--

CREATE TABLE `exercicio` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `qtd_repeticoes` varchar(250) NOT NULL,
  `carga` varchar(250) NOT NULL,
  `duracao` varchar(250) NOT NULL,
  `aluno` varchar(250) NOT NULL,
  `cref` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `exercicio`
--

INSERT INTO `exercicio` (`id`, `nome`, `qtd_repeticoes`, `carga`, `duracao`, `aluno`, `cref`) VALUES
(1, 'remador', 'vai viado', '21323', 'oi', '17927364790', '123456');

-- --------------------------------------------------------

--
-- Estrutura da tabela `mensalidade`
--

CREATE TABLE `mensalidade` (
  `id` int(11) NOT NULL,
  `valor_pago` float(10,2) NOT NULL,
  `data_vencimento` date NOT NULL,
  `data_pagamento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `id` int(11) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `endereco` varchar(250) NOT NULL,
  `telefone` varchar(250) NOT NULL,
  `sexo` varchar(250) NOT NULL,
  `data_nascimento` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`id`, `cpf`, `nome`, `endereco`, `telefone`, `sexo`, `data_nascimento`) VALUES
(1, '17927364790', 'daniel', 'rua teste', '21991943672', 'Masculino', '20/07/2020');

-- --------------------------------------------------------

--
-- Estrutura da tabela `serie`
--

CREATE TABLE `serie` (
  `id` int(11) NOT NULL,
  `nome_aluno` varchar(250) NOT NULL,
  `cref` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `serie`
--

INSERT INTO `serie` (`id`, `nome_aluno`, `cref`) VALUES
(6, '17927364790', 123456);

-- --------------------------------------------------------

--
-- Estrutura da tabela `treinador`
--

CREATE TABLE `treinador` (
  `id` int(11) NOT NULL,
  `cref` varchar(11) NOT NULL,
  `data_matricula` varchar(250) NOT NULL,
  `status_matricula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `treinador`
--

INSERT INTO `treinador` (`id`, `cref`, `data_matricula`, `status_matricula`) VALUES
(1, '123456565', '20/07/2020', 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aparelhos`
--
ALTER TABLE `aparelhos`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `caracteristica`
--
ALTER TABLE `caracteristica`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`matricula`);

--
-- Índices para tabela `exercicio`
--
ALTER TABLE `exercicio`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `mensalidade`
--
ALTER TABLE `mensalidade`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `serie`
--
ALTER TABLE `serie`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `treinador`
--
ALTER TABLE `treinador`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `aparelhos`
--
ALTER TABLE `aparelhos`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `caracteristica`
--
ALTER TABLE `caracteristica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `matricula` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `exercicio`
--
ALTER TABLE `exercicio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `mensalidade`
--
ALTER TABLE `mensalidade`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `serie`
--
ALTER TABLE `serie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `treinador`
--
ALTER TABLE `treinador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
