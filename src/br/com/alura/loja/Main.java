package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculoImpostoService;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100.00"));
        CalculoImpostoService calculoImpostoService = new CalculoImpostoService();

        Imposto imposto = new ICMS();

        BigDecimal valorICMS = calculoImpostoService.calcularImposto(orcamento, imposto);
        System.out.println(valorICMS);

        imposto = new ISS();
        BigDecimal valorISS = calculoImpostoService.calcularImposto(orcamento, imposto);
        System.out.println(valorISS);
    }
}
