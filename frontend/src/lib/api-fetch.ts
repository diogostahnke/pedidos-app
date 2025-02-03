import { Pedido, Produto } from "@/types/api";
import { api } from "./api-client";

async function getPedidos(): Promise<Pedido[]> {
  const response = await api.get("pedidos");

  return response.data;
}

async function getProdutos(): Promise<Produto[]> {
  const response = await api.get("produtos");

  return response.data;
}

export { getPedidos, getProdutos };
