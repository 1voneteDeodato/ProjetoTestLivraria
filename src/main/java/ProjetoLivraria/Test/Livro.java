package ProjetoLivraria.Test;

public class Livro {

    public Long id;
    public String autor;
    public String NomeDoLivro;
    public String categoria;

    public Livro(){

    }

    public Livro(Long id, String autor, String nomeDoLivro, String categoria) {
        this.id = id;
        this.autor = autor;
        NomeDoLivro = nomeDoLivro;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNomeDoLivro() {
        return NomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        NomeDoLivro = nomeDoLivro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}