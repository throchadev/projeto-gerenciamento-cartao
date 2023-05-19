package br.com.throchadev.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsolidadoDTO {

    private String valor;
    private String data;
    private String mensagemErro;
}
