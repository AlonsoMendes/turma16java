-- cria um bando de dados
create database db_servico_rh;

-- acessa o banco de dados
use db_servico_rh;

-- criação de tabela
create table tb_funcionarios(
id bigint auto_increment, -- faz o id automaticamente
nome varchar(255) not null, -- not null obriga a informação
idade int not null,
salario float not null,
setor varchar(20) not null,
ativo boolean,
primary key(id)
);

select * from tb_funcionarios;

select nome, salario from  tb_funcionarios where salario > 2000;
select nome, salario from  tb_funcionarios where salario < 2000;

insert into tb_funcionarios (nome,idade,salario,setor) values ("Alonso",26,3999,"Desenvolvimento");
insert into tb_funcionarios (nome,idade,salario,setor) values ("Giovana",20,5000,"Pesquisa");
insert into tb_funcionarios (nome,idade,salario,setor) values ("Maria",35,1800,"Administração");
insert into tb_funcionarios (nome,idade,salario,setor) values ("Luiz",56,1999,"RH");
insert into tb_funcionarios (nome,idade,salario,setor) values ("Fatima",55,2001,"Administração");

update tb_funcionarios set salario = 2001 where id = 3;



