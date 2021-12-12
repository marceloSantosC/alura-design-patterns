package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeracaoPedidoHandler {

    private final List<AcaoAposGerarPedido> acoes;

    public GeracaoPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void gerarPedidoDepoisExecutarAcoes(DadosGeracaoPedido dadosGeracaoPedido) {
        Orcamento orcamento = new Orcamento(dadosGeracaoPedido.getValorOrcamento(), dadosGeracaoPedido.getQuantidadeItens());
        Pedido pedido = new Pedido(dadosGeracaoPedido.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(acao -> acao.executar(pedido));
    }
}
