package br.unifor.trabalhoarq.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.unifor.trabalhoarq.model.Manutencao;
import br.unifor.trabalhoarq.service.ManutencaoService;

@Component
public class AcademiaFacade {

    private final ManutencaoService manutencaoService;

    @Autowired
    public AcademiaFacade(ManutencaoService manutencaoService) {
        this.manutencaoService = manutencaoService;
    }

    public void adicionarManutencao(Manutencao manutencao) {
        manutencaoService.adicionarManutencao(manutencao);
    }

    public List<Manutencao> listarManutencoes() {
        return manutencaoService.listarManutencoes();
    }

    public Manutencao pegarDetalhesManutencao(Long id) {
        return manutencaoService.pegarDetalhesManutencao(id);
    }

    public void removerManutencao(Long id) {
        manutencaoService.removerManutencao(id);
    }
}
