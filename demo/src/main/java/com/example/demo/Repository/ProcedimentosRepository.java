package com.example.demo.Repository;

import com.example.demo.Model.Procedimentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcedimentosRepository extends JpaRepository<Procedimentos, Long> {
}
