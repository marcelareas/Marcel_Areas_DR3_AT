package br.edu.infnet.atmarcel.model.repository;

import br.edu.infnet.atmarcel.model.negocio.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer> {
}
