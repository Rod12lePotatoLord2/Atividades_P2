                                                                    // Exemplo Prático: Classe Aluno
public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();
                                                                    // Dados do Objeto aluno01
        aluno01.nome = "Rodrigo Lima Barbosa";
        aluno01.idade = 22;
        aluno01.matricula = 1234567890;
        aluno01.curso = "Bacharelado em Engenharia de Software";
        float media = aluno01.media(8, 9);

        aluno02.nome = "Mason Rether";
        aluno02.idade = 34;
        aluno02.matricula = 123456789;
        aluno02.curso = "Aurora Radiante";

        aluno01.exibirDados();
        aluno02.exibirDados();

    }
}