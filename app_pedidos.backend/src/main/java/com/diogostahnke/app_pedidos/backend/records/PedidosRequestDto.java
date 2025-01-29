package com.diogostahnke.app_pedidos.backend.records;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record PedidosRequestDto( @NotEmpty(message = "Informe no mínimo 1 produto") List<Integer> produtos) { };