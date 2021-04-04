package br.edu.infnet.atmarcel.model.service;

import br.edu.infnet.atmarcel.model.negocio.Cliente;
import br.edu.infnet.atmarcel.model.negocio.Usuario;
import br.edu.infnet.atmarcel.model.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    public void incluir(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void excluir(Integer id) {
        clienteRepository.deleteById(id);
    }

    public List<Cliente> obterLista() {
        return (List<Cliente>)clienteRepository.findAll();
    }
}
