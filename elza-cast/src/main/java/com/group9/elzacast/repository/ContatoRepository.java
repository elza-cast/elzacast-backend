package com.group9.elzacast.repository;

import com.group9.elzacast.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
    List<Contato> findAllByUsuarioId(Long usuario);
}
