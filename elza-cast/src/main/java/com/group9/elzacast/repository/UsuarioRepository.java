package com.group9.elzacast.repository;

import com.group9.elzacast.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByUsuario(String Usuario);

    public Optional<Usuario> findByTelefone(String telefone);
}
