package ProjetoLivraria.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class CategoriaController {

    @Autowired
    CategoriaRepository repository;

    @GetMapping("/categoria")
    public List<Categoria> getAllCategoria() {
        return repository.findAll();
    }

    @GetMapping("/categoria/{id}")
    public Categoria getCategoriaById(@PathVariable Long id) {
        Optional<Categoria> categoria = repository.findById(id);
        return categoria.orElse(null);
    }


    @PostMapping("/categoria")
    public Categoria saveCategoria(@RequestBody Categoria categoria) {
        return repository.save(categoria);
    }

    @DeleteMapping("/categoria/{id}")
    public void deleteCategoria(@PathVariable long id) {

        repository.deleteById(id);
    }
}

