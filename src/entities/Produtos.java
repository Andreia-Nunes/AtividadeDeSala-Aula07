package entities;

public class Produtos {
    private String nome;
    private int quantidade;
    private double preco;

    public Produtos(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(int novaQuantidade){
        this.quantidade = novaQuantidade;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double novoPreco){
        this.preco = novoPreco;
    }

    public double valorTotalEmEstoque(){
        return this.preco * this.quantidade;
    }
}
