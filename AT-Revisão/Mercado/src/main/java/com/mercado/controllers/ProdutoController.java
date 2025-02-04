package com.mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercado.entities.Produto;
import com.mercado.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	 @Autowired
	    private ProdutoService produtoService;

	    @GetMapping
	    public List<Produto> buscarProduto() {
	        return produtoService.buscarProduto();
	    }
	    @GetMapping("/id")
	    public ResponseEntity<Object> buscarProdutoPorId(@PathVariable Long id){
	    	Produto produto = produtoService.buscarProdutoPorId(id);
	    	
	    	if(produto != null) {
	    		return ResponseEntity.ok(produto);
	    	} else {
	    		return ResponseEntity.status(404).body("Produto com ID" + id + "não existe");
	    	}
	    }
	    
	    @PostMapping
	    public Produto criarProduto(@RequestBody Produto produto) {
	        return produtoService.criarProduto(produto);
	    }

	    @DeleteMapping("/{id}")
	    public void excluirProduto(@PathVariable Long id) {
	    	produtoService.excluirProduto(id);
	    }
}

