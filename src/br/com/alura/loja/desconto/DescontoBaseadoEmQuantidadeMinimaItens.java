package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoBaseadoEmQuantidadeMinimaItens extends Desconto {

    private static final Integer QUANTIDADE_ITENS_MINIMA_PARA_DESCONTO = 5;
    private static final BigDecimal PERCENTUAL_DESCONTO = new BigDecimal("0.05");

    public DescontoBaseadoEmQuantidadeMinimaItens(Desconto proximoDescontoASerAplicado) {
        super(proximoDescontoASerAplicado);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > QUANTIDADE_ITENS_MINIMA_PARA_DESCONTO) {
            return orcamento.getValor().multiply(PERCENTUAL_DESCONTO);
        }
        return proximoDescontoASerAplicado.calcular(orcamento);
    }
}
