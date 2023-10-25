package com.generation.crudescola.controller;

import com.generation.crudescola.model.Aluno;
import com.generation.crudescola.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/alunos")
public class Controller {
    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public ResponseEntity<List<Aluno>> getAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getById(@PathVariable long id){
        return repository.findById(id).map(resp
                -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Aluno> Post(@RequestBody Aluno aluno){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(aluno));
    }

    @PutMapping
    public ResponseEntity<Aluno> Put(@RequestBody Aluno aluno){
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(aluno));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        repository.deleteById(id);
    }

}
