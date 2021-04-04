package br.edu.infnet.atmarcel.model.repository;

import br.edu.infnet.atmarcel.model.negocio.Livro;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILivroRepository extends CrudRepository<Livro, Integer> {
    @Query("from Livro p where p.usuario.id=:id")
    List<Livro> obterLista(Integer id, Sort by);
}
