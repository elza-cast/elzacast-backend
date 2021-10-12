package com.group9.elzacast.service;

import com.group9.elzacast.model.Contato;
import com.group9.elzacast.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContatoService {


    @Autowired
    private ContatoRepository contatoRepository;

    public Contato salvar(Contato contato){
        return contatoRepository.save(contato);
    }

    public List<Contato> listaContatos(Long usuario){
        return contatoRepository.findAllByUsuarioId(usuario);
    }

    public void deletar(long id) {
        contatoRepository.deleteById(id);
    }
}

