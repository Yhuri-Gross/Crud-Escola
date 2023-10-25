package com.generation.crudescola.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nm_nome")
    private String nome;
    @Column(name = "idade_aluno")
    private int idade;

    @Column(name = "nm_professor")
    private String professor;

    @Column(name = "cd_sala")
    private int numeroSala;

    @Column(name = "cd_nota_primeir")
    private int notaPrimeiroSemestre;

    @Column(name = "cd_nota_segundo")
    private int notaSegundoSemestre;

    public int getNotaPrimeiroSemestre() {
        return notaPrimeiroSemestre;
    }

    public void setNotaPrimeiroSemestre(int notaPrimeiroSemestre) {
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    public int getNotaSegundoSemestre() {
        return notaSegundoSemestre;
    }

    public void setNotaSegundoSemestre(int notaSegundoSemestre) {
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

}
