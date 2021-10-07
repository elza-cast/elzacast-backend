package com.group9.elzacast.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLogin {
    private long id;
    private String usuario;
    private String telefone;
    private String senha;
    private String token;

}
