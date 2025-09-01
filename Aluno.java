public class Aluno {
    String nome, curso;
    int matricula, idade;

    public float media (float n1, float n2){        // Recebe 2 parâmetros, as notas do aluno
        return (n1 + n2) / 2;                      // Retorna o calculo da média
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
    public void exibirDados (){                   // Public void é Sem retorno
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Matricula do aluno: " + matricula);
        System.out.println("Curso do aluno: " + curso);
    }
}
