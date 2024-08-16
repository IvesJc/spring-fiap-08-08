package com._2tdspr.iveschiba.usecases.impl;

import com._2tdspr.iveschiba.domains.Aluno;
import com._2tdspr.iveschiba.gateways.request.AlunoPostRequestDTO;
import com._2tdspr.iveschiba.usecases.CadastrarAluno;
import org.springframework.stereotype.Service;

@Service
public class CadastrarAlunoImpl implements CadastrarAluno {


    @Override
    public Aluno createAluno(AlunoPostRequestDTO alunoParaSerCadastrado) {
        Aluno cadastrado = new Aluno();
        cadastrado.setId(alunoParaSerCadastrado.id());
        cadastrado.setPrimeiroNome(alunoParaSerCadastrado.primeiroNome());
        cadastrado.setSobrenome(alunoParaSerCadastrado.sobrenome());
        cadastrado.setRegistro(alunoParaSerCadastrado.registro());
        cadastrado.setDocumento(alunoParaSerCadastrado.documento());
        cadastrado.setRm(alunoParaSerCadastrado.rm());

        return cadastrado;
    }

    @Override
    public Aluno findByRm(String rm) {
//        Optional<Aluno> optionalAluno = alunoList.fi
        return null;
    }
}
