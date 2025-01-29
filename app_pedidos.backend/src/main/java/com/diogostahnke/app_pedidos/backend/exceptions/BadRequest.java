package com.diogostahnke.app_pedidos.backend.exceptions;

import com.diogostahnke.app_pedidos.backend.enums.MensagemDeErro;

public class BadRequest extends RuntimeException {
    public BadRequest(MensagemDeErro message) {
        super(String.valueOf(message));
    }
}
