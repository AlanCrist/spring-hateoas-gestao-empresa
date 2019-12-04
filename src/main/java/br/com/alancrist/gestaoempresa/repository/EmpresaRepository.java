package br.com.alancrist.gestaoempresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alancrist.gestaoempresa.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	public List<Empresa> findByNomeContaining(String nome);
	
}
