package com.example.demo.repository;

import com.example.demo.model.Jogadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface JogadoresRepository extends JpaRepository<Jogadores,Long> {
}
