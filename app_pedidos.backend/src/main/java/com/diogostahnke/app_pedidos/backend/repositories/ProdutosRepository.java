package com.diogostahnke.app_pedidos.backend.repositories;

import com.diogostahnke.app_pedidos.backend.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {
    List<Produtos> findByIdIn(List<Integer> ids);
}
