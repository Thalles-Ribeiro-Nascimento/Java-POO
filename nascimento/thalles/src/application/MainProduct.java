package nascimento.thalles.src.application;

import nascimento.thalles.src.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Produto tv = new Produto();

        System.out.println("Entre com o produto: ");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Estoque: ");
        int quantidade = sc.nextInt();

        tv.setName(nome);
        tv.setPrice(preco);
        tv.setQuantity(quantidade);

        System.out.println(
                "Nome: " + tv.getName() +
                         ", $" + tv.getPrice() +
                         ", " + tv.getQuantity() +
                         " units, Total: $" + tv.valorTotalEmEstoque()
        );

        System.out.print("Entre com mais produtos no estoque: ");
        int produtosEstoque = sc.nextInt();
        tv.addProduto(produtosEstoque);

        System.out.println(
                "Update stock"
                        + tv.getName() +
                        ", $" + tv.getPrice() +
                        ", " + tv.getQuantity() +
                        " units, Total: $" + tv.valorTotalEmEstoque()
        );

        System.out.print("Retire produtos do estoque: ");
        int rmProduto = sc.nextInt();
        tv.rmProduto(rmProduto);

        System.out.println(
                "Update stock"
                        + tv.getName() +
                        ", $" + tv.getPrice() +
                        ", " + tv.getQuantity() +
                        " units, Total: $" + tv.valorTotalEmEstoque()
        );


        sc.close();
    }

}
