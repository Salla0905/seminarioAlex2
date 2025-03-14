CREATE TABLE Cliente 
( 
 Chave INT PRIMARY KEY,  
 nome_conta varchar(80),  
 status_conta varchar(80),  
 cep INT,  
 idsacola INT,  
); 


CREATE TABLE Produto 
( 
 nome varchar(80),  
 imagem varchar(300),
 Chave INT PRIMARY KEY,  
 preco number,  
 cor varchar(80),  
 tamanho INT,  
); 


CREATE TABLE setor 
( 
 Chave INT PRIMARY KEY,  
 tipo varchar(80),   
 idProduto INT 
); 


CREATE TABLE sacola 
( 
 Chave int cliente foreign key
 Chave int produto foreign key 
); 

















