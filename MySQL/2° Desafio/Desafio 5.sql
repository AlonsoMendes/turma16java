create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

-- tabelas tb_produto e tb_categoria.

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, ativo) values ("Material para Construção",true);
insert tb_categoria (descricao, ativo) values ("Piso e Revestimento",true);
insert tb_categoria (descricao, ativo) values ("Tintas",true);
insert tb_categoria (descricao, ativo) values ("Decoração",true);
insert tb_categoria (descricao, ativo) values ("Cozinha",true);


select * from tb_categoria;

create table tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal not null,
quantidade int not null,
categoria_id bigint,

primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Argamassa",26.90,5000,1);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Cimento",40.00,4000,1);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Piso Cerâmica",41.52,11000,2);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Piso Porcelanato",30.00,10500,2);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Tinta esmalte",46.80,10000,3);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Tinta Acrilica",129.90,1000,3);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Argila Expandida",47.9,10000,4);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Bloco de Vidro Incolor",18.00,9000,4);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Armário",1184.20,50,5);

select * from tb_produtos;

select * from tb_produtos where preco > 50;

select * from tb_produtos where preco between 3 and 60;

select * from tb_produtos where nome like "%C%";

select * from tb_categoria inner join tb_produtos on tb_categoria.id = tb_produtos.categoria_id;

select tb_categoria.descricao, tb_produtos.nome from tb_categoria inner join tb_produtos on tb_categoria.id = tb_produtos.categoria_id
where tb_produtos.categoria_id = 2;
