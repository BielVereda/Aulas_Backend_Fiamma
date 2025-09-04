public class ContaPJ extends Conta {

    public ContaPJ(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 1.50;
        double total = valor + taxa;

        if (valor > 0 && total <= saldo) {
            saldo -= total;
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + taxa);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    @Override
    public double calcularTarifaMensal() {
        return 20.00;
    }
}
