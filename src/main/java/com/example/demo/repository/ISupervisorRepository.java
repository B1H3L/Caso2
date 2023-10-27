package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Supervisor;

public interface ISupervisorRepository extends JpaRepository<Supervisor, Integer>{
	Supervisor findByCodigoS(int codigoS);

}
