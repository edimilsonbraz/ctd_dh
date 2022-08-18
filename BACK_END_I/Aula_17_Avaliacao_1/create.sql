create table if not exists filial (
    id int auto_increment primary key,
    nome varchar(255),
    rua varchar(255),
    numero varchar(255),
    cidade varchar(255),
    estado varchar(255),
    is5Estrelas BIT
);