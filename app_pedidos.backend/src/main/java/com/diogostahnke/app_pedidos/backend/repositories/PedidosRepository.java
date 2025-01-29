package com.diogostahnke.app_pedidos.backend.repositories;

import com.diogostahnke.app_pedidos.backend.models.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Integer> {}