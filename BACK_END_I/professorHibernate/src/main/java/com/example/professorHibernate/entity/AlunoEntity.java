package com.example.professorHibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Aluno")
public class AlunoEntity {

    @Id
    @SequenceGenerator(name = "aluno_sequence", sequenceName = "aluno_sequence", allocationSize = 1)
    //Vai criar e controlar toda a criação dos nossos ids

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_sequence")
    //Será a forma que essa sequencia será gerada
    private Long id;
    private String nome;
    private String idade;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    //São vários alunos para um professor
    //cascadeType.Remove -- quando eu remover o professor, todos os alunos que estiverem associados ao professor
    //serão removidos tambem.
    @JoinColumn(name = "professor_id") //Onde ele faz join com a tabela professor
    private ProfessorEntity professorEntity;

    public AlunoEntity() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
