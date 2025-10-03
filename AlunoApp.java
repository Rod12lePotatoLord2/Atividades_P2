public class AlunoApp {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Rodrigo Lima";
        aluno1.idade = 22;
        aluno1.matricula = 1234567890;
        aluno1.curso = "Bach. Engenharia de Software";

        float n1 = 8.5f;
        float n2 = 9.0f;

        float media = aluno1.media(n1, n2);
        String situacao = aluno1.situacaoAluno(media);

        aluno1.exibirDados();
        System.out.println("Média do aluno: " + media);
        System.out.println("Situação do aluno: " + situacao);
    }
}

// Classe Aluno
class Aluno {
    String nome, curso;
    int matricula, idade;

    public float media(float n1, float n2) {
        return (n1 + n2) / 2;
    }

    public String situacaoAluno(float media) {
        if (media >= 7) {
            return "Aprovado por Média";
        } else if (media <= 3) {
            return "Reprovado";
        } else {
            return "Em Recuperação";
        }
    }

    public void exibirDados() {
        System.out.println("\nDados");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}
