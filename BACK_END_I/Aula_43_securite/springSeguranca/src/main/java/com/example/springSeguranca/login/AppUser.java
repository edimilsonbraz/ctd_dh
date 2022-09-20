package com.example.springSeguranca.login;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class AppUser implements UserDetails {

    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)

    private Long id;
    private String nome;
    private String username;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private AppUserRoles appUserRoles;


    public AppUser(String nome, String username, String email, String password, AppUserRoles appUserRoles) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.password = password;
        this.appUserRoles = appUserRoles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //Utiliza esse método para pegar algumas regras do nosso usuário que não vemos
        //ou seja, elas são passadas no processamento da aplicação
        SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(appUserRoles.name());

        return Collections.singleton(grantedAuthority);
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
