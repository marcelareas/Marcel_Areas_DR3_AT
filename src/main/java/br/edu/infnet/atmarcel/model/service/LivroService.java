package br.edu.infnet.atmarcel.model.service;

import br.edu.infnet.atmarcel.model.negocio.Livro;
import br.edu.infnet.atmarcel.model.negocio.Usuario;
import br.edu.infnet.atmarcel.model.repository.ILivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private ILivroRepository livroRepository;

    public void incluir(Livro livro) {
        livroRepository.save(livro);
    }

    public void excluir(Integer id) {
        livroRepository.deleteById(id);
    }

    public List<Livro> obterLista() {
        return (List<Livro>)livroRepository.findAll();
    }

    public List<Livro> obterLista(Usuario usuario) {
        return livroRepository.obterLista(usuario.getId());
    }
}
