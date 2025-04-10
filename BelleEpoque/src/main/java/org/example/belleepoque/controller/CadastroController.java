package org.example.belleepoque.controller;

import org.example.belleepoque.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public String cadastrarUsuario(
            @RequestParam String nome,
            @RequestParam String email,
            @RequestParam String tel,
            @RequestParam(name = "pass1") String senha,
            @RequestParam(name = "pass2") String confirmacaoSenha,
            RedirectAttributes redirectAttributes) {

        if (!senha.equals(confirmacaoSenha)) {
            redirectAttributes.addFlashAttribute("erro", "As senhas não coincidem");
            return "redirect:/cadastro";
        }

        try {
            usuarioService.cadastrarNovoUsuario(nome, email, tel, senha);
            return "redirect:/login?cadastroSucesso=true";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("erro", "Erro ao cadastrar: " + e.getMessage());
            return "redirect:/cadastro";
        }
    }
}