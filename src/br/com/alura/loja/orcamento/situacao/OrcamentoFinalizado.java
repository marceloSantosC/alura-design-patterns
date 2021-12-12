package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class OrcamentoFinalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDesconto(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
