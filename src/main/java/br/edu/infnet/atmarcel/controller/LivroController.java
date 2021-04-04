package br.edu.infnet.atmarcel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivroController {

    @GetMapping(value = "/livro")
    public String showLivro() {
        return "livro/detalhe";
    }
}
