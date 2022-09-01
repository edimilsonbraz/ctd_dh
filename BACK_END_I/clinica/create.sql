CREATE TABLE IF NOT EXISTS dentista(
id int auto_increment primary key,
nome varchar(255),
sobrenome varchar(255),
matricula varchar(255)
);

CREATE TABLE IF NOT EXISTS paciente(
id int auto_increment primary key,
nome varchar(255),
sobrenome varchar(255),
endereco varchar(255),
rg varchar(255),
dataAlta DATE
);