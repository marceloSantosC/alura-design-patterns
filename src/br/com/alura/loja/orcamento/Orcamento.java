package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.OrcamentoAberto;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

    private List<Orcavel> itensOrcamento;
    private BigDecimal valor;
    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itensOrcamento = new ArrayList<>();
        this.situacaoOrcamento = new OrcamentoAberto();
    }

    public void adicionarItem(Orcavel itemOrcamento) {
        this.valor = valor.add(itemOrcamento.getValor());
        this.itensOrcamento.add(itemOrcamento);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeItens() {
        return itensOrcamento.size();
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
        situacaoOrcamento.reprovar(this);
    }

    public void finalizar() {
        situacaoOrcamento.finalizar(this);
    }

}
