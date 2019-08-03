package com.uds.pizzaria.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Entity
@Table(name = "sabor")
public class Sabor {

    private Long id;
    private transient String descricao;
    private transient Long tempo;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    @Transient
    @JsonProperty
    public String getDescricao() {
        return descricao;
    }

    @Transient
    @JsonProperty
    public Long getTempo() {
        return tempo;
    }
}
