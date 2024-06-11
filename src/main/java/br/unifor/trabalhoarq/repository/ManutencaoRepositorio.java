package br.unifor.trabalhoarq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unifor.trabalhoarq.model.Manutencao;

@Repository
public interface ManutencaoRepositorio extends JpaRepository<Manutencao, Long> {
    
}
