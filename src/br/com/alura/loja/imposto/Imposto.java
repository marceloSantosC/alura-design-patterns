package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private final Imposto proximoImposto;

    protected Imposto(Imposto proximoImposto) {
        this.proximoImposto = proximoImposto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal imposto = realizarCalculo(orcamento);
        BigDecimal valorProximoImposto = BigDecimal.ZERO;
        if (proximoImposto != null) {
            valorProximoImposto = proximoImposto.realizarCalculo(orcamento);
        }
        return imposto.add(valorProximoImposto);
    }


}
