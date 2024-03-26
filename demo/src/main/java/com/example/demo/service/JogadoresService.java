package com.example.demo.service;

import com.example.demo.model.Jogadores;
import com.example.demo.repository.JogadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadoresService {

    @Autowired
    JogadoresRepository jogadoresRepository;

    public List<Jogadores> listarJogadores() {
        return jogadoresRepository.findAll();
    }

    public Jogadores criar(Jogadores jogadores) {
        return jogadoresRepository.save(jogadores);
    }

    public Jogadores atualizar(Long id, Jogadores jogadores) {
        //verificar se o id é valido
        if(jogadoresRepository.existsById(id)) {
            //atualizar o objeto na base
            jogadores.setId(id);
            return jogadoresRepository.save(jogadores);
        }
        return null;
        // não realiza nenhuma alteração
    }

    public boolean deletar(Long id) {
        if(jogadoresRepository.existsById(id)) {
            jogadoresRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public int qtdJogadores() {
        return jogadoresRepository.findAll().size();
    }
}
