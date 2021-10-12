package com.group9.elzacast.controller;


import com.group9.elzacast.model.Contato;
import com.group9.elzacast.repository.ContatoRepository;
import com.group9.elzacast.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContatoController {

    @Autowired
    private ContatoService contatoService;
    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping("/{usuario}")
    public ResponseEntity<List<Contato>> getByUsuario(@PathVariable Long usuario) {
        return ResponseEntity.ok(contatoService.listaContatos(usuario));
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Contato> post(@RequestBody Contato post) {
        return ResponseEntity.status(HttpStatus.CREATED).body(contatoService.salvar(post));
    }
    @PutMapping("cadastrar")
    public ResponseEntity<Contato> put(@RequestBody Contato post) {
        return ResponseEntity.status(HttpStatus.CREATED).body(contatoService.salvar(post));
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        contatoService.deletar(id);
    }


}
