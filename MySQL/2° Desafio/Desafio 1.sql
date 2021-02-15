create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
classe varchar(50),
raca varchar(50),
primary key(id)
);

insert tb_classe (classe, raca) values ("Mago","demonio");
insert tb_classe (classe, raca ) values ("Atirador","Elfo");
insert tb_classe (classe, raca ) values ("Guerreiro","Humano");
insert tb_classe (classe, raca ) values ("Suporte","Anjo");
insert tb_classe (classe, raca) values ("Tank","Anão");

select * from tb_classe;

create table tb_personagem(
id bigint auto_increment ,
nome varchar(255) not null,
genero varchar(50) not null,
ataque_fisico int not null,
ataque_magico int not null,
defesa int not null,
personagem_id bigint,

primary key(id),
foreign key (personagem_id) references tb_classe (id)
);

insert tb_personagem (nome, genero, ataque_fisico, ataque_magico, defesa, personagem_id) values ("Alucard","Masculino", 600, 3300, 1100,1);
insert tb_personagem (nome, genero, ataque_fisico, ataque_magico, defesa, personagem_id) values ("Ashe","Feminino", 32000,1000,800,2);
insert tb_personagem (nome, genero, ataque_fisico, ataque_magico, defesa, personagem_id) values ("Darius","Masculino",3100,0,1900,3);
insert tb_personagem (nome, genero, ataque_fisico, ataque_magico, defesa, personagem_id) values ("Lux","Feminino", 1000, 2800, 1200,4);
insert tb_personagem (nome, genero, ataque_fisico, ataque_magico, defesa, personagem_id) values ("Poppy","Feminino", 1000,1000,3000,5);
insert tb_personagem (nome, genero, ataque_fisico, ataque_magico, defesa, personagem_id) values ("Morgana","Feminina", 600, 3300, 1100,1);
insert tb_personagem (nome, genero, ataque_fisico, ataque_magico, defesa, personagem_id) values ("Olaf","Masculino", 3100,0,1900,3);
insert tb_personagem (nome, genero, ataque_fisico, ataque_magico, defesa, personagem_id) values ("Lucian","Masculino", 32000,1000,800,2);

select * from tb_personagem;

select nome, ataque_magico,ataque_fisico  from  tb_personagem where ataque_fisico > 2000 or ataque_magico > 2000;

select nome, defesa from tb_personagem where defesa between 1000 and 2000;

select nome from tb_personagem where nome like "%C%";

select * from tb_classe inner join tb_personagem on tb_classe.id = tb_personagem.id;

select tb_classe.classe, tb_personagem.nome from tb_classe inner join tb_personagem on tb_classe.id = tb_personagem.personagem_id
where tb_personagem.personagem_id = 1;
