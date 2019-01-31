package com.leporonitech.comercial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leporonitech.comercial.model.Oportunidade;

public interface OportunidadeRepository extends JpaRepository<Oportunidade, Long> {
	
	Optional<Oportunidade> findByDescricaoAndNomeProspecto(String descricao, String nomeProspecto);

}
