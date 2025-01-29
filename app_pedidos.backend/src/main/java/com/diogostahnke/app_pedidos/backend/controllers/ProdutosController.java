package com.diogostahnke.app_pedidos.backend.controllers;

import com.diogostahnke.app_pedidos.backend.models.Produtos;
import com.diogostahnke.app_pedidos.backend.services.ProdutosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutosController {
    private final ProdutosService produtosService;

    @GetMapping
    public ResponseEntity<List<Produtos>> listarProdutos() {
        return ResponseEntity.ok(produtosService.buscarProdutos());
    }
}
