package com.diogostahnke.app_pedidos.backend.services;

import com.diogostahnke.app_pedidos.backend.models.Produtos;
import com.diogostahnke.app_pedidos.backend.repositories.ProdutosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutosService {
    private final ProdutosRepository produtosRepository;

    public List<Produtos> buscarProdutos() {
        return produtosRepository.findAll();
    }
}
