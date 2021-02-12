create database db_ecommerce; -- cria um bando de dados

use db_ecommerce; -- acessa o banco de dados

create table tb_ecommerce( -- criação de tabela
id bigint auto_increment,
nome_usuario varchar(255) not null,
nome_produto varchar(250) not null,
valor_produto float not null,
forma_pagamento varchar(100) not null,
primary key(id)
);

select * from tb_ecommerce;

select nome_usuario, valor_produto from  tb_ecommerce where valor_produto > 500;
select nome_usuario, valor_produto from  tb_ecommerce where valor_produto < 500;

insert into tb_ecommerce (nome_usuario,nome_produto,valor_produto,forma_pagamento) values ("Alonso","Ryzen 9 3900X ",3699,"Debito");
insert into tb_ecommerce (nome_usuario,nome_produto,valor_produto,forma_pagamento) values ("Giovana", "mascara", 100, "Dinheiro");
insert into tb_ecommerce (nome_usuario,nome_produto,valor_produto,forma_pagamento) values ("João", "Furadeira", 250, "Dinheiro");
insert into tb_ecommerce (nome_usuario,nome_produto,valor_produto,forma_pagamento) values ("Luiz"," Tv ",2000,"Credito");
insert into tb_ecommerce (nome_usuario,nome_produto,valor_produto,forma_pagamento) values ("Fatima", "Computator", 5000, "Debito");
insert into tb_ecommerce (nome_usuario,nome_produto,valor_produto,forma_pagamento) values ("Aline","Maleta de maquiagem ",450,"Credito");
insert into tb_ecommerce (nome_usuario,nome_produto,valor_produto,forma_pagamento) values ("Jose","Cadeira Gamer ",1699,"Credito");
insert into tb_ecommerce (nome_usuario,nome_produto,valor_produto,forma_pagamento) values ("Leticia", "Headset razer kraken tournament", 499, "Debito");

update tb_ecommerce set forma_pagamento = "Dinheiro" where id = 8;

