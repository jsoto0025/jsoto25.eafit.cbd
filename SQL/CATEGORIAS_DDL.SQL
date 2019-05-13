USE ESHOP;
CREATE TABLE CATEGORIA
(
	ID int NOT null default 0,
    NOMBRE varchar(250) not null default '',
    DESCRIPCION varchar(250) not null default ''
);
ALTER TABLE CATEGORIA ADD  constraint PK_CATEGORIA primary key(ID); 