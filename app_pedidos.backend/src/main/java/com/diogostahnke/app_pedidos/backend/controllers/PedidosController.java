package com.diogostahnke.app_pedidos.backend.controllers;

import com.diogostahnke.app_pedidos.backend.models.Pedidos;
import com.diogostahnke.app_pedidos.backend.records.PedidosRequestDto;
import com.diogostahnke.app_pedidos.backend.repositories.ProdutosRepository;
import com.diogostahnke.app_pedidos.backend.services.PedidosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
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

    @PostMapping()
    public ResponseEntity<Pedidos> criaPedido(@Valid @RequestBody PedidosRequestDto pedidosRequestDto) {

        BigDecimal valor = pedidosService.calcularPrecoDoPedido(pedidosRequestDto.produtos());

        return ResponseEntity.ok(pedidosService.criarPedido(valor));
    }
}