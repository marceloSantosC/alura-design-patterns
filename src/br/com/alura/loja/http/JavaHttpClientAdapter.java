package br.com.alura.loja.http;

public class JavaHttpClientAdapter implements HTTPAdapter {


    @Override
    public void post(String url, Object body) {
        System.out.println("ENVIANDO DADOS PARA A URL " + url);
        System.out.println("DADOS: " + body.toString());
    }
}
