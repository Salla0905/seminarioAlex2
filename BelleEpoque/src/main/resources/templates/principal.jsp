<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="CSS/principal.css">
    <title>Home</title>
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap JS (necessário para o carrossel funcionar) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
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

    <!-- Carrossel -->
    <div class="modelo">
        <div id="carrossel" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carrossel" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carrossel" data-bs-slide-to="1" aria-label="Slide 2"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/depositphotos_106390820-stock-photo-fashion-collage-with-freehand-drawings.jpg" class="d-block w-100" alt="Imagem 1">
                </div>
                <div class="carousel-item">
                    <img src="https://i.pinimg.com/736x/a0/e6/ed/a0e6edef0f92bd90d20a19cfa3f007f4.jpg" class="d-block w-100" alt="Imagem 2">
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carrossel" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Anterior</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carrossel" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Próximo</span>
            </button>
        </div>
    </div>
    
    
    <lancamentos>
        <h2>Mais Vendidos</h2>
        <cards>
                <card>
                    <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/Casaco.png" alt="" class="roupa">
                    <titulo>
                        Casaco preta rendado
                    </titulo>
                    <!-- <img src="Componentes do site/Group 1.png" alt="" class="estrela"> -->
                    <desc>
                        <preco>R$ 129.99</preco>
                        <!-- <prom>até 10x sem juros</prom> -->
                    </desc>
                    <botao>
                        Visualizar
                    </botao>
                </card>
                <card>
                    <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/saia.jpg" alt="" class="roupa">
                    <titulo>
                        Saia longa
                    </titulo>
                    <!-- <img src="Componentes do site/Group 1.png" alt="" class="estrela"> -->
                    <desc>
                        <preco>R$ 99.99</preco>
                        <!-- <prom>até 10x sem juros</prom> -->
                    </desc>
                    <botao>
                        Visualizar
                    </botao>
                </card>
                <card>
                    <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/vestidoPreto.jpg" alt="" class="roupa">
                    <titulo>
                        Vestido preto com tule
                    </titulo>
                    <!-- <img src="Componentes do site/Group 1.png" alt="" class="estrela"> -->
                    <desc>
                        <preco>R$ 159.99</preco>
                        <!-- <prom>até 10x sem juros</prom> -->
                    </desc>
                    <botao>
                        Visualizar
                    </botao>
                </card>
                <card>
                    <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/vestido.jpg" alt="" class="roupa">
                    <titulo>
                        Vestido de poá 
                    </titulo>
                    <!-- <img src="Componentes do site/Group 1.png" alt="" class="estrela"> -->
                    <desc>
                        <preco>R$ 129.99</preco>
                        <!-- <prom>até 10x sem juros</prom> -->
                    </desc>
                    <botao>
                        Visualizar
                    </botao>
                </card>
        </cards>
    </lancamentos>
    <MaisVendidos>
        <h2>Lançamentos</h2>
        <cards>
            <card>
                <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/saltoCinderela.jpg" alt="" class="roupa">
                <titulo>
                    Salto cinderela
                </titulo>
                <!-- <img src="Componentes do site/Group 1.png" alt="" class="estrela"> -->
                <desc>
                    <preco>R$ 119.99</preco>
                    <!-- <prom>até 10x sem juros</prom> -->
                </desc>
                <botao>
                    Visualizar
                </botao>
            </card>
            <card>
                <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/bolsa2.jpg" alt="" class="roupa">
                <titulo>
                    Bolsa azul bordada
                </titulo>
                <!-- <img src="Componentes do site/Group 1.png" alt="" class="estrela"> -->
                <desc>
                    <preco>R$ 89.99</preco>
                    <!-- <prom>até 10x sem juros</prom> -->
                </desc>
                <botao>
                    Visualizar
                </botao>
            </card>
            <card>
                <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/oculos.jpg" alt="" class="roupa">
                <titulo>
                    Óculos de sol
                </titulo>
                <!-- <img src="Componentes do site/Group 1.png" alt="" class="estrela"> -->
                <desc>
                    <preco>R$ 79.99</preco>
                    <!-- <prom>até 10x sem juros</prom> -->
                </desc>
                <botao>
                    Visualizar
                </botao>
            </card>
            <card>
                <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/bolsa.png" alt="" class="roupa">
                <titulo>
                    Bolsa rosa com aplique
                </titulo>
                <!-- <img src="Componentes do site/Group 1.png" alt="" class="estrela"> -->
                <desc>
                    <preco>R$ 179.99</preco>
                    <!-- <prom>até 10x sem juros</prom> -->
                </desc>
                <botao>
                    Visualizar
                </botao>
            </card>
    </cards>
    </MaisVendidos>
    <h2>Categorias</h2>
    <categorias>
        <topico>
            <textinho>Roupas</textinho>
            <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/depositphotos_106390820-stock-photo-fashion-collage-with-freehand-drawings.jpg" alt="" class="img1">
        </topico>
        <bloco2>
            <bloco>
                <topico>
                    <textinho>Sapatos</textinho>
                    <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/sapato.webp" alt="" class="img2">
                </topico>
                <topico>
                    <textinho>Bolsas</textinho>
                    <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/BolsaCateg.jpg" alt="" class="img3">
                </topico>
            </bloco>
            <topico>
                <textinho>Acessórios</textinho>
                <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/acessórios.jpg" alt="" class="img4">
            </topico>
        </bloco2>
    </categorias>
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