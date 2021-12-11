package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    private static final BigDecimal PERCENTUAL_ICMS = new BigDecimal("0.2");

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(PERCENTUAL_ICMS);
    }
}
