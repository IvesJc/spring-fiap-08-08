package com._2tdspr.iveschiba.gateways;

import com._2tdspr.iveschiba.domains.Aluno;
import com._2tdspr.iveschiba.gateways.request.AlunoPostRequestDTO;
import com._2tdspr.iveschiba.gateways.response.AlunoResponseDTO;
import com._2tdspr.iveschiba.usecases.CadastrarAluno;
import com._2tdspr.iveschiba.usecases.impl.CadastrarAlunoImpl;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno/fiap")
@RequiredArgsConstructor
// Capaz de fazer um @Autowired sem sujar o codigo com varios @Autowired
@Validated
public class AlunoController {

//    @Autowired
    private final CadastrarAluno cadastrarAlunoService;

    @PostMapping
    public ResponseEntity<AlunoResponseDTO> createAluno(@RequestBody @Valid AlunoPostRequestDTO aluno){
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

    @GetMapping("{alunoId}")
    public ResponseEntity<Aluno> getAluno(@PathVariable("alunoId") String id){
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
