package br.edu.infnet.atmarcel.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    @GetMapping(value = "/cliente")
    public String showCliente() {
        return "cliente/detalhe";
    }
}
