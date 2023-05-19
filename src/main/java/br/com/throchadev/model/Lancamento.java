package br.com.throchadev.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tableLancamento")
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String valor;
    private String formaPagamento;
    private String data;
    private String nomeCartao;
    private String numero;
    private String dataValidade;
    private String cvv;
    private String bandeira;
    private String nome;
    private String cpf;
}
