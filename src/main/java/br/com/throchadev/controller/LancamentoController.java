package br.com.throchadev.controller;

import br.com.throchadev.dto.ConsolidadoDTO;
import br.com.throchadev.dto.RequestLancamentoDTO;
import br.com.throchadev.service.LancamentoService;
import br.com.throchadev.utils.ValidaData;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/lancamento")
public class LancamentoController {

    @Autowired
    private LancamentoService lancamentoService;

    @PostMapping
    @ApiOperation(value = "Salva um Lançamento")
    public ResponseEntity<Void> salvarLancamento(@Valid @RequestBody RequestLancamentoDTO requestLancamentoDTO){
        lancamentoService.createLancamento(requestLancamentoDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/consolidado/{data}")
    @ApiOperation(value = "Retorna o consolidado Diário")
    public ResponseEntity<ConsolidadoDTO> getConsolidadoDiario(@PathVariable String data){
        if(ValidaData.isValidDate(data)){
            var consolidado = lancamentoService.getConsolidadoDiario(data);
            return new ResponseEntity<>(consolidado, HttpStatus.OK);
        }
        return new ResponseEntity<>(ConsolidadoDTO.builder().mensagemErro("Data está inválida.").build(), HttpStatus.BAD_REQUEST);
    }
}
