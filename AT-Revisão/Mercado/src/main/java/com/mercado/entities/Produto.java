package com.mercado.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	//atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "categoria", nullable = false, length = 100)
	private String categoria;

	@Column(name = "estoque", nullable = false, length = 100)
	private int estoque;
	
	@Column(name = "preco", nullable = false, length = 100)
	private int preco;
	
	//construtores
	
	public Produto() {
		
	}
	
	public Produto(Long id_produto, String nome, String categoria, int estoque, int preco) {
		this.id_produto = id_produto;
		this.nome = nome;
		this.categoria = categoria;
		this.estoque = estoque;
		this.preco = preco;
	}
	
	@ManyToOne
	@JoinColumn(name = "CLIENTE_id_cliente")
	private Cliente cliente;

	//getters e setters
	
	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
}
