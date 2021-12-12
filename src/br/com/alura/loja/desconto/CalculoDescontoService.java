package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculoDescontoService {

    // Os descontos serão calculados em sequência e se nenhum existir será retornado BigDecimal.ZERO
    public BigDecimal calcular(Orcamento orcamento) {

        Desconto semDesconto = new SemDesconto();
        Desconto descontoPorQuantidade = new DescontoBaseadoEmQuantidadeMinimaItens(semDesconto);
        Desconto descontoPorValorCompra = new DescontoBaseadoEmPrecoMinimoCompra(descontoPorQuantidade);
        return descontoPorValorCompra.calcularDesconto(orcamento);
    }
}
