package com.diogostahnke.app_pedidos.backend.enums;

public enum MensagemDeErro {
    PRODUTO_REPETIDO("Um ou mais produtos estão repetidos"),
    PRODUTO_NAO_ENCONTRADO("Um ou mais produtos não foram encontrados");

    private final String mensagem;

    MensagemDeErro(final String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return mensagem;
    }
}
