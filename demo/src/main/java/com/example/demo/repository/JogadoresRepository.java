package com.example.demo.repository;

import com.example.demo.model.Jogadores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadoresRepository extends JpaRepository<Jogadores,Long> {
}
