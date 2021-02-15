create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, ativo) values ("Bovino",true);
insert tb_categoria (descricao, ativo) values ("Suino",true);
insert tb_categoria (descricao, ativo) values ("Aves",true);
insert tb_categoria (descricao, ativo) values ("Peixe",true);
insert tb_categoria (descricao, ativo) values ("Outros",true);


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

insert tb_produtos (nome, preco, quantidade, categoria_id) values ("ASA",40.00,30,3);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Picanha",20.00,30,1);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Coxa de frango",20.00,30,3);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Bacon",30.00,30,2);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Sal",60.00,30,5);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Cupim",20.00,30,1);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Peito de frango",25.00,30,3);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Pescada",20.00,30,4);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("Alho",18.00,30,5);


select * from tb_produtos where preco > 50;

select * from tb_produtos where preco between 3 and 60;

select * from tb_produtos where nome like "%C%";

select * from tb_categoria inner join tb_produtos on tb_categoria.id = tb_produtos.categoria_id;

select tb_categoria.descricao, tb_produtos.nome from tb_categoria inner join tb_produtos on tb_categoria.id = tb_produtos.categoria_id
where tb_produtos.categoria_id = 3;
