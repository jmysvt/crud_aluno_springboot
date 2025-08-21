package com.senai.crud_aluno_springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Aluno {

        private String nome;
    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
        private String id;
        private int cpf;
        private int idAcesso;
        private String email;
        private String curso;

    public Aluno(String nome, String id, int cpf, int idAcesso, String email, String curso) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
        this.idAcesso = idAcesso;
        this.email = email;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdAcesso() {
        return idAcesso;
    }

    public void setIdAcesso(int idAcesso) {
        this.idAcesso = idAcesso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}
