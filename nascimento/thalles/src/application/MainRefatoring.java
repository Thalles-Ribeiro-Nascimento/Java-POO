package nascimento.thalles.src.application;

import nascimento.thalles.src.entities.Produto;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MainRefatoring {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        ArrayList<Produto> produto = new ArrayList<>();

        System.out.println("Selecione uma das opções: ");
        System.out.printf(
                "1 - Adicionar Produto%n" +
                "2 - Excluir produto%n" +
                "3 - Listar produtos%n" +
                "4 - Listar 1 produto%n" +
                "5 - Encerrar programa%n" +
                        "Opção: "
        );
        int option = sc.nextInt();

        do{
            switch (option){
                case 1:
                    System.out.println("Quantos produtos deseja armazenar? ");
                    int quantidade = sc.nextInt();

                    for (int i = 0; i < quantidade; i++) {

                        System.out.print("Nome do produto: ");
                        String name = sc.next();
                        System.out.print("Preço do Produto: ");
                        double price = sc.nextDouble();
                        System.out.print("Quantidade do produto: ");
                        int quantity = sc.nextInt();

                        Produto product = new Produto();

                        product.setName(name);
                        product.setPrice(price);
                        product.setQuantity(quantity);

                        produto.add(product);
                    }
                    break;
                case 2:
                    System.out.print("Selecione o produto que deseja excluir: ");
                    int indice = sc.nextInt();
                    produto.remove(indice);

                    System.out.println("Produto excluído!");
                    break;
                case 3:
                    System.out.print("Produtos: " + produto);
                    break;
                case 4:
                    System.out.print("Fale o produto que deseja: ");
                    int index = sc.nextInt();
                    System.out.print("Produto: " + produto.get(index));
                    break;
            }
        }while (option != 5); {
            sc.close();

        }



    }
}
