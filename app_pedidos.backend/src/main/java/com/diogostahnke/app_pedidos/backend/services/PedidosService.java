package com.diogostahnke.app_pedidos.backend.services;

import com.diogostahnke.app_pedidos.backend.enums.MensagemDeErro;
import com.diogostahnke.app_pedidos.backend.exceptions.BadRequest;
import com.diogostahnke.app_pedidos.backend.models.Pedidos;
import com.diogostahnke.app_pedidos.backend.models.Produtos;
import com.diogostahnke.app_pedidos.backend.repositories.PedidosRepository;
import com.diogostahnke.app_pedidos.backend.repositories.ProdutosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class PedidosService {
    private final PedidosRepository pedidosRepository;
    private final ProdutosRepository produtosRepository;

    public List<Pedidos> listarPedidos() {
        return pedidosRepository.findAll();
    }

    public BigDecimal calcularPrecoDoPedido(List<Integer> idsList) {
        List<Produtos> produtos = produtosRepository.findByIdIn(idsList);

        Set<Integer> idsSet = new HashSet<>(idsList);

        if (idsSet.size() != idsList.size()) {
            throw new BadRequest(MensagemDeErro.PRODUTO_REPETIDO);
        }

        if (produtos.size() != idsList.size()) {
            throw new BadRequest(MensagemDeErro.PRODUTO_NAO_ENCONTRADO);
        }

        return produtos.stream()
                .map(Produtos::getPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add).multiply(new BigDecimal("1.1"));
    }

    public Pedidos criarPedido(BigDecimal valor) {
        Pedidos pedido = pedidosRepository.save(new Pedidos(valor));

        return pedido;
    }
}
