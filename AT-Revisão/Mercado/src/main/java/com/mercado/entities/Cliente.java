package com.mercado.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	//atributos
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_cliente;
		
		@Column(name = "nome", nullable = false, length = 100)
		private String nome;
		
		@Column(name = "cpf", nullable = false, length = 11, unique = true)
		private String cpf;

		@Column(name = "email", nullable = false, length = 100, unique = true)
		private String email;
		
		@Column(name = "numero", nullable = false, length = 11, unique = true)
		private String numero;
		
		//construtores
		
		public Cliente() {
			
		}
		
		public Cliente(Long id_cliente, String nome, String cpf, String email, String numero) {
			this.id_cliente = id_cliente;
			this.nome = nome;
			this.cpf = cpf;
			this.email = email;
			this.numero = numero;
		}
		
		//getters e setters

		public Long getId_cliente() {
			return id_cliente;
		}

		public void setId_cliente(Long id_cliente) {
			this.id_cliente = id_cliente;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

	}