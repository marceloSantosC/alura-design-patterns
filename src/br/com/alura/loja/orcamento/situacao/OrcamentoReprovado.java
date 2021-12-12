package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class OrcamentoReprovado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDesconto(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new OrcamentoFinalizado());
    }
}
