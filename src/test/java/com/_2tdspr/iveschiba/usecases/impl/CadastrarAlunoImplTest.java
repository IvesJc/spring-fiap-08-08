package com._2tdspr.iveschiba.usecases.impl;

import com._2tdspr.iveschiba.domains.Aluno;
import com._2tdspr.iveschiba.usecases.CadastrarAluno;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastrarAlunoImplTest {

    CadastrarAluno cadastrarAluno = new CadastrarAlunoImpl();

    @Test
    @DisplayName("Testa se as infos do objeto aluno a ser cadastrado foram devidamente copiadas para um " +
            "novo objeto")
    void testeExecutarCadastroAluno(){

        // Dado uma condição, arrange:
        Aluno alunoASerCadastrado = new Aluno();
        alunoASerCadastrado.setPrimeiroNome("Ives");
        alunoASerCadastrado.setSobrenome("Chiba");
        alunoASerCadastrado.setDocumento("46988456");
        alunoASerCadastrado.setRegistro("dasdsa");

        // Quando algo acontecer, act:
        Aluno alunoCadastrado = cadastrarAluno.executar(alunoASerCadastrado);

        // Entao verifique uma determinada info, assert
        assertEquals(alunoASerCadastrado.getPrimeiroNome(), alunoCadastrado.getPrimeiroNome());
        assertEquals(alunoASerCadastrado.getSobrenome(), alunoCadastrado.getSobrenome());
        assertEquals(alunoASerCadastrado.getDocumento(), alunoCadastrado.getDocumento());
        assertEquals(alunoASerCadastrado.getRegistro(), alunoCadastrado.getRegistro());
    }
}