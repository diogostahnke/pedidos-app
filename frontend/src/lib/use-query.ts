import { useQuery } from "@tanstack/react-query";
import { getPedidos, getProdutos } from "./api-fetch";

const usePedidos = () =>
  useQuery({
    queryKey: ["pedidos"],
    queryFn: getPedidos
  });

const useProdutos = () =>
  useQuery({
    queryKey: ["produtos"],
    queryFn: getProdutos
  });

export { usePedidos, useProdutos };
