import java.util.Scanner;

public class Main {
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

        System.out.print("\nDigite o valor para saque (menor que o saldo): R$ ");
        double saqueMenor = input.nextDouble();
        conta.sacar(saqueMenor);
        conta.exibirSaldo();

        System.out.print("\nDigite o valor para saque (maior que o saldo): R$ ");
        double saqueMaior = input.nextDouble();
        conta.sacar(saqueMaior);
        conta.exibirSaldo();

        input.close();
    }
}