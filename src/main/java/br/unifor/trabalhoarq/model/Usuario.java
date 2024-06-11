package br.unifor.trabalhoarq.model;

import jakarta.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class Usuario {

    private String nome;
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date dataDeNascimento;

    public Usuario() {}

    public Usuario(String nome, String cpf, Date dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}