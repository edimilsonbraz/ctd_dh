CREATE DATABASE spotify;

USE spotify;

CREATE TABLE usuario (
idUsuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nomeusuario VARCHAR(45),
data_nasc DATE,
sexo VARCHAR(1),
email VARCHAR(150),
senha VARCHAR(45)
);

CREATE TABLE playlist (
idPlaylist INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
idUsuario INT(11),
titulo VARCHAR(45),
qtdcancoes INT(11),
datacriacao DATETIME,
CONSTRAINT fk_idUsuario
FOREIGN KEY (idUsuario)
REFERENCES usuario(idUsuario)
);

CREATE TABLE artista (
idArtista INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(45),
sobrenome VARCHAR(100)
);

CREATE TABLE album (
idAlbum INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
titulo VARCHAR(45),
idArtista INT(11),
CONSTRAINT fk_idArtista
FOREIGN KEY (idArtista)
REFERENCES artista(idArtista)
);

CREATE TABLE cancoes (
idCancao INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
titulo VARCHAR(45),
duracao DOUBLE,
qtdreproducao INT(11),
qtdlikes INT(11),
idAlbum INT(11),
CONSTRAINT fk_idAlbum
FOREIGN KEY (idAlbum)
REFERENCES album(idAlbum)
);

CREATE TABLE playlist_cancao (
idPlaylist_cancao INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
idCancao INT(11),
idPlaylist INT(11),
CONSTRAINT fk_idCancao
FOREIGN KEY (idCancao)
REFERENCES cancoes(idCancao),
CONSTRAINT fk_idPlaylist
FOREIGN KEY (idPlaylist)
REFERENCES playlist(idPlaylist)
);

CREATE TABLE genero (
idGenero INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
genero VARCHAR(45)
);

CREATE TABLE generocancao (
	idGeneroCancao INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    idCancao INT,
    idGenero INT,
    CONSTRAINT fk_generocancao_cancao
    FOREIGN KEY (idCancao)
    REFERENCES cancoes(idCancao),
	CONSTRAINT fk_generocancao_genero
    FOREIGN KEY (idGenero)
    REFERENCES genero(idGenero)
);

SELECT * FROM cancoes;

INSERT INTO usuario (nomeusuario, data_nasc, sexo, email, senha) 
VALUES ("Edimilson", "07031984", "M", "edimilson@gmail.com", "102030");

INSERT INTO usuario (nomeusuario, data_nasc, sexo, email, senha) 
VALUES ("Talita", "1992-03-04", "F", "talita@gmail.com", "123456");

INSERT INTO usuario (nomeusuario, data_nasc, sexo, email, senha) 
VALUES ("Daniel", "1984-10-04", "M", "daniel@gmail.com", "358785");

INSERT INTO artista (nome, sobrenome)
VALUES ("Manoel", "Gomes");

INSERT INTO artista (nome, sobrenome)
VALUES ("Frankito", "Lopes");

INSERT INTO artista (nome, sobrenome)
VALUES ("Reginaldo", "Rossi");

INSERT INTO album (titulo, idArtista)
VALUES ("Caneta Azul", 1);

INSERT INTO album (titulo, idArtista)
VALUES ("Indio Apaixonado", 2);

INSERT INTO album (titulo, idArtista)
VALUES ("Garçon", 3);

INSERT INTO cancoes (titulo, duracao, qtdreproducao, qtdlikes, idAlbum)
VALUES ("azul", "5000", "40", "500", 1);

INSERT INTO cancoes (titulo, duracao, qtdreproducao, qtdlikes, idAlbum)
VALUES ("Rei dos Bregueiros", "5000", "520", "1500", 2);

INSERT INTO cancoes (titulo, duracao, qtdreproducao, qtdlikes, idAlbum)
VALUES ("Leviana", "4000", "400", "7800", 3);


