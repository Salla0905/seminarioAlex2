# 👗 Belle Époque – Loja de Roupas

Este é o projeto **Belle Époque**, uma loja de roupas online desenvolvida por alunas do **2°E** como pojeto da matéria de DAD. A aplicação integra um front-end com HTML, CSS, JavaScript e Thymeleaf, um back-end em Java com Spring Boot, e um banco de dados PostgreSQL.

---

## 👤 Grupo
- Grupo do 2° ano E formado por:
  - **Júlia Porfírio (n° 12):**
    - GitHub: juliaporf
    - Email: julia.porfirio@germinare.org.br
  - **Marianna Luna (n° 20):** 
    - GitHub: Mariluna09
    - Email: marianna.luna@germinare.org.br
  - **Bruna Salla (n° 26):**
    - GitHub: Salla0905
    - Email: bruna.salla@germinare.org.br

---

## 🔧 Tecnologias Utilizadas

- **Front-end:** HTML, CSS, JavaScript, Thymeleaf
- **Back-end:** Java + Spring Boot
- **Banco de Dados:** PostgreSQL

---

## 🎯 Objetivo

Desenvolver uma loja virtual com as principais funcionalidades de um e-commerce moderno: exibição de roupas, cadastro de usuários e sistema de carrinho de compras.

---

## 🚀 Funcionalidades

- Cadastro e login de clientes
- Exibição de roupas com nome, descrição, imagem e preço
- Adição de itens ao carrinho

---

## 📁 Estrutura do Projeto

### Front-end

- HTML com templates gerenciados pelo Thymeleaf
- JavaScript para interações e consumo da API
- CSS para o estilo visual

### Back-end

Responsável por:

- Processar requisições do front-end
- Gerenciar regras de negócio da loja (ex: login, cálculo do carrinho, controle de estoque)
- Acessar e manipular os dados no banco PostgreSQL
- Renderizar páginas dinâmicas com Thymeleaf quando necessário

As classes Java estão organizadas em:

- **Controllers:** recebem as requisições do front-end
- **Services:** contêm as regras de negócio
- **Repositories:** fazem a comunicação com o banco de dados
- **Models:** representam as entidades do banco de dados
- **DTOs (Data Transfer Objects):** organizam e transportam dados entre camadas de forma mais segura e eficiente


### Banco de Dados (PostgreSQL)

#### Hospedagem e Conexão:
- Hospedado no Aiven
  - Host: http://belle-epoque2-brunadraw286-969d.d.aivencloud.com/
  - Nome do banco: defaultdb
  - Port: 24810
  - User: avnadmin
  - Senha: AVNS_XMxpDWuap4KaS8S-Ah1

#### Tabelas:
- `carrinho` (id, id_usuario, id_produto, quantidade, tamanho)
- `compra` (id, id_usuario, id_produto, tamanho, quantidade, data_compra, valor_total, status, id_cliente)
- `produto` (id, nome, preco, cor, tamanho, quant_estoque, imagem, id_setor, descricao)
- `setor` (id, tipo)
- `usuario` (id, nome, email, senha, telefone, endereco, status_cliente)

#### 🗂️ Modelo Conceitual do Banco de Dados
Abaixo está o modelo conceitual do banco PostgreSQL usado na aplicação:

![Modelo Conceitual](modelo%20conceitual.png)


---

## 🔗 Integração Front + Back

A conexão entre as camadas é feita de duas formas:

- **Thymeleaf**: para renderização dinâmica de páginas HTML diretamente com dados vindos do back-end.
- **JavaScript (fetch)**: para chamadas assíncronas à API (como busca de produtos, ações no carrinho, etc.).

Exemplo com `fetch()`:

```javascript
fetch("/produtos")
  .then(res => res.json())
  .then(roupas => {
    // exibe as roupas na página
  });