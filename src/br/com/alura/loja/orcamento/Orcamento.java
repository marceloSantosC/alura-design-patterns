package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.OrcamentoAberto;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private final BigDecimal valor;
    private final Integer quantidadeItens;
    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacaoOrcamento = new OrcamentoAberto();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

    public BigDecimal calcularDescontoExtra() {
        return situacaoOrcamento.calcularDesconto(this);
    }

    public void aprovar() {
        situacaoOrcamento.aprovar(this);
    }

    public void reprovar() {
        situacaoOrcamento.aprovar(this);
    }

    public void finalizar() {
        situacaoOrcamento.aprovar(this);
    }

}
