CREATE DATABASE IF NOT EXISTS 
  foodfy;
USE foodfy;

CREATE TABLE IF NOT EXISTS products (
  id INT(11) AUTO_INCREMENT,
  name VARCHAR(255),
  price DECIMAL(10, 2),
  PRIMARY KEY (id)
);

INSERT INTO products 
VALUE(0, 'Pizza', 59);
INSERT INTO products 
VALUE(0, 'Bolo', 29);
