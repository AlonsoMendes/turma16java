create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
preço float not null,
descrição varchar(100),
primary key(id)
);

insert tb_categoria (preço, descrição) values (30.00,"Doce");
insert tb_categoria (preço, descrição) values (32.00,"Metade Doce Metade Salagado");
insert tb_categoria (preço, descrição) values (35.00,"Vegana");
insert tb_categoria(preço, descrição) values (35.00,"Fitness");
insert tb_categoria(preço, descrição) values (28.00,"Salgada");

select * from tb_categoria;

create table tb_pizza(
id bigint auto_increment,
nome varchar(100),
tamanho varchar(100),
sabor varchar(100),
pizza_id bigint,

primary key(id),
foreign key (pizza_id) references tb_categoria (id)
);

select * from tb_pizza;

insert tb_pizza(nome, tamanho, sabor, pizza_id) values ("Brigadeiro","Grande","Doce", 1);
insert tb_pizza(nome, tamanho, sabor, pizza_id) values ("Brigadeiro e Bauru","Grande","Doce e Salgada", 2);
insert tb_pizza(nome, tamanho, sabor, pizza_id) values ("Cogumelos Selvagens","Grande","Salgada", 3);
insert tb_pizza(nome, tamanho, sabor, pizza_id) values ("Atum","Grande","Salgada", 4);
insert tb_pizza(nome, tamanho, sabor, pizza_id) values ("Mussarela","Grande","Salgada", 5);
insert tb_pizza(nome, tamanho, sabor, pizza_id) values ("Prestigio","Grande","Doce", 1);
insert tb_pizza(nome, tamanho, sabor, pizza_id) values ("Portuguesa","Grande","Salgada", 5);
insert tb_pizza(nome, tamanho, sabor, pizza_id) values ("Calabresa","Grande","Salgada", 5);


select descrição, preço from tb_categoria where preço > 45 ;

select descrição, preço from tb_categoria where preço between 29 and 60;

select descrição from tb_categoria where descrição like "%C%";


select * from tb_categoria inner join tb_pizza on tb_categoria.id = tb_pizza.pizza_id;

select tb_categoria.descrição, tb_pizza.nome from tb_categoria inner join tb_pizza on tb_categoria.id = tb_pizza.pizza_id
where tb_pizza.pizza_id = 1;
