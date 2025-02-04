package com.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mercado.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findByCpf(String cpf);

}