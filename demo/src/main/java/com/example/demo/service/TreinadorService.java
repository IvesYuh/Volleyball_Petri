package com.example.demo.service;

import com.example.demo.model.Jogadores;
import com.example.demo.model.Treinador;
import com.example.demo.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinadorService {
    @Autowired
    TreinadorRepository treinadorRepository;

    public List<Treinador> listarTreinadores() {
        return treinadorRepository.findAll();
    }

    public Treinador criar(Treinador treinador) {
        return treinadorRepository.save(treinador);
    }

    public Treinador atualizar(Long id, Treinador treinador) {
        if(treinadorRepository.existsById(id)) {
            treinador.setId(id);
            return treinadorRepository.save(treinador);
        }
        return null;
    }

    public boolean deletar(Long id) {
        if(treinadorRepository.existsById(id)) {
            treinadorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
