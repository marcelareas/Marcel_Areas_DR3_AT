package br.edu.infnet.atmarcel.controller;


import br.edu.infnet.atmarcel.model.negocio.Usuario;
import br.edu.infnet.atmarcel.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "/usuario/login")
    public String login(Model model, @RequestParam String email, @RequestParam String senha) {

        Usuario usuario = usuarioService.autenticacao(email, senha);

        if (usuario != null) {
            model.addAttribute("user", usuario);
            return "/index";
        }

        model.addAttribute("erro", "Verifique se o e-mail e a senha estão corretos e tente novamente.");

        return "login";
    }

    @GetMapping(value = "/usuario")
    public String showUsuario(Model model) {

        model.addAttribute("lista", usuarioService.obterLista());
        return "usuario/detalhe";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {

        usuarioService.incluir(usuario);
        return "redirect:/usuario";
    }

    @GetMapping(value = "/usuario/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id) {

        try {
            usuarioService.excluir(id);
        } catch (Exception e) {

            model.addAttribute("erro", "Não é possível excluir um usuário que possui clientes.");
            return showUsuario(model);
        }

        return "redirect:/usuario";
    }
}
