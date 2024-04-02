create table ciudades (
    id int primary key unique not null,
    descripcion varchar(255),
    id_pais int
);

insert into ciudades (id, descripcion, id_pais) values (1, "Mar del Plata", 1);
insert into ciudades (id, descripcion, id_pais) values (2, "CABA", 1);
insert into ciudades (id, descripcion, id_pais) values (3, "La Plata", 1);
insert into ciudades (id, descripcion, id_pais) values (4, "Buzios", 2);

select * from ciudades;