package org.example.belleepoque.Controller;

import org.example.belleepoque.dto.UsuarioDTO;
import org.example.belleepoque.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public String mostrarLogin() {
        return "login";
    }

    @PostMapping
    public String login(@ModelAttribute UsuarioDTO usuarioDTO) {
        if (usuarioService.validarLogin(usuarioDTO.getEmail(), usuarioDTO.getSenha())) {
            return "redirect:/home";
        } else {
            return "redirect:/login?erro=true";
        }
    }
}
