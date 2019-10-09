package model;


public class Produto 
{
    private String nome, categoria, marca, fornecedor;
    private int quantidade;
    private double preco;

    public Produto(String nome, String categoria, String marca, String fornecedor, int quantidade, double preco) 
    {
        this.nome = nome;
        this.categoria = categoria;
        this.marca = marca;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", categoria=" + categoria + ", marca=" + marca + ", fornecedor=" + fornecedor + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
    
    
    
    
}
