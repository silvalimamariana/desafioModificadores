/* Desenvolva uma classe Livro com os atributos privados titulo e autor.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um metodo exibirDetalhes que imprime o título e o autor do livro. */

public class Livro {


    private String titulo;
    private  String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo() {
        this.titulo =  titulo;
    }

    public void setAutor() {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDetalhes() {

        System.out.println("O autor é: " + autor);
        System.out.println("O título é: " + titulo + "\n");

    }

}
