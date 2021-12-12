package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoBaseadoEmPrecoMinimoCompra extends Desconto {

    private static final BigDecimal VALOR_MINIMO_EM_COMPRAS_PARA_DESCONTO = new BigDecimal("500");
    private static final BigDecimal PERCENTUAL_DESCONTO = new BigDecimal("0.1");

    public DescontoBaseadoEmPrecoMinimoCompra(Desconto proximoDescontoASerAplicado) {
        super(proximoDescontoASerAplicado);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(PERCENTUAL_DESCONTO);
    }

    @Override
    protected boolean deveCalcularDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(VALOR_MINIMO_EM_COMPRAS_PARA_DESCONTO) > 0;
    }

}
