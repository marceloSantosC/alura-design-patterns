package br.com.alura.loja;

import br.com.alura.loja.desconto.*;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.DadosGeracaoPedido;
import br.com.alura.loja.pedido.GeracaoPedidoHandler;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);


        DadosGeracaoPedido dadosGeracaoPedido = new DadosGeracaoPedido(cliente, valorOrcamento, quantidadeItens);
        AcaoAposGerarPedido enviarEmail = new EnviarEmailPedido();
        AcaoAposGerarPedido salvarPedido = new SalvarPedido();
        GeracaoPedidoHandler geracaoPedidoHandler = new GeracaoPedidoHandler(Arrays.asList(enviarEmail, salvarPedido));
        geracaoPedidoHandler.gerarPedidoDepoisExecutarAcoes(dadosGeracaoPedido);
    }
}
