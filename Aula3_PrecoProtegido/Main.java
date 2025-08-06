package Aula3_PrecoProtegido;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.0);
        System.out.println(produto.getNome() + " custa R$ " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Após desconto: R$ " + produto.getPreco());

        produto.aplicarDesconto(110);
        System.out.println("Após desconto excessivo: R$ " + produto.getPreco());
    }
}