package com.example.springSeguranca.login;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {//classe de configuração
    @Bean//Esse método da classe terá que ser executado logo no começo da aplicação
    //Para fazer a verificar se a senha é a mesma no banco de dados
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
