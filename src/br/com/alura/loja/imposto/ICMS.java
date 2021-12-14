package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    private static final BigDecimal PERCENTUAL_ICMS = new BigDecimal("0.2");

    public ICMS(Imposto proximoImposto) {
        super(proximoImposto);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(PERCENTUAL_ICMS);
    }
}
