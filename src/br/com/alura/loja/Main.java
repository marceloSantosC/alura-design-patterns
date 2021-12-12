package br.com.alura.loja;

import br.com.alura.loja.http.HTTPAdapter;
import br.com.alura.loja.http.JavaHttpClientAdapter;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 10);
        HTTPAdapter adapter = new JavaHttpClientAdapter();
        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(adapter);
        registroDeOrcamento.registrar(orcamento);
    }
}
