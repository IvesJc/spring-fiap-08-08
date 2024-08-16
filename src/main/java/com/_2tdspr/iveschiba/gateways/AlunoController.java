package com._2tdspr.iveschiba.gateways;

import com._2tdspr.iveschiba.domains.Aluno;
import com._2tdspr.iveschiba.gateways.request.AlunoPostRequestDTO;
import com._2tdspr.iveschiba.gateways.response.AlunoResponseDTO;
import com._2tdspr.iveschiba.usecases.impl.CadastrarAlunoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno/fiap")
public class AlunoController {

    @Autowired
    private CadastrarAlunoImpl cadastrarAlunoService;

    @PostMapping
    public ResponseEntity<AlunoResponseDTO> createAluno(@RequestBody AlunoPostRequestDTO aluno){
        Aluno newAluno = cadastrarAlunoService.createAluno(aluno);

        AlunoResponseDTO alunoResponseDTO = AlunoResponseDTO.builder().
                primeiroNome(newAluno.getPrimeiroNome()).
                sobrenome(newAluno.getSobrenome()).
                documento(newAluno.getDocumento()).
                registro(newAluno.getRegistro()).
                build();

        return ResponseEntity.ok(alunoResponseDTO);
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> getAlunos(){
        return ResponseEntity.status(200).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> updateAluno(@PathVariable Integer id,
                                          @RequestBody Aluno aluno){
        return ResponseEntity.status(200).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Aluno> deleteAluno(@PathVariable Integer id){
        return ResponseEntity.status(204).build();
    }
}
