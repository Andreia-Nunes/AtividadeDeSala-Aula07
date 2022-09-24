package app;

import entities.Produtos;

import java.util.Locale;

public class TesteProdutos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produtos p1 = new Produtos("Smart Tv Samsung Led 43\" Full Hd", 10, 2100.00);
        Produtos p2 = new Produtos("Console Playstation 5 - PS5 + Controle Sem Fio Dualsense Midnight Black", 25, 4899.99);

        System.out.printf("Produto 1: %s\n", p1.getNome());
        System.out.printf("Preço: R$ %.2f\n", p1.getPreco());
        System.out.printf("Quantidade em estoque: %d\n", p1.getQuantidade());
        System.out.printf("Valor total em estoque: R$ %.2f\n", p1.valorTotalEmEstoque());

        p1.setPreco(2220.00);

        System.out.println("HOUVE INFLAÇÃO!");
        System.out.printf("Novo preço: R$ %.2f\n", p1.getPreco());

        System.out.println();

        System.out.printf("Produto 2: %s\n", p2.getNome());
        System.out.printf("Preço: R$ %.2f\n", p2.getPreco());
        System.out.printf("Quantidade: %d\n", p2.getQuantidade());
        System.out.printf("Valor total em estoque: R$ %.2f\n", p2.valorTotalEmEstoque());

        p2.setPreco(3500.00);

        System.out.println("DIA DE BLACK FRIDAY ;)");
        System.out.printf("Novo preço: R$ %.2f\n", p2.getPreco());

    }
}
