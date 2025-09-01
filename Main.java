import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno01 = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno01.nome = input.nextLine();

        System.out.println("Digite a idade do aluno: ");
        aluno01.idade = input.nextInt();

        System.out.println("Digite o matricula do aluno: ");
        aluno01.matricula = input.nextInt();
        input.nextLine();

        System.out.println("Digite o curso do aluno: ");
        aluno01.curso = input.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        float n1 = input.nextFloat();
        System.out.println("Digite a segunda nota do aluno: ");
        float n2 = input.nextFloat();

        float media = aluno01.media(n1, n2);

        aluno01.exibirDados();
        System.out.println("Média do aluno: " + media);
        System.out.println("Situação do aluno: " + aluno01.situacaoAluno(media));

        Livro livro01 = new Livro();
        input.nextLine();

        System.out.println("Informe o título do livro: ");
        livro01.setTitulo(input.nextLine());

        System.out.println("Informe o autor do livro: ");
        livro01.setAutor(input.nextLine());

        System.out.println("Informe a quantidade de páginas: ");
        livro01.setPaginas(input.nextInt());

        livro01.exibirInformacoes();

        System.out.println("\nVocê deseja realizar um empréstimo desse livro? (s/n)");
        input.nextLine();
        String escolha = input.nextLine();

        if (escolha.equalsIgnoreCase("s")) {
            livro01.emprestar();
        }
        livro01.exibirInformacoes();

        System.out.println("\nVocê deseja devolver o livro emprestado? (s/n)");
        escolha = input.nextLine();
        if (escolha.equalsIgnoreCase("s")) {
            livro01.devolver();
        }
        livro01.exibirInformacoes();

        input.close();
    }
}