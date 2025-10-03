public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Submerged: Uma Competição Tropical");
        livro1.setAutor("R.L Barbosa");

        livro1.exibirInformacoes();
        livro1.emprestar();
        livro1.emprestar();
        livro1.devolver();
        livro1.devolver();
        livro1.exibirInformacoes();
    }
}

class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado = false;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro foi emprestado com sucesso.");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro foi devolvido com sucesso.");
        } else {
            System.out.println("Este livro não está emprestado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n--- Dados do Livro ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
    }
}
