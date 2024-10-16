package br.com.davi.screematch.models;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal preco;
    private int quantidade;

    public Produto(String nome, String valor, int quantidade) {
        BigDecimal preco = new BigDecimal(valor);
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco.doubleValue();
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return String.format("""
                qtd %d - Produto: %s R$ %.3f""", getQuantidade(), getNome(), getPreco());
    }
}
