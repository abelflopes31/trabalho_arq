package br.unifor.trabalhoarq.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.unifor.trabalhoarq.model.Manutencao;
import br.unifor.trabalhoarq.repository.ManutencaoRepositorio;

@Service
public class ManutencaoService {
    private ManutencaoRepositorio repositorio;

    public ManutencaoService(ManutencaoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionarManutencao(Manutencao Manutencao) {
        repositorio.save(Manutencao);
    }

    public List<Manutencao> listarManutencoes() {
        return repositorio.findAll();
    }

    public Manutencao pegarDetalhesManutencao(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    public void removerManutencao(Long id) {
        repositorio.deleteById(id);
    }
}
