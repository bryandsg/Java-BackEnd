package com.backend.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.springboot.model.Atleta;

@Repository("atletaRepository")
public interface AtletaRepository extends JpaRepository<Atleta, Integer> {

}
