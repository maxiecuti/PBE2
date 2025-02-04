package com.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mercado.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
