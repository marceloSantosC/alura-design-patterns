package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class OrcamentoAberto extends SituacaoOrcamento {


    @Override
    public BigDecimal calcularDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new OrcamentoAprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new OrcamentoReprovado());
    }
}
