package org.example.belleepoque.Controller;

import org.example.belleepoque.model.Setor;
import org.example.belleepoque.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/setor")
public class SetorController {
    private final SetorRepository setorRepository;
    @Autowired
    public SetorController(SetorRepository setorRepository) {
        this.setorRepository = setorRepository;
    }
    @GetMapping("/listar")
    public List<Setor> listar() {
        return setorRepository.findAll();
    }
}
