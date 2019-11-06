CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo BOOLEAN NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo) values ('João Silva', true);
INSERT INTO pessoa (nome, ativo) values ('Maria Rita', true);
INSERT INTO pessoa (nome, ativo) values ('Pedro Santos', true);
INSERT INTO pessoa (nome, ativo) values ('Ricardo Pereira', true);
INSERT INTO pessoa (nome, ativo) values ('Josué Mariano', true);
INSERT INTO pessoa (nome, ativo) values ('Pedro Barbosa', true);
INSERT INTO pessoa (nome, ativo) values ('Henrique Medeiros', true);
INSERT INTO pessoa (nome, ativo) values ('Carlos Santana',  true);
INSERT INTO pessoa (nome, ativo) values ('Leonardo Oliveira', true);
INSERT INTO pessoa (nome, ativo) values ('Isabela Martins', true);
