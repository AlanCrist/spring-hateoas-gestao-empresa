package br.com.alancrist.gestaoempresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alancrist.gestaoempresa.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

	public List<Departamento> findByNomeContaining(String nome);
	
}
