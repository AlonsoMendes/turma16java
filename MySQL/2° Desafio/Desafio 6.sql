create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, ativo) values ("MOBILE",true);
insert tb_categoria (descricao, ativo) values ("PROGRAMAÇÃO",true);
insert tb_categoria (descricao, ativo) values ("DEVOPS ",true);
insert tb_categoria (descricao, ativo) values ("DATA SCIENCE ",true);
insert tb_categoria (descricao, ativo) values ("DESIGN & UX",true);

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

insert tb_produtos (nome, preco, quantidade, categoria_id) values ("KOTLIN",19.00,5000,1);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("ANDROID",25.00,4000,1);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("JAVA",40.00,11000,2);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("PYTHON",30.00,10500,2);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("SEGURANÇA",18.50,10000,3);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("LINUX",9.90,1000,3);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("MYSQL",50.50,10000,4);
insert tb_produtos (nome, preco, quantidade, categoria_id) values ("PHOTOSHOP",14.20,10000,5);

select * from tb_produtos;

select * from tb_produtos;

select * from tb_produtos where preco > 50;

select * from tb_produtos where preco between 3 and 60;

select * from tb_produtos where nome like "%j%";

select * from tb_categoria inner join tb_produtos on tb_categoria.id = tb_produtos.categoria_id;

select tb_categoria.descricao, tb_produtos.nome from tb_categoria inner join tb_produtos on tb_categoria.id = tb_produtos.categoria_id
where tb_produtos.categoria_id = 2;









