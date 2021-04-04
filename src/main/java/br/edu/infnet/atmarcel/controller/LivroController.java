package br.edu.infnet.atmarcel.controller;

import br.edu.infnet.atmarcel.model.negocio.Livro;
import br.edu.infnet.atmarcel.model.negocio.Usuario;
import br.edu.infnet.atmarcel.model.service.ClienteService;
import br.edu.infnet.atmarcel.model.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class LivroController {

    @Autowired
    private LivroService livroService;
    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/livro")
    public String showLivro(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("lista", livroService.obterLista(usuario));
        model.addAttribute("clientes", clienteService.obterLista(usuario));
        return "livro/detalhe";
    }


    @PostMapping(value = "/livro/incluir")
    public String incluir(Livro livro, @SessionAttribute("user") Usuario usuario) {
        livro.setUsuario(usuario);
        livroService.incluir(livro);
        return "redirect:/livro";
    }

    @GetMapping(value = "/livro/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id) {
        livroService.excluir(id);
        return "redirect:/livro";
    }
}
