drop database if exists cantina;
create database cantina;
use cantina;

create table salgados (
	id_salgado smallint not null primary key auto_increment,
    nome varchar(250) not null unique,
    preco double not null,
    qntd_disp int not null,
    qntd_vendida int default 0);
    
create table guaravitas (
	id_guaravita smallint not null primary key auto_increment,
    nome varchar(250) not null unique,
    preco double not null,
    qntd_disp int not null,
    qntd_vendida int default 0);
    
create table promocao (
	id_promocao smallint not null primary key auto_increment,
    nome varchar(250) not null,
    preco double not null,
    qntd_disp int default 2300,
    qntd_vendida int default 0,
    id_salgado smallint not null,
    id_guaravita smallint not null,
    foreign key(id_salgado) references salgados(id_salgado),
    foreign key(id_guaravita) references guaravitas(id_guaravita));
    
insert into salgados (nome,preco,qntd_disp,qntd_vendida)
values ('Coxinha',350,460, default),
('Joelho',350,460, default),
('Kibe',350,460, default),
('Pão de Queijo',350,460, default),
('Enroladinho de Salsicha',350,460, default);

insert into guaravitas (nome,preco,qntd_disp,qntd_vendida)
values ('Guaracamp',150,1150, default),
('Açaícamp',150,1150,default);

insert into promocao (nome,preco,qntd_disp,qntd_vendida,id_salgado,id_guaravita)
values ('Promoção de R$ 5',500,460,default,1,1),
('Promoção de R$ 5',500,460,default,1,2),
('Promoção de R$ 5',500,460,default,2,1),
('Promoção de R$ 5',500,460,default,2,2),
('Promoção de R$ 5',500,460,default,3,1),
('Promoção de R$ 5',500,460,default,3,2),
('Promoção de R$ 5',500,460,default,4,1),
('Promoção de R$ 5',500,460,default,4,2),
('Promoção de R$ 5',500,460,default,5,1),
('Promoção de R$ 5',500,460,default,5,2)