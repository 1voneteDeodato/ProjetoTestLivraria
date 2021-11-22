package ProjetoLivraria.Test;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;


@RestController
public class LivroController {

    @Autowired
    LivroRepository repository;

    @GetMapping("/livro")
    public List<Livro> getAllLivros() {
        return repository.findAll();
    }


    @GetMapping("/livro/{id}")
    public Livro getLivroById(@PathVariable Long id) {
        return repository.findAll(id);
    }

    @PostMapping("/livro")
    public Livro saveLivro(@RequestBody Livro livro) {
        return repository.save(livro);
    }

    @DeleteMapping("/livro/{id}")
    public void deleteLivro(@PathVariable long id) {
        repository.deleteById(id);
    }
}




