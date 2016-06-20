CREATE TABLE `tb_relatorio_processamento` (
  `id_processamento` int(11) NOT NULL AUTO_INCREMENT,
  `valor` float NOT NULL,
  `van` varchar(255) NOT NULL,
  `qtd_transacoes` int(11) NOT NULL,
  `dt_process` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_processamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `tb_transacao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `estabelecimento` varchar(255) NOT NULL,
  `valor` float NOT NULL,
  `van` varchar(255) NOT NULL,
  `tipo` varchar(255) NOT NULL,
  `t_status` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;


INSERT INTO `captura`.`tb_relatorio_processamento`
(`id_processamento`,
`valor`,
`van`,
`qtd_transacoes`,
`dt_process`)
VALUES
(<{id_processamento: }>,
<{valor: }>,
<{van: }>,
<{qtd_transacoes: }>,
<{dt_process: }>);

INSERT INTO `captura`.`tb_relatorio_processamento`
(`id_processamento`,
`valor`,
`van`,
`qtd_transacoes`,
`dt_process`)
VALUES
(<{id_processamento: }>,
<{valor: }>,
<{van: }>,
<{qtd_transacoes: }>,
<{dt_process: }>);

