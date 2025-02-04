package com.mercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercado.entities.Produto;
import com.mercado.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	 @Autowired
	    private ProdutoRepository produtoRepository;

	    // Listar todos os produto
	    public List<Produto> buscarProduto() {
	        return produtoRepository.findAll();
	    }

	    // Buscar produto por ID
	    public Produto buscarProdutoPorId(Long id) {
	        return produtoRepository.findById(id).orElse(null);
	    }

	    // Salvar produto
	    public Produto criarProduto(Produto produto) {
	        return produtoRepository.save(produto);
	    }

	    // Deletar produto
	    public void excluirProduto(Long id) {
	    	produtoRepository.deleteById(id);
	    }

}