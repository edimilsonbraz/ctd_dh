package com.example.MongoDB.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "torneios")
public class TorneioModel {

    private Integer id;
    private String nome;
    private String pais;
    private String descricaoTorneio;

    public TorneioModel() {
    }



    @Override
    public String toString() {
        return "TorneioModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pais='" + pais + '\'' +
                ", descricaoTorneio='" + descricaoTorneio + '\'' +
                '}';
    }
}
