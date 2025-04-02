<%@ page import="org.example.belleepoque.Controller.CarrinhoController" %>
<%@ page import="org.example.belleepoque.repository.CarrinhoRepository" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="CSS/sacola.css">
    <title>Sacola</title>
</head>
<body>
    <header>
        <form action="">
        </form>
        <img src="../../resources/static/Belle%20Époque.png" alt="" class="Belle">
        <!-- <div class="botoes">
           <img src="Componentes do site/Vector.png" alt="" class="bag">
            <img src="Componentes do site/User.png" alt="300" class="user">
        </div>   -->
        <div id="sidenav">
            <a href="#" id="home">Home</a>
            <a href="#" id="sobre">Carrinho</a>
            <a href="#" id="Contato">Perfil</a>
        </div>
    </header>
    <items>
        <%
            CarrinhoRepository carrinhoRepository = null;
            CarrinhoController carrinhoController = new CarrinhoController(carrinhoRepository);%>
        <!--A cada roupa adicionada na sacola, um desses cards surge com suas respectivas informações.-->
        <!--Provavelmente vamo precisar de um while para ir pegando as informações dos produtos que estão na sacola-->
        <%while(carrinhoController.listar().iterator().hasNext()){%>
        <!--vai precisar de um if para verificar se o id_usuario do carrinho é o mesmo do usuario que tá logado-->
        <card>
            <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/roupa.webp" alt="" class="roupa">
            <div>
                <titulo>
                    <!--Aqui no titulo tem que achar o nome da roupa escolhida-->
                    ROUPA EXEMPLO
                </titulo>
                <!--Aqui precisa colocar a imagem da roupa escolhida -->
                <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Componentes%20do%20site/Group%201.png" alt="" class="estrela">
                <desc>
                    <preco>0.0</preco>
                </desc>
            </div>
            <botao>
                <label for="qtd">
                    <select name="qtd" id="qtd">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="0">0</option>
                        <!--aqui vai precisar verificar quanto tem disponivel em estoque-->
                        <!--Caso o usuario selecione 0, a roupa deve sumir da sacola-->
                    </select>
                </label>
            </botao>
        </card>
        <%}%>
    </items>
    <!--Aqui vai somar o valor de cada item para gerar um valor total-->
    <total>TOTAL:R$99.99</total>
    <fimPagina>
        <redes>
            <img src="../../resources/static/Facebook.png" alt="">
            <img src="../../resources/static/Twitter%20Bird.png" alt="">
            <img src="../../resources/static/Instagram.png" alt="">
        </redes>
        <fim>
            <txt>© 2025 Copyright</txt>
            <txt>Terms & Conditions</txt>
            <txt>Privacy Police</txt>
        </fim>
    </fimPagina>
</body>
</html>