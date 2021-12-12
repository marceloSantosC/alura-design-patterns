package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;

public class CalculoDescontoService {


    // Toda vez que é criado uma regra para desconto é necessário adicionar um IF
    // Strategy não funciona porque ainda seria necessário ter os IFs para definir qual implementação será aplicada
    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}
