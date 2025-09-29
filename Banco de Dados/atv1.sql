CREATE DATABASE SENAI_DS;
USE SENAI_DS;

CREATE TABLE clientes (
	id INT	AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (100),
    email VARCHAR (100),
    telefone VARCHAR (20)
);

CREATE USER 'administrador'@'localhost' identified by '12345';
CREATE USER 'analista'@'localhost' identified by '123456';
CREATE USER 'editor'@'localhost' identified by '1234567';

GRANT ALL PRIVILEGES ON * . * TO 'administrador'@'localhost';
GRANT SELECT ON * . * TO 'analista'@'localhost';
GRANT INSERT, UPDATE ON * . * TO 'editor'@'localhost';

FLUSH PRIVILEGES;
SELECT * FROM clientes;