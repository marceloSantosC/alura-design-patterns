package br.com.alura.loja.orcamento;

import br.com.alura.loja.http.HTTPAdapter;

public class RegistroDeOrcamento {

    private static final String URL = "localhost:8080/orcamento";

    private final HTTPAdapter httpAdapter;

    public RegistroDeOrcamento(HTTPAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        httpAdapter.post(URL, orcamento);
    }
}
