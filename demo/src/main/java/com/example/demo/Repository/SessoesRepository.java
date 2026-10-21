package com.example.demo.Repository;

import com.example.demo.Model.Sessoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessoesRepository extends JpaRepository<Sessoes, Long> {
}
