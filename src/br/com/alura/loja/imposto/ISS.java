package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {

    private static final BigDecimal PERCENTUAL_ISS = new BigDecimal("0.1");

    public ISS(Imposto proximoImposto) {
        super(proximoImposto);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(PERCENTUAL_ISS);
    }
}
