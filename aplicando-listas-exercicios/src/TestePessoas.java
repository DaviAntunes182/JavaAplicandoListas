
import br.com.davi.screematch.models.Pessoa;

import java.util.ArrayList;

public class TestePessoas {
    public static void main(String[] args) {
        br.com.davi.screematch.models.Pessoa p1 = new Pessoa("Davi", 24);
        var p2 = new Pessoa("Nichollas", 23);
        Object p3 = new Pessoa("Seberino", 45);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add((Pessoa) p3);

        System.out.println(pessoas.size());
        System.out.println(pessoas.get(0));
        for(Pessoa p : pessoas){
            System.out.print(p);
        }
    }
}
