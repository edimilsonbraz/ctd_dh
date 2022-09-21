package com.example.demo.model;

public class AuthenticationResponse {
    //Essa classe vai voltar com o token, necessariamento somente para fazer o teste
    private final String jwt;

    public AuthenticationResponse(String jwt) {

        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
