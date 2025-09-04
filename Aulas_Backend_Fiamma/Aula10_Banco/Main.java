public class Main {
    public static void main(String[] args) {
        // Criando instâncias das contas
        Conta cc = new ContaCorrente("12345", "001", "João Silva", 1000);
        Conta cp = new ContaPoupanca("54321", "001", "Maria Oliveira", 1500);
        Conta pj = new ContaPJ("11223", "002", "Empresa XYZ", 5000);

        // Operações com Conta Corrente
        System.out.println("\n=== Conta Corrente ===");
        cc.depositar(500);
        cc.sacar(200);
        cc.exibirSaldo();
        System.out.println("Tarifa mensal: R$" + cc.calcularTarifaMensal());

        // Operações com Conta Poupança
        System.out.println("\n=== Conta Poupança ===");
        cp.depositar(300);
        cp.sacar(100);
        cp.exibirSaldo();
        System.out.println("Tarifa mensal: R$" + cp.calcularTarifaMensal());

        // Operações com Conta PJ
        System.out.println("\n=== Conta Pessoa Jurídica ===");
        pj.depositar(1000);
        pj.sacar(500); // + taxa
        pj.exibirSaldo();
        System.out.println("Tarifa mensal: R$" + pj.calcularTarifaMensal());
    }
}
