package br.edu.infnet.atmarcel.controller;

import br.edu.infnet.atmarcel.model.negocio.Usuario;
import br.edu.infnet.atmarcel.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AcessoController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/")
    public String init() {
        return "login";
    }

    @GetMapping(value = "/home")
    public String home(Model model) {
        return "index";
    }
}
