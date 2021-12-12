package br.com.alura.loja;

import br.com.alura.loja.desconto.*;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento1 = new Orcamento(new BigDecimal("100.00"), 10);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000.00"), 2);
        Orcamento orcamento3 = new Orcamento(new BigDecimal("100.00"), 1);
        Orcamento orcamento4 = new Orcamento(new BigDecimal("1000.00"), 15);

        CalculoDescontoService calculoDescontoService = new CalculoDescontoService();


        System.out.println(calculoDescontoService.calcular(orcamento1));
        System.out.println(calculoDescontoService.calcular(orcamento2));
        System.out.println(calculoDescontoService.calcular(orcamento3));
        System.out.println(calculoDescontoService.calcular(orcamento4));
    }
}
