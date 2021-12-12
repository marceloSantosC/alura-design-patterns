package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public void aprovar(Orcamento orcamento) {
        throw new UnsupportedOperationException("Orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new UnsupportedOperationException("Orçamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new UnsupportedOperationException("Orçamento não pode ser finalizado");
    }

    public abstract BigDecimal calcularDesconto(Orcamento orcamento);
}