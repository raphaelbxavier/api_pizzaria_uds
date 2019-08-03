package com.uds.pizzaria.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Entity
@Table(name = "pizza")
public class Pizza {

    private transient Long valor;
    private transient Long tempo;
    private Tamanho tamanho;
    private Sabor sabor;
    private Long id;
    private transient Set<Adicional> adicionais;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idtamanho")
    public Tamanho getTamanho() {
        return tamanho;
    }

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idsabor")

    public Sabor getSabor() {
        return sabor;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(name = "pizza_adicionais", joinColumns = @JoinColumn(name = "idpizza"), inverseJoinColumns = @JoinColumn(name = "idadicional"))

    @Transient
    @JsonProperty
    public Set<Adicional> getAdicionais() {
        return adicionais;
    }

    @Transient
    @JsonProperty
    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    @Transient
    @JsonProperty
    public Long getTempo() {
        return tempo;
    }

    public void setTempo(Long tempo) {
        this.tempo = tempo;
    }
}
