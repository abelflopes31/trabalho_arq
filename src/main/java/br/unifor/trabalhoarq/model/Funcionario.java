package br.unifor.trabalhoarq.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Funcionario extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cargo;
    private String diasDisponiveis;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, Date dataDeNascimento, String cargo, String diasDisponiveis) {
        super(nome, cpf, dataDeNascimento);
        this.cargo = cargo;
        this.diasDisponiveis = diasDisponiveis;
    }

    public int getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDiasDisponiveis() {
        return diasDisponiveis;
    }

    public void setDiasDisponiveis(String diasDisponiveis) {
        this.diasDisponiveis = diasDisponiveis;
    }

    public void registrarEntrada() {
        System.out.println("Entrada registrada.");
    }

    public void registrarSaida() {
        System.out.println("Saída registrada.");
    }
}
