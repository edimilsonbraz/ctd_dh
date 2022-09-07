package com.example.professorHibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Professor") //Define o nome da tabela
public class ProfessorEntity {

    @Id
    @SequenceGenerator(name = "professor_sequence", sequenceName = "professor_sequence", allocationSize = 1)
    //Vai criar e controlar toda a criação dos nossos ids

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professor_sequence")
    //Será a forma que essa sequencia será gerada
    private Long id;
    private String nome;
    private String titulo;

    @OneToMany(mappedBy = "professorEntity", fetch = FetchType.LAZY)
    //O fetch indica que quando eu trouxer os professores não trazer os alunos juntos
   // porque teria um trafego muito grande de dados
    private Set<AlunoEntity> alunos = new HashSet<>();

    public ProfessorEntity(){

    }

    public ProfessorEntity(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
