import OrdemDeTransportePage from "@/app/routes/ordem-de-transporte/Page";
import LandingPage from "@/app/routes/page";
import PedidosPage from "@/app/routes/pedidos/page";
import ProdutosPage from "@/app/routes/produtos/page";

export const paths = [
  {
    title: "Dashboard",
    path: "",
    Component: LandingPage,
  },

  {
    title: "Pedidos",
    path: "pedidos",
    Component: PedidosPage,
  },
  {
    title: "Produtos",
    path: "produtos",
    Component: ProdutosPage
  },
  {
    title: "Ordem de Transporte",
    path: "ordem-de-transporte",
    Component: OrdemDeTransportePage
  },
];
