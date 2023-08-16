package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("Java", "Java é uma linguagem de programação");
        dicionario.adicionarPalavra("HTML5", "HTML5 é uma das primeiras e principais linguagens de marcação da web");
        dicionario.adicionarPalavra("Python", "Python é uma linguagem de programação de alto nível");
        dicionario.adicionarPalavra("CSS", "Cascading Style Sheets é um mecanismo para adicionar estilos a uma página web");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("CSS");

        dicionario.exibirPalavras();

        System.out.println("A definição do Java: " + dicionario.pesquisarPorPalavra("Java"));
    }
}
