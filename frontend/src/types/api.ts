export interface Produto {
  id: number;
  titulo: string;
  preco: number;
}

export interface Pedido {
  id: number;
  valor: string;
  criado_em: string;
}

export interface PedidoRequest {
  valor: string;
  produtos: Produto["id"][];
}
