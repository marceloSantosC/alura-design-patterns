package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected final Desconto proximoDescontoASerAplicado;

    public Desconto(Desconto proximoDescontoASerAplicado) {
        this.proximoDescontoASerAplicado = proximoDescontoASerAplicado;
    }


    public abstract BigDecimal calcular(Orcamento orcamento);
}
