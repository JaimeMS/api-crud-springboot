package io.github.jaimems.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.jaimems.crud.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
