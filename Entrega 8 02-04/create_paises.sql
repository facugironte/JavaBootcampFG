create table paises (
    id int primary key unique not null,
    descripcion varchar(255)
);

insert into paises (id, descripcion) values (1, "Argentina");
insert into paises (id, descripcion) values (2, "Brasil");
insert into paises (id, descripcion) values (3, "Uruguay");
insert into paises (id, descripcion) values (4, "Chile");

select * from paises;
