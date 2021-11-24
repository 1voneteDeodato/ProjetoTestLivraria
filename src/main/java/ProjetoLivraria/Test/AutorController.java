package ProjetoLivraria.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AutorController {

    @Autowired
    AutorRepository repository;

    @GetMapping("/autor")
    public List<Autor> getAllAutor() {
        return repository.findAll();
    }

    @GetMapping("/autor/{id}")
    public Autor getAutoryId(@PathVariable Long id) {
        Optional<Autor> autor = repository.findById(id);
        return autor.orElse(null);
    }


   @PostMapping("/autor")
    public Autor saveAutor(@RequestBody Autor autor) {
        return repository.save(autor);
    }

    @DeleteMapping("/autor/{id}")
    public void deleteAutor(@PathVariable long id) {

        repository.deleteById(id);
    }
}




