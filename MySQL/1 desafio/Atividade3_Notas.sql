create database db_registro_escolar;

use db_registro_escolar;

create table tb_registro_escolar(
id bigint auto_increment,
nome_aluno varchar(255) not null,
genero varchar(12) not null,
turma varchar(10) not null,
nota  decimal not null,
primary key(id)
);

select * from tb_registro_escolar;

select nome_aluno, nota from tb_registro_escolar where nota > 7;
select nome_aluno, nota from tb_registro_escolar where nota < 7;


insert into tb_registro_escolar (nome_aluno,genero,turma, nota) values ("Pedrinho","Masculino","8°A", 8);
insert into tb_registro_escolar (nome_aluno,genero,turma, nota) values ("Ana","Feminino","8°B", 10);
insert into tb_registro_escolar (nome_aluno,genero,turma, nota) values ("Pedro","Masculino","8°C", 6);
insert into tb_registro_escolar (nome_aluno,genero,turma, nota) values ("Maria","Feminino","8°A", 9);
insert into tb_registro_escolar (nome_aluno,genero,turma, nota) values ("Jessica","Feminino","8°D", 5);
insert into tb_registro_escolar (nome_aluno,genero,turma, nota) values ("Giovana","Feminino","8°C", 8);
insert into tb_registro_escolar (nome_aluno,genero,turma, nota) values ("Enzo","Masculino","8°B", 10);



update tb_registro_escolar set nota = 6 where id = 2;

