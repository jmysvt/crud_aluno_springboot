package com.senai.crud_aluno_springboot.controller;
import com.senai.crud_aluno_springboot.model.Aluno;
import com.senai.crud_aluno_springboot.model.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //ouvir as rquisições
@RequestMapping("/aluno")

public class AlunoController {


    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    public Aluno salvarAluno (@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @GetMapping
    public List<Aluno> getAllAluno(){
        return alunoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Aluno listarAlunoPorId(@PathVariable String id){
        return alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }





}
