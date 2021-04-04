package br.edu.infnet.atmarcel.model.repository;

import br.edu.infnet.atmarcel.model.negocio.Usuario;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {

    @Query("from Usuario u where u.email=:email and u.senha=:senha")
    Usuario autenticacao(String email, String senha);

    @Query("from Usuario")
    List<Usuario> obterLista(Sort by);
}
