package br.com.alancrist.gestaoempresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alancrist.gestaoempresa.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	public List<Funcionario> findByNomeContaining(String nome);
	
}
