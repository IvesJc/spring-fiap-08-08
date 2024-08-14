package com._2tdspr.iveschiba.gateways;

import com._2tdspr.iveschiba.domains.Aluno;
import com._2tdspr.iveschiba.usecases.impl.CadastrarAlunoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private CadastrarAlunoImpl cadastrarAlunoService;

    @PostMapping
    public ResponseEntity<Aluno> createAluno(@RequestBody Aluno aluno){
        Aluno newAluno = cadastrarAlunoService.createAluno(aluno);
        return ResponseEntity.ok(newAluno);
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> getAlunos(){
        return ResponseEntity.status(200).build();
    }

    @GetMapping("fiap/{alunoId}")
    public ResponseEntity<String> findById(@PathVariable("alunoId") String canario){
        return ResponseEntity.ok("Hello World aluno "+canario);
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
