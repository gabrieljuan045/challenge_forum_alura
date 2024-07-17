package br.com.alura.forumAlura.domain.topico;

import br.com.alura.forumAlura.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico,Long> {

    Optional<Topico> findByTituloAndMensagem(String titulo, String mensagem);

    Optional<Topico> findByIdAndAutor(Long id, Usuario autor);
}
