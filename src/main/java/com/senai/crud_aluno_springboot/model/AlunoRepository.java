package com.senai.crud_aluno_springboot.model;

import com.senai.crud_aluno_springboot.controller.AlunoController;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, String> {

        }
