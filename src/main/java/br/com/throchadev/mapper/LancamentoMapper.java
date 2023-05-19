package br.com.throchadev.mapper;

import br.com.throchadev.dto.RequestLancamentoDTO;
import br.com.throchadev.model.Lancamento;
import org.springframework.beans.BeanUtils;

public class LancamentoMapper {

    public static Lancamento dtoToEntity(RequestLancamentoDTO requestLancamentoDTO) {
        Lancamento lancamento = new Lancamento();
        BeanUtils.copyProperties(requestLancamentoDTO, lancamento);
        return lancamento;
    }
}
