package br.com.alura.forumAlura.controller;

import br.com.alura.forumAlura.domain.usuario.DadosRegistroUsuario;
import br.com.alura.forumAlura.domain.usuario.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import br.com.alura.forumAlura.domain.usuario.DadosUsuario;

import java.net.URI;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController() {
        service = null;
    }

    @PostMapping
    public ResponseEntity<DadosUsuario> registrar(@Valid @RequestBody DadosRegistroUsuario dados, UriComponentsBuilder builder) {
        DadosUsuario dadosUsuario = service.registrar(dados);
        URI uri = builder.path("/usuarios/{id}").buildAndExpand(dadosUsuario.id()).toUri();
        return ResponseEntity.created(uri).body(dadosUsuario);
    }
}
