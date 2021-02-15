create database db_farmacia_do_bem;

use db_farmacia_do_bem;


create table tb_categoria(
id bigint auto_increment,
descricao varchar(255),
ativo boolean not null,
primary key(id)
); 
select * from tb_categoria;

insert tb_categoria (descricao , ativo) values ("Medicamentos", true);
insert tb_categoria (descricao , ativo) values ("Medicamentos Genericos", true);
insert tb_categoria (descricao , ativo) values ("Vitaminas", true);
insert tb_categoria (descricao , ativo) values ("Higiene", true);
insert tb_categoria (descricao , ativo) values ("Beleza", true);
-- remedio genericos vitaminas 

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
quantidade bigint not null,
preco decimal not null,
produto_id bigint,

primary key(id),
foreign key (produto_id) references tb_categoria(id)
);
select * from tb_produto;

insert tb_produto(nome, quantidade, preco, produto_id) values ("Tandrilax", 1 , 11.49, 1);
insert tb_produto(nome, quantidade, preco, produto_id) values ("Revange", 1 , 73.49, 1);
insert tb_produto(nome, quantidade, preco, produto_id) values ("Acetilcisteína", 1 , 26.09, 2);
insert tb_produto(nome, quantidade, preco, produto_id) values ("Centrum", 2 , 40.70, 3);
insert tb_produto(nome, quantidade, preco, produto_id) values ("Enxaguante Bucal", 3 , 14.49, 4);
insert tb_produto(nome, quantidade, preco, produto_id) values ("Escova Dental", 4 , 25.99, 4);
insert tb_produto(nome, quantidade, preco, produto_id) values ("Máscara de Tratamento", 1 , 13.99, 5);
insert tb_produto(nome, quantidade, preco, produto_id) values ("Desodorante", 1 , 9.99, 4);


select nome, preco from tb_produto where preco > 50 ;

select nome, preco from tb_produto where preco between 3 and 60;

select nome from tb_produto where nome like "%B%";

select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.produto_id;

select tb_categoria.descricao, tb_produto.nome from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.produto_id
where tb_produto.produto_id = 4;




