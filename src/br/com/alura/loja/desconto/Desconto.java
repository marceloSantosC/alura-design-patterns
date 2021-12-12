package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;

public abstract class Desconto {

    protected final Desconto proximoDescontoASerAplicado;

    public Desconto(Desconto proximoDescontoASerAplicado) {
        this.proximoDescontoASerAplicado = proximoDescontoASerAplicado;
    }

    public BigDecimal calcularDesconto(Orcamento orcamento) {
        if (deveCalcularDesconto(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximoDescontoASerAplicado.calcularDesconto(orcamento);
    }

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveCalcularDesconto(Orcamento orcamento);
}
