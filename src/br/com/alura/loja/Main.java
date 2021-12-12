package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculoDescontoService;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100.00"), 10);

        CalculoDescontoService calculoDescontoService = new CalculoDescontoService();
        BigDecimal valorDesconto = calculoDescontoService.calcular(orcamento);
        System.out.println(valorDesconto);
    }
}
