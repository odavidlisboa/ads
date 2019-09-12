package br.usjt.previsaodotempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsaodotempo.model.Periodo;

public interface PrevisaoRepository extends JpaRepository<Periodo, Long> {
}
