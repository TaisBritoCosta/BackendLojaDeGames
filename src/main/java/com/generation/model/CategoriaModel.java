package com.generation.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")

public class CategoriaModel {



		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		@NotNull(message = "O atributo tipo precisa ser preenchido!")
		private String tipo;
		
		
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List<ProdutoModel> Produto;

	
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public List<ProdutoModel> getProduto() {
			return Produto;
		}

		public void setProduto(List<ProdutoModel> produto) {
			Produto = produto;
		}

		
	}
	
	