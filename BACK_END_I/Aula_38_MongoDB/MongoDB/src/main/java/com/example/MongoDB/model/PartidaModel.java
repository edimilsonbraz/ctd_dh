package com.example.MongoDB.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document(collection = "partidas")
public class PartidaModel {

    @Id
    private Integer id;
    private String resultado;
    private EstadoModel estado;
    @Field(name = "equipe_local")
    private EquipeModel equipeLocal;
    @Field(name = "equipe_visitante")
    private EquipeModel equipeVisitante;

    public PartidaModel(){
    }


    @Override
    public String toString() {
        return "PartidaModel{" +
                "id=" + id +
                ", resultado='" + resultado + '\'' +
                ", estado=" + estado +
                ", equipeLocal=" + equipeLocal +
                ", equipeVisitante=" + equipeVisitante +
                '}';
    }
}
