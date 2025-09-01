public class Carro {
    String marca, modelo;
    int ano;
    int velocidadeAtual = 0;

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
            System.out.println("O carro acelerou " + valor + " km/h.");
        }
        else {
            System.out.println("Valor inválido.");
        }
    }

    public void frear(int valor) {
        if (valor > 0) {
            if (valor > velocidadeAtual) {
                velocidadeAtual = 0;
                System.out.println("O carro freou até parar completamente.");
            }
            else {
                velocidadeAtual -= valor;
                System.out.println("O carro reduziu " + valor + " km/h.");
            }
        }
        else {
            System.out.println("Valor inválido.");
        }
    }

    public void exibirStatus() {
        System.out.println("\n--- Status ---");
        System.out.println("Marca do Carro: " + marca);
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}
