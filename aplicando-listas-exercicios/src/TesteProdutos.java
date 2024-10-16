import br.com.davi.screematch.models.Produto;
import br.com.davi.screematch.models.ProdutoPerecivel;

import java.util.ArrayList;

public class TesteProdutos {
    public static void main(String[] args) {
        var p1 = new Produto("Banana", "4.99", 3);
        var p2 = new Produto("Maçã", "12.49", 10);
        var p3 = new Produto("Abacaxi", "7.5", 2);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        produtos.forEach(System.out::println);

        var pr1 = new ProdutoPerecivel("Queijo", "35.99", 2, "30/09/2024");
        System.out.println(pr1);
    }
}
