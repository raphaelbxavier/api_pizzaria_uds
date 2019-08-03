package com.uds.pizzaria.repository.projection;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResumoPizza {

    private Long id;
    private String tamanho;
    private String sabor;
    private List<String> adicionais;
    private Long valor;
    private Long tempo;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setAdicionais(List<String> adicionais) {
        this.adicionais = adicionais;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public void setTempo(Long tempo) {
        this.tempo = tempo;
    }

    public Long getId() {
        return id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public List<String> getAdicionais() {
        return adicionais;
    }

    public Long getValor() {
        return valor;
    }

    public Long getTempo() {
        return tempo;
    }
}
