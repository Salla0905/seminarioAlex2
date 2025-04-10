<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../static/CSS/login.css">
    <title>Sign in</title>
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
    <br><br><br><br><br><br><br>
    <!--O sign in tá aí caso o usuario não tenha conta-->
    <login>
        <titulo>Cadastro</titulo>
        <form action="">
            <label for="nome">
                <input type="text" name="nome" id="nome" minlength="5" maxlength="50" placeholder="digite seu nome" required>
            </label>
            <label for="email">
                <input type="email" name="email" id="email" minlength="5" maxlength="50" placeholder="digite seu email" required>
            </label>
            <label for="tel">
                <input type="tel" name="tel" id="tel" placeholder="digite seu telefone" required>
            </label>
            <label for="senha">
                <input type="password" name="pass1" id="senha" placeholder="digite sua senha" minlength="8" maxlength="16" required>
            </label>
            <label for="senha2">
                <input type="password" name="pass2" id="senha2" placeholder="Confirme sua senha" minlength="8" maxlength="16" required>
                <!--Aqui vai precisar de uma verificação para ver se uma senha é igual a outra, de modo que caso não seja, o usuario deve 
                digitar novamente-->
            </label>
            <botaoEnvio>
                <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Componentes%20do%20site/botão.png" alt="">
                <input type="submit" value="Enviar">
            </botaoEnvio>
        </form>
        <p>Já tem uma conta? <a href="login.jsp">Sign up</a></p>
    </login>
    <script>
        document.getElementById('SignInForm').addEventListener('submit', async function(e) {
            e.preventDefault();

            const nome = document.getElementById('nome').value;
            const email = document.getElementById('email').value;
            const tel = document.getElementById('tel').value;
            const senha = document.getElementById('senha').value;
            const senha2 = document.getElementById('senha2').value;

            try {
                const response = await fetch('/login', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded',
                    },
                    body: `email=${encodeURIComponent(email)}&senha=${encodeURIComponent(senha)}`
                });

                if (response.redirected) {
                    window.location.href = response.url;
                } else {
                    alert('Cadastro falhou.');
                }
            } catch (error) {
                console.error('Erro:', error);
                alert('Erro ao tentar fazer cadastrar');
            }
        });
    </script>
</body>
</html>