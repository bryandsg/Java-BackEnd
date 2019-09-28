package com.backend.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.springboot.model.Time;

@Repository("timeRepository")
public interface TimeRepository extends JpaRepository<Time, Integer> {

}
