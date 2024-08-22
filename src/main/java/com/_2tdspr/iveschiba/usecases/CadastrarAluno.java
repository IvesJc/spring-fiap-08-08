package com._2tdspr.iveschiba.usecases;

import com._2tdspr.iveschiba.domains.Aluno;
import com._2tdspr.iveschiba.gateways.request.AlunoPostRequestDTO;
import org.springframework.stereotype.Service;

public interface CadastrarAluno {

    Aluno createAluno(AlunoPostRequestDTO alunoParaSerCadastrado);

    Aluno findByRm(String rm);
}
