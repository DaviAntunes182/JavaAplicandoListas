import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double limite, precoProduto, saldo = 0;
        int resp = 1;
        String nomeProduto, msg = "";
        List<Produto> compras = new ArrayList<>();
        System.out.print("Digite o limite do cartão: ");
        limite = sc.nextDouble();

        while(resp != 0) {
            sc = new Scanner(System.in);
            System.out.println("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();

            System.out.println("Digite o preço do produto");
            precoProduto = sc.nextDouble();

            var p = new Produto(nomeProduto, precoProduto);

            if(limite >= precoProduto){
                compras.add(p);
                limite -= precoProduto;
                saldo += precoProduto;
            }else{
                System.out.println("Saldo insuficiente");
                break;
            }
            System.out.println("Digite 0 para sair ou 1 para continuar");
            resp = sc.nextInt();
            while (resp != 1 && resp != 0){
                System.out.println("Digite 0 para sair ou 1 para continuar");
                resp = sc.nextInt();
            }
        }
        Collections.sort(compras);
        
        for(Produto p : compras){
            msg += p.toString();
        }
        
        System.out.printf("""
                ********************************
                
                Compras realizadas:
                %s
                *******************************
                
                Saldo do cartão: %.2f
                Fatura a pagar: %.2f
                """,msg, limite, saldo);
    }
}
