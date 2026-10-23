package com.example.demo.Controller;

import com.example.demo.Model.Usuarios;
import com.example.demo.Repository.UsuarioRepository;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/cadastro")
    public String Getcadastro(Model usuario){
        usuario.addAttribute("usuario", usuarioRepository.findAll());
        return "cadastrar";
    }

    @PostMapping("/cadastro")
    public String cadastrar(@ModelAttribute Usuarios usuario){

        usuarioRepository.save(usuario);
        return "redirect:/login";
    }
}
