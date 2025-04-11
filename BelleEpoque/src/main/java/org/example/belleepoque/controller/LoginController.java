package org.example.belleepoque.Controller;

import org.example.belleepoque.dto.UsuarioDTO;
import org.example.belleepoque.repository.UsuarioRepository;
import org.example.belleepoque.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired // ← INJEÇÃO DO SERVICE
    private UsuarioService usuarioService;
    @PostMapping("/login")
    public String login(@ModelAttribute UsuarioDTO usuarioDTO) {
        if (usuarioService.validarLogin(usuarioDTO.getEmail(), usuarioDTO.getSenha())) {
            return "redirect:/home";
        } else {
            return "redirect:/login?erro=true"; // Redireciona com flag de erro
        }
    }
}
