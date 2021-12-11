package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculoImpostoService;
import br.com.alura.loja.imposto.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100.00"));
        CalculoImpostoService calculoImpostoService = new CalculoImpostoService();

        BigDecimal imposto = calculoImpostoService.calcularImposto(orcamento, TipoImposto.ISS);
        System.out.println(imposto);
    }
}
