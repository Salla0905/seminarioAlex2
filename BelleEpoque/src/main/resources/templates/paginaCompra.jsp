<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../static/CSS/paginaCompra.css">
    <title>Pagina de compra</title>
</head>
<body>
    <header>
        <form action="">
            <img src="../../resources/static/Search.png" alt="" class="lupa">
            <label for="pesquisa">
                <input type="text" name="pesquisa" id="pesquisa" placeholder="Pesquisar...">
            </label>
        </form>
        <img src="../../resources/static/Belle%20Époque.png" alt="" class="Belle">
        <botoes>
            <img src="../../resources/static/Filter%20alt.png" alt="" class="filter">
            <img src="../../resources/static/Vector.png" alt="" class="bag">
            <img src="../../resources/static/User.png" alt="" class="user">
        </botoes>
    </header>
    <item>
        <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/roupa.webp" alt="" class="roupaExposicao">
        <info>
            <!--Aqui vai pegar o nome do produto do banco de dados e colocar no titulo-->
            <titulo>ROUPA EXEMPLO</titulo>
            <div>
                <label for="size">
                    <select name="size" id="size">
                        <!--Botao de tamanho
                        Aqui vai precisar verificar os tamanhos disponiveis, tipo se esse tamanho tiver disponivel, você adiciona uma option-->
                        <option value="s">size</option>
                        <option value="v1">12</option>
                        <option value="v2">14</option>
                        <option value="v3">16</option>
                        <option value="v4">18</option>
                    </select>
                </label>
                <label for="qtd">
                    <!--Botao de quantidade
                    nessa parte da quantidade vai precisar de uma verificação de quanto tem em estoque, tipo um while para enquanto não for maior que o estoque, você coloca uma option-->
                    <select name="qtd" id="qtd">
                        <option value="s">qtd</option>
                        <option value="v1">1</option>
                        <option value="v2">2</option>
                        <option value="v3">3</option>
                        <option value="v4">4</option>
                        <option value="v0">0</option>
                    </select>
                </label>
        </div>
            <!--Aqui vai pegar o preco do banco de dados e colocar em precoo-->
            <h2>Preço</h2>
            <precoo>R$0.0</precoo>
            <h2>Descrição</h2>
            <!--Aqui vai pegar a descrição e colocar em p-->
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. A omnis ab illum quaerat sit sapiente, voluptatem libero nihil tempora repudiandae, molestiae consequatur aliquam sint enim eligendi reiciendis ullam veniam itaque.</p>
            <botoes>
                <!--esse botão precisa adicionar o produto especificado ao carrinho do usuario-->
                <botao1>
                    Adicionar ao carrinho
                </botao1>
            </botoes>
            <h2>Recomendações</h2>
            <!--em recomendações, o sistema vai sortear uma roupa aleatóriamente para colocar aqui, que não seja a roupa que o usuario já tá usando-->
            <card>
                <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Imagens%20de%20roupas/roupa9.webp" alt="" class="roupa">
                <titulo>
                    ROUPA EXEMPLO
                </titulo>
                <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Componentes%20do%20site/Group%201.png" alt="" class="estrela">
                <desc>
                    <preco>0.0</preco>
                    <prom>até 10x sem juros</prom>
                </desc>
                <botao>
                    Visualizar
                </botao>
            </card>
        </info>
    </item>
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
    <script>
        document.addEventListener('DOMContentLoaded', async () => {
            const produtoId = new URLSearchParams(window.location.search).get('id');
            if (!produtoId) return;

            // Elementos DOM
            const elements = {
                imagem: document.querySelector('.roupaExposicao'),
                nome: document.querySelector('info > titulo'),
                preco: document.querySelector('precoo'),
                descricao: document.querySelector('info > p'),
                tamanhos: document.getElementById('size'),
                quantidades: document.getElementById('qtd'),
                recomendacao: document.querySelector('card')
            };

            try {
                // Busca produto principal
                const produto = await fetch(`/api/produtos/${produtoId}`).then(res => res.json());

                // Preenche dados
                elements.imagem.src = produto.imagemUrl;
                elements.nome.textContent = produto.nome.toUpperCase();
                elements.preco.textContent = `R$${produto.preco.toFixed(2)}`;
                elements.descricao.textContent = produto.descricao;

                // Preenche tamanhos
                produto.tamanhosDisponiveis.forEach(t => {
                    const option = document.createElement('option');
                    option.value = t;
                    option.textContent = t;
                    elements.tamanhos.appendChild(option);
                });

                // Busca recomendações (excluindo o produto atual)
                const recomendacoes = await fetch('/api/produtos/recomendacoes').then(res => res.json());
                const recomendacao = recomendacoes.find(p => p.id != produtoId);
                if (recomendacao) {
                    elements.recomendacao.innerHTML = `
                <img src="${recomendacao.imagemUrl}" alt="${recomendacao.nome}">
                <titulo>${recomendacao.nome.toUpperCase()}</titulo>
                <desc>
                    <preco>R$${recomendacao.preco.toFixed(2)}</preco>
                </desc>
            `;
                }

            } catch (error) {
                console.error("Erro ao carregar produto:", error);
            }
        });
    </script>
</body>
</html>