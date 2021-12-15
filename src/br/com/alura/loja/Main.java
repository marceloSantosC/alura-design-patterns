package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));


        Orcamento orcamentoProxy = new OrcamentoProxy(orcamento);

        System.out.println(orcamentoProxy.getValor()); // Demora os 2s
        System.out.println(orcamentoProxy.getValor()); // Pega do proxy


    }
}
