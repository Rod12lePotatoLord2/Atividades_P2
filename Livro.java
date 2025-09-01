public class Livro {
    String titulo, autor;
        int paginas;
        boolean emprestado = false;

        public String getTitulo(){
            return titulo;
        }
        public void setTitulo(String titulo){
            this.titulo = titulo;
        }
        public String getAutor(){
            return autor;
        }
        public void setAutor(String autor){
            this.autor = autor;
        }
        public int getPaginas(){
            return paginas;
        }
        public void setPaginas(int paginas){
            this.paginas = paginas;
        }
        public void emprestar(){
            if (!emprestado) {
                emprestado = true;
                System.out.println("O Livro foi emprestado");
            }
            else {
                System.out.println("O Livro está disponível para locação");
            }
        }
        public void devolver(){
            if (emprestado) {
                emprestado = false;
                System.out.println("Livro devolvido");
            }
            else {
                System.out.println("Este livro não foi emprestado");
            }
        }
        public void exibirInformacoes(){
            System.out.println("\n--- Dados do Livro ---");
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Paginas: " + paginas);
            System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
        }
    }