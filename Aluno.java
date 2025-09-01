public class Aluno {
    String nome, curso;
    int matricula, idade;

    public float media (float n1, float n2){
        return (n1 + n2) / 2;
    }

    public String situacaoAluno (float media){
        if (media >= 7){
            return "Aprovado por Média";
        } else if (media <= 3){
            return "Reprovado por Média";
        }
        else{
            return "Em Recuperação";
        }
    }
    public void exibirDados (){
        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Matricula do aluno: " + matricula);
        System.out.println("Curso do aluno: " + curso);
    }
}
