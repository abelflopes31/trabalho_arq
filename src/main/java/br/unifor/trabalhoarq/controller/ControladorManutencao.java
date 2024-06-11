package br.unifor.trabalhoarq.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifor.trabalhoarq.facade.AcademiaFacade;
import br.unifor.trabalhoarq.model.Manutencao;

@RestController
@RequestMapping("/manutencoes")
public class ControladorManutencao {

    private final AcademiaFacade academiaFacade;

    public ControladorManutencao(AcademiaFacade academiaFacade) {
        this.academiaFacade = academiaFacade;
    }

    @GetMapping
    public List<Manutencao> listarManutencoes() {
        return academiaFacade.listarManutencoes();
    }

    @GetMapping("/{id}")
    public Manutencao pegarDetalhesManutencao(@PathVariable Long id) {
        return academiaFacade.pegarDetalhesManutencao(id);
    }

    @PostMapping
    public void adicionarManutencao(@RequestBody Manutencao manutencao) {
        academiaFacade.adicionarManutencao(manutencao);
    }

    @DeleteMapping("/{id}")
    public void removerManutencao(@PathVariable Long id) {
        academiaFacade.removerManutencao(id);
    }
}
