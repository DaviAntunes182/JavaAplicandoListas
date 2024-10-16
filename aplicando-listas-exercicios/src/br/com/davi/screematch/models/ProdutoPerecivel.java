package br.com.davi.screematch.models;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, String valor, int quantidade, String dataValidade) {
        super(nome, valor, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                 Data de Validade: %s
                """,getDataValidade());
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
