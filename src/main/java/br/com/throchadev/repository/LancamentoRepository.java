package br.com.throchadev.repository;

import br.com.throchadev.model.Lancamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LancamentoRepository extends CrudRepository<Lancamento, Long> {

    List<Lancamento> findByData(String data);
}
