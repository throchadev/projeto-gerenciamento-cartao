package br.com.throchadev.service;

import br.com.throchadev.builders.ConsolidadoBuilder;
import br.com.throchadev.dto.ConsolidadoDTO;
import br.com.throchadev.dto.RequestLancamentoDTO;
import br.com.throchadev.mapper.LancamentoMapper;
import br.com.throchadev.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public void createLancamento(RequestLancamentoDTO requestLancamentoDTO) {

        var lancamento = LancamentoMapper.dtoToEntity(requestLancamentoDTO);
        lancamentoRepository.save(lancamento);

    }

    public ConsolidadoDTO getConsolidadoDiario(String data) {

        var consolidado = lancamentoRepository.findByData(data);
        if (!consolidado.isEmpty()){
            var somaValor = consolidado.stream().mapToDouble(v -> Double.parseDouble(v.getValor())).sum();
            var consolidadoDTO = ConsolidadoBuilder.getConsolidadoDTO(consolidado, somaValor);
            return consolidadoDTO;
        }
        return null;
    }


}
