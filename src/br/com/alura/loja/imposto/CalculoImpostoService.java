package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculoImpostoService {

    public BigDecimal calcularImposto(Orcamento orcamento, TipoImposto tipoImposto) {

        switch (tipoImposto) {
            case ISS:
                return  orcamento.getValor().multiply(new BigDecimal("0.1"));
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.2"));
            default:
                throw new IllegalArgumentException("O cálculo para esse tipo de imposto não foi definido");
        }
    }
}
