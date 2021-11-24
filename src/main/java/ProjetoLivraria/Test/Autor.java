package ProjetoLivraria.Test;

import javax.persistence.*;

@Entity(name = "livroCadastroDeAutor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(nullable = false, length = 20)
    public String nome;


    public Long numPaginas;

    @Column(nullable = false, length = 10 )
    public String categoria;

    @Column(nullable = false, length = 30)
    public String endereco;




    public Autor() {

    }


    public Autor(Long id, String nome, Long numPaginas, String categoria, String endereco) {

        this.id = id;
        this.nome = nome;
        this.numPaginas = numPaginas;
        this.categoria = categoria;
        this.endereco = endereco;
    }

   // public void cadastrarAutor() {

  //      System.out.println(nome + " " + id);

  //  }

  //  public void cadastrarCategoria() {

  //      System.out.println(nome + " " + categoria);
  //  }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Long numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
