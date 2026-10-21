package com.example.demo.Repository;

import com.example.demo.Model.Agendamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentosRepository extends JpaRepository<Agendamentos, Long> {
}
