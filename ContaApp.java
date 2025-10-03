import java.util.Scanner;

public class ContaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o nome do titular da conta: ");
        conta.setTitular(input.nextLine());

        System.out.print("Digite o número da conta: ");
        conta.setNumeroConta(input.nextInt());

        System.out.println("\n--- Informações da Conta ---");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da conta: " + conta.getNumeroConta());
        conta.exibirSaldo();

        System.out.print("\nDigite o valor do depósito: R$ ");
        double valorDeposito = input.nextDouble();
        conta.depositar(valorDeposito);
        conta.exibirSaldo();

        System.out.print("\nDigite o valor para saque: R$ ");
        double valorSaque = input.nextDouble();
        conta.sacar(valorSaque);
        conta.exibirSaldo();

        input.close();
    }
}

// Classe ContaBancaria
class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque, operação não realizada.");
        } else if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }
}
