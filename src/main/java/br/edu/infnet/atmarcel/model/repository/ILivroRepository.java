package br.edu.infnet.atmarcel.model.repository;

import br.edu.infnet.atmarcel.model.negocio.Livro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILivroRepository extends CrudRepository<Livro, Integer> {

}
