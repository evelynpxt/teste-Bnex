package br.com.testebnex.bnex.service;

import br.com.testebnex.bnex.model.Produto;
import br.com.testebnex.bnex.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {


    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto>listarTodos(){
        return produtoRepository.findAll();
    }
    public Optional<Produto> buscarPoId(Long id){
        return produtoRepository.findById(id);

    }

    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);

    }

    public void remover(Long id){
        produtoRepository.deleteById(id);
    }


    public Optional<Object> buscarPorId(Long id) {
            return null;
    }
}
