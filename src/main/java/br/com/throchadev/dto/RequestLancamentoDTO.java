package br.com.throchadev.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class RequestLancamentoDTO {

    @NotNull
    @NotBlank
    private String valor;
    @NotNull
    @NotBlank
    private String formaPagamento;
    @NotNull
    @NotBlank
    private String data;
    @NotNull
    @NotBlank
    private String nomeCartao;
    @NotNull
    @NotBlank
    private String numero;
    @NotNull
    @NotBlank
    private String dataValidade;
    @NotNull
    @NotBlank
    private String cvv;
    @NotNull
    @NotBlank
    private String bandeira;
    @NotNull
    @NotBlank
    private String nome;
    @NotNull
    @NotBlank
    private String cpf;
}
