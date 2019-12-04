package br.com.alancrist.gestaoempresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alancrist.gestaoempresa.model.Dependente;

public interface DependenteRepository extends JpaRepository<Dependente, Long> {

	public List<Dependente> findByNomeContaining(String nome);
	
}
