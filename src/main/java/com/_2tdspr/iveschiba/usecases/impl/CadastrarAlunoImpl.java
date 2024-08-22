package com._2tdspr.iveschiba.usecases.impl;

import com._2tdspr.iveschiba.domains.Aluno;
import com._2tdspr.iveschiba.gateways.request.AlunoPostRequestDTO;
import com._2tdspr.iveschiba.infra.config.db.repository.AlunoRepository;
import com._2tdspr.iveschiba.usecases.CadastrarAluno;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component: Seria um @Bean generalista
@Service
@RequiredArgsConstructor
public class CadastrarAlunoImpl implements CadastrarAluno {

    private final AlunoRepository alunoRepository;

    @Override
    public Aluno createAluno(AlunoPostRequestDTO alunoParaSerCadastrado) {
        Aluno cadastrado = new Aluno();
        cadastrado.setId(alunoParaSerCadastrado.id());
        cadastrado.setPrimeiroNome(alunoParaSerCadastrado.primeiroNome());
        cadastrado.setSobrenome(alunoParaSerCadastrado.sobrenome());
        cadastrado.setRegistro(alunoParaSerCadastrado.registro());
        cadastrado.setDocumento(alunoParaSerCadastrado.documento());
        cadastrado.setRm(alunoParaSerCadastrado.rm());

        alunoRepository.save(cadastrado);
        return cadastrado;
    }


    @Override
    public Aluno findByRm(String rm) {
//        Optional<Aluno> optionalAluno = alunoList.fi
        return null;
    }
}
