package br.com.throchadev.builders;

import br.com.throchadev.dto.ConsolidadoDTO;
import br.com.throchadev.model.Lancamento;

import java.util.List;

public class ConsolidadoBuilder {

    public static ConsolidadoDTO getConsolidadoDTO(List<Lancamento> consolidado, double somaValor) {
        return ConsolidadoDTO.builder()
                .valor(String.valueOf(somaValor))
                .data(consolidado.get(0).getData())
                .build();
    }
}
