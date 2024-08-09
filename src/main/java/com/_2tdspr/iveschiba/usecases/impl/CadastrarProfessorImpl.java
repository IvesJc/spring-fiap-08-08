package com._2tdspr.iveschiba.usecases.impl;

import com._2tdspr.iveschiba.domains.Professor;
import com._2tdspr.iveschiba.usecases.CadastrarProfessor;

public class CadastrarProfessorImpl implements CadastrarProfessor {

    @Override
    public Professor executar(Professor professorParaSerCadastrado) {
        Professor professor = new Professor();
        professor.setPrimeiroNome(professorParaSerCadastrado.getPrimeiroNome());
        professor.setSobrenome(professorParaSerCadastrado.getSobrenome());
        professor.setDisciplina(professorParaSerCadastrado.getDisciplina());
        professor.setDocumento(professorParaSerCadastrado.getDocumento());

        return professor;
    }
}
