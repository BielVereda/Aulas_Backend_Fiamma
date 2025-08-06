package Aula3_PrecoProtegido;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço não pode ser negativo. Valor não alterado.");
        } else {
            this.preco = preco;
        }
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * percentual / 100.0;
        double novoPreco = preco - desconto;
        if (novoPreco < 0) {
            System.out.println("Desconto muito alto! Preço não pode ser negativo.");
        } else {
            preco = novoPreco;
        }
    }
}