package br.com.davi.screenmatch;

import br.com.davi.screenmatch.calculos.CalculadoraDeTempo;
import br.com.davi.screenmatch.calculos.Recomendacao;
import br.com.davi.screenmatch.models.Episode;
import br.com.davi.screenmatch.models.Filme;
import br.com.davi.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.setTitle("Poderoso Chefão");
        f1.setYear(1970);
        f1.setDuration(180);

//        System.out.println(f1.toString());
        f1.avalia(10);
        f1.avalia(8);
        f1.avalia(5);

        System.out.println(f1.toString());

        Filme f2 = new Filme();
        f2.setTitle("Avatar");
        f2.setYear(2023);
        f2.setDuration(200);

//        System.out.println(f1.toString());
        f2.avalia(9);
        f2.avalia(8);
        f2.avalia(9);

        System.out.println(f2.toString());
//        double num = 7.66667;
//        String msg = String.format("%.2f", num);
//        System.out.println(msg);

        Serie s1 = new Serie();
        s1.setTitle("Lost");
        s1.setYear(2000);
        s1.setSeasons(10);
        s1.setEpisodes(121);
        s1.setDurationAvg(45);
        s1.avalia(3);
        s1.avalia(4);
        s1.avalia(6);
        System.out.println(s1.toString());

        Episode ep1 = new Episode();
        ep1.setNumber(1);
        ep1.setSerie(s1);
        ep1.setViews(1000);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(f1);
        calculadora.inclui(f2);
        calculadora.inclui(s1);
        System.out.println(calculadora.getTempoTotel());

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtrar(f1);
        recomendacao.filtrar(f2);
        recomendacao.filtrar(ep1);
    }
}
