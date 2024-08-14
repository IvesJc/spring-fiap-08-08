package com._2tdspr.iveschiba.usecases.impl;

import com._2tdspr.iveschiba.domains.Aluno;
import com._2tdspr.iveschiba.usecases.CadastrarAluno;
import org.springframework.stereotype.Service;

@Service
public class CadastrarAlunoImpl implements CadastrarAluno {

    @Override
    public Aluno createAluno(Aluno alunoParaSerCadastrado) {
        Aluno cadastrado = new Aluno();
        cadastrado.setPrimeiroNome(alunoParaSerCadastrado.getPrimeiroNome());
        cadastrado.setSobrenome(alunoParaSerCadastrado.getSobrenome());
        cadastrado.setRegistro(alunoParaSerCadastrado.getRegistro());
        cadastrado.setDocumento(alunoParaSerCadastrado.getDocumento());
        cadastrado.setRm(alunoParaSerCadastrado.getRm());

        return cadastrado;
    }
}
