package com.example.demo.controller;

import com.example.demo.model.Jogadores;
import com.example.demo.model.Treinador;
import com.example.demo.repository.TreinadorRepository;
import com.example.demo.service.TreinadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treinador")
public class TreinadorController {
    @Autowired
    TreinadorService treinadorService;
    @Autowired
    TreinadorRepository treinadorRepository;

    @GetMapping
    public List<Treinador> listarTreinadores() {
        return treinadorService.listarTreinadores();
    }

    @PostMapping
    public Treinador criar(@Valid @RequestBody Treinador treinador) {
        return treinadorService.criar(treinador);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody Treinador treinador) {
        if(treinadorService.atualizar(id, treinador) == null) {
            String mensagem = "O id informado não existe na base de dados";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        }
        return ResponseEntity.ok(treinador);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        if(treinadorService.deletar(id)) {
            String mensagem = "A deleção do id: " + id + " foi realizada com sucesso.";
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(mensagem);
        }
        String mensagem = "O id informado não existe na base de dados";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
    }
}
