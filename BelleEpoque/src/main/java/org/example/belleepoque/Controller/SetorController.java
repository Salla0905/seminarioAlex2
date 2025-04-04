package org.example.belleepoque.controller;

import org.example.belleepoque.model.Setor;
import org.example.belleepoque.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/inserir")
    public ResponseEntity<Setor> inserir(@RequestBody Setor setor) {
        setorRepository.save(setor);
        return ResponseEntity.ok(setor);
    }
}
