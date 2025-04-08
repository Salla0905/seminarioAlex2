<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../static/CSS/login.css">
    <title>Login</title>
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
    <!--O login tá ai caso o usuario já tenha conta-->
    <login>
        <titulo>Login</titulo>
        <form action="">
            <label for="email">
                <input type="email" name="email" id="email" minlength="5" maxlength="50" placeholder="digite seu e-mail" required>
            </label>
            <label for="senha">
                <input type="password" name="senha" id="senha" minlength="8" maxlength="16" placeholder="digite sua senha" required>
            </label>
            <fieldset>
                Esqueci a senha
            </fieldset>
            <botaoEnvio>
                <img src="../../../../../../DAD/Belle%20Époque/seminarioAlex2/Componentes%20do%20site/botão.png" alt="">
                <input type="submit" value="Enviar">
            </botaoEnvio>
        </form>
        <p>Não tem uma conta? <a href="signin.jsp">Sign in</a></p>
    </login>
</body>
</html>