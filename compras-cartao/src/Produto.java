public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("""
                %s - %.2f
                """,getNome(), getPreco());
    }

    @Override
    public int compareTo(Produto produto) {
        return (int) (produto.getPreco() - this.getPreco());
    }
}
