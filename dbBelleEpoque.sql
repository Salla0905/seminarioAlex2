select * from setor

Alter table setor
drop column roupa,
drop column calçados,
drop column bolsas,
drop column acessorio;

Alter table setor
add column tipo varchar(300)

Alter table setor 
alter column tipo type char(1)

Alter table produto
add column imagem varchar(300)

select * from usuario

Alter table usuario 
alter column status_cliente type char(1)

