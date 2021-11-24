package ProjetoLivraria.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


    @RestController
    public class LivroController {

        @Autowired
        LivroRepository repository;

        @GetMapping("/livro")
        public List<Livro> getAllLivro() {
            return repository.findAll();
        }

        @GetMapping("/livro/{id}")
        public Livro getLivroById(@PathVariable Long id) {
            Optional<Livro> livro = repository.findById(id);
            return livro.orElse(null);
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

