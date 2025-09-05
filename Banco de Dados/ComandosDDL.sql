-- DDL para o projeto do pergio

CREATE SCHEMA industria_sergio;

SET search_path TO industria_sergio;


CREATE TABLE industria_sergio.estoque(
	id_estoque INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	quantidade INT NOT NULL
);

CREATE TABLE industria_sergio.fornecedor(
	id_fornecedor INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	nome TEXT NOT NULL,
	endereco TEXT NULL,
	telefone TEXT NOT NULL,
	email TEXT NOT NULL
);

CREATE TABLE industria_sergio.cliente(
	id_client
);