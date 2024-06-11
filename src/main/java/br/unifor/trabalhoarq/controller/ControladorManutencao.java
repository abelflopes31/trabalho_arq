package br.unifor.trabalhoarq.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifor.trabalhoarq.model.Manutencao;
import br.unifor.trabalhoarq.service.ManutencaoService;

@RestController
@RequestMapping("/manutencoes")
public class ControladorManutencao {

    private final ManutencaoService service;

    public ControladorManutencao(ManutencaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Manutencao> listarManutencoes() {
        return service.listarManutencoes();
    }

    @GetMapping("/{id}")
    public Manutencao pegarDetalhesManutenoes(@PathVariable Long id) {
        return service.pegarDetalhesManutencao(id);
    }

    @PostMapping
    public void adicionarManutencao(@RequestBody Manutencao manutencao) {
        service.adicionarManutencao(manutencao);
    }

    @DeleteMapping("/{id}")
    public void removerManutencao(@PathVariable Long id) {
        service.removerManutencao(id);
    }
}
