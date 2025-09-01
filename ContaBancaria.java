public class ContaBancaria {
    String nome;
    int numeroConta;
    double saldo = 1000.00;

    public void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }
    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        }
        else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para depositar, operação não realizada.");
        }
        else if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        }
        else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }
}
