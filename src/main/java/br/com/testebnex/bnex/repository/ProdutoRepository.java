package br.com.testebnex.bnex.repository;

import br.com.testebnex.bnex.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
