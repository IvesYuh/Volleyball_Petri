package com.example.demo.controller;

import com.example.demo.model.Jogadores;
import com.example.demo.service.JogadoresService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadoresController {

    @Autowired
    JogadoresService jogadoresService;

    @GetMapping
    public List<Jogadores> listarJogadores() {
        return jogadoresService.listarJogadores();
    }

    @PostMapping
    public Jogadores criar(@Valid @RequestBody Jogadores jogadores) {
        return jogadoresService.criar(jogadores);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody Jogadores jogadores) {
        if(jogadoresService.atualizar(id, jogadores) == null) {
            String mensagem = "O id informado não existe na base de dados";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        }
        return ResponseEntity.ok(jogadores);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        if(jogadoresService.deletar(id)) {
            String mensagem = "A deleção do id: " + id + " foi realizada com sucesso.";
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(mensagem);
        }
        String mensagem = "O id informado não existe na base de dados";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
    }

    @GetMapping("/qtd-jogadores")
    public int qtdJogadores() {
        return jogadoresService.qtdJogadores();
    }

}
