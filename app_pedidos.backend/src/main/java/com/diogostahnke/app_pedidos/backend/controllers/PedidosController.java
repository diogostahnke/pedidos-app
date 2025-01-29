package com.diogostahnke.app_pedidos.backend.controllers;

import com.diogostahnke.app_pedidos.backend.models.Pedidos;
import com.diogostahnke.app_pedidos.backend.repositories.ProdutosRepository;
import com.diogostahnke.app_pedidos.backend.services.PedidosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidosController {
    private final PedidosService pedidosService;
    private final ProdutosRepository produtosRepository;

    @GetMapping()
    public ResponseEntity<List<Pedidos>> listaPedidos() {
        return ResponseEntity.ok(pedidosService.listarPedidos());
    }
}
