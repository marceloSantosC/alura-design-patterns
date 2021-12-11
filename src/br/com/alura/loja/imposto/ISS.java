package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    private static final BigDecimal PERCENTUAL_ISS = new BigDecimal("0.1");

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(PERCENTUAL_ISS);
    }
}
