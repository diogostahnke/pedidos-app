package com.diogostahnke.app_pedidos.backend.services;

import com.diogostahnke.app_pedidos.backend.models.Pedidos;
import com.diogostahnke.app_pedidos.backend.repositories.PedidosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidosService {
    private final PedidosRepository pedidosRepository;

    public List<Pedidos> listarPedidos() {
        return pedidosRepository.findAll();
    }
}
