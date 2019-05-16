drop database if exists cantinaPrjt;
create database cantinaPrjt;
use cantinaPrjt;

create table salgado (
    id_salgado smallint not null primary key auto_increment,
    nome varchar(250) not null default '---',
    preco double not null default 0,
    qntd_disp int not null default 0);
    
create table guaravita (
    id_guaravita smallint not null primary key auto_increment,
    nome varchar(250) not null,
    preco double not null default 0,
    qntd_disp int not null default 0);
    
create table pedido (
    id_pedido smallint primary key auto_increment,
    pagamento double not null
);

create table pedido_has_salgado (
    id_pedido smallint not null,
    id_salgado smallint not null,
    foreign key(id_salgado) references salgado(id_salgado),
    foreign key(id_pedido) references pedido(id_pedido),
    primary key(id_pedido, id_salgado)
);

create table pedido_has_guaravita (
    id_pedido smallint not null,
    id_guaravita smallint not null,
    foreign key(id_guaravita) references guaravita(id_guaravita),
    foreign key(id_pedido) references pedido(id_pedido),
    primary key(id_pedido, id_guaravita)
);


insert into salgado (id_salgado,nome,preco,qntd_disp)
values (1, default, default, default),
(2,'Coxinha',350,460),
(3,'Joelho',350,460),
(4,'Kibe',350,460),
(5,'Pão de Queijo',350,460),
(6,'Enroladinho de Salsicha',350,460);

insert into guaravita (id_guaravita,nome,preco,qntd_disp)
values (1,'Guaracamp',150,1150),
(2,'Açaícamp',150,1150);