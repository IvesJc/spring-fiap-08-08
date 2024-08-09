package com._2tdspr.iveschiba.usecases.impl;

import com._2tdspr.iveschiba.domains.Professor;
import com._2tdspr.iveschiba.usecases.CadastrarProfessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastrarProfessorImplTest {

    CadastrarProfessor cadastrarProfessor = new CadastrarProfessorImpl();

    @Test
    void testeCadastrarProfessor(){
        Professor professorASerCadastrado = new Professor();
        professorASerCadastrado.setPrimeiroNome("Joao");
        professorASerCadastrado.setSobrenome("Luiz");
        professorASerCadastrado.setDisciplina("Java");
        professorASerCadastrado.setDocumento("8796978");

        Professor professorCadastrado = cadastrarProfessor.executar(professorASerCadastrado);

        assertEquals(professorASerCadastrado.getPrimeiroNome(), professorCadastrado.getPrimeiroNome());
        assertEquals(professorASerCadastrado.getSobrenome(), professorCadastrado.getSobrenome());
        assertEquals(professorASerCadastrado.getDisciplina(), professorCadastrado.getDisciplina());
        assertEquals(professorASerCadastrado.getDocumento(), professorCadastrado.getDocumento());
    }
}