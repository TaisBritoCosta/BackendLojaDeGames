package com.generation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
	
	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(String nome);
}
