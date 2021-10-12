package com.group9.elzacast.service;

import java.nio.charset.Charset;
import java.util.Optional;

import com.group9.elzacast.helper.CustomNotFoundException;
import com.group9.elzacast.model.UserLogin;
import com.group9.elzacast.model.Usuario;
import com.group9.elzacast.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class UsuarioService {



    private UsuarioRepository repository;

    @Autowired
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario CadastrarUsuario(Usuario usuario) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String senhaEncoder = encoder.encode(usuario.getSenha());
        usuario.setSenha(senhaEncoder);

        return repository.save(usuario);
    }



    public Optional<UserLogin> Logar(Optional<UserLogin> user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        Optional<Usuario> usuario = repository.findByTelefone(user.get().getTelefone());
            if (usuario.isPresent()) {
                    if (encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
                        String auth = user.get().getUsuario() + ":" + user.get().getSenha();
                        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
                        String authHeader = "Basic " + new String(encodedAuth);
                        user.get().setToken(authHeader);
                        user.get().setUsuario(usuario.get().getUsuario());
                        user.get().setTelefone(usuario.get().getTelefone());
                        return user;
                    }
            }
        return null;
    }
}
